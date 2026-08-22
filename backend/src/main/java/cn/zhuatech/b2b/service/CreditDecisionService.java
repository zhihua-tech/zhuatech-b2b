/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.service;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Service
public class CreditDecisionService {
    public Result evaluate(Request request) {
        BigDecimal projectedExposure = request.outstandingBalance().add(request.orderAmount());
        BigDecimal utilization = request.creditLimit().signum() == 0 ? BigDecimal.valueOf(999)
            : projectedExposure.divide(request.creditLimit(), 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
        int score = Math.min(100, (int) Math.round(Math.max(0, utilization.doubleValue() - 70)
            + Math.min(30, request.overdueDays() * 2) + Math.min(20, request.fulfillmentIssueCount() * 5)));
        String decision = projectedExposure.compareTo(request.creditLimit()) > 0 || score >= 70 ? "BLOCK"
            : score >= 40 ? "REVIEW" : "APPROVE";
        List<String> actions = new ArrayList<>();
        if (projectedExposure.compareTo(request.creditLimit()) > 0) actions.add("申请临时额度或调整预付款比例");
        if (request.overdueDays() > 0) actions.add("结清逾期账款后再释放订单");
        if (request.fulfillmentIssueCount() > 0) actions.add("复核未关闭履约争议");
        if (actions.isEmpty()) actions.add("按标准授信流程释放订单");
        return new Result(request.accountName(), projectedExposure, utilization.setScale(2, RoundingMode.HALF_UP), score, decision, actions);
    }

    public record Request(@NotBlank String accountName,
                          @DecimalMin("0") BigDecimal orderAmount,
                          @DecimalMin("0") BigDecimal creditLimit,
                          @DecimalMin("0") BigDecimal outstandingBalance,
                          @Min(0) int overdueDays, @Min(0) int fulfillmentIssueCount) {}
    public record Result(String accountName, BigDecimal projectedExposure,
                         BigDecimal creditUtilizationPercent, int riskScore,
                         String decision, List<String> actions) {}
}
