/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.service;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseOrderReleaseService {
    public Assessment assess(Request request) {
        List<String> blockers = new ArrayList<>();
        List<String> actions = new ArrayList<>();
        if (!request.contractActive()) blockers.add("客户框架合同未生效");
        if (!request.agreementPriceMatched()) blockers.add("订单价格与有效协议价不一致");
        if (!request.creditApproved()) blockers.add("订单未通过授信审批");
        if (request.availableInventory() < request.requestedQuantity()) blockers.add("可订库存不足");
        if (!request.taxProfileValid()) blockers.add("购方税务资料无效");
        if (request.exportControlled() && !request.exportLicenseValid()) blockers.add("出口管制许可缺失或失效");
        if (!blockers.isEmpty()) {
            actions.add("保持订单冻结，关闭合同、价格、信用、库存或合规阻断项");
            return new Assessment(Decision.BLOCKED, false, blockers, actions);
        }
        if (!request.deliveryPromiseConfirmed() || !request.purchaseOrderAttached()) {
            if (!request.deliveryPromiseConfirmed()) actions.add("由供应链确认承诺交期");
            if (!request.purchaseOrderAttached()) actions.add("补充客户采购订单或授权凭证");
            return new Assessment(Decision.REVIEW, false, blockers, actions);
        }
        actions.add("释放订单并固化价格、信用、库存与合规快照");
        return new Assessment(Decision.RELEASE, true, blockers, actions);
    }

    public record Request(@NotBlank String orderNo, @NotBlank String customerCode,
                          boolean contractActive, boolean agreementPriceMatched,
                          boolean creditApproved, @Min(1) int requestedQuantity,
                          @Min(0) int availableInventory, boolean taxProfileValid,
                          boolean exportControlled, boolean exportLicenseValid,
                          boolean deliveryPromiseConfirmed, boolean purchaseOrderAttached) {}
    public record Assessment(Decision decision, boolean releasable, List<String> blockers,
                             List<String> actions) {}
    public enum Decision { RELEASE, REVIEW, BLOCKED }
}
