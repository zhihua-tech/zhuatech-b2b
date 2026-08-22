/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.dto;
import jakarta.validation.constraints.*; import java.time.*; import java.util.List;
public final class B2bDto { private B2bDto(){}
    public record Metric(String label,String value,String hint,String tone){}
    public record PurchaseOrderView(Long id,String orderNo,String productCode,String productName,String businessAccount,String workshop,int plannedQty,int completedQty,int defectQty,LocalDate dueDate,String status,String batchNo,int progress){}
    public record ControlView(String code,String name,String businessAccount,String status,int oee,LocalDateTime lastHeartbeat){}
    public record FulfillmentIssueView(String fulfillmentIssueNo,String orderNo,String productName,String fulfillmentIssueType,int fulfillmentIssueQty,int defectQty,String result,String inspector){}
    public record Dashboard(List<Metric> metrics,List<PurchaseOrderView> purchaseOrders,List<ControlView> productCatalog,List<FulfillmentIssueView> fulfillmentIssues){}
    public record ReportRequest(@NotBlank String operationName,@Positive int goodQty,@PositiveOrZero int defectQty,@Size(max=200) String remark){}
    public record ReportResult(String orderNo,int completedQty,int defectQty,int progress,String status){}
}
