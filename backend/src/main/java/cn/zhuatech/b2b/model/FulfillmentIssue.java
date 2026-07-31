/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.b2b.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="b2b_fulfillment_issue") public class FulfillmentIssue extends BaseEntity {
    public enum Result { PENDING, PASSED, FAILED }
    @Column(nullable=false,unique=true,length=32) private String fulfillmentIssueNo; @ManyToOne(optional=false,fetch=FetchType.LAZY) private PurchaseOrder purchaseOrder;
    @Column(nullable=false,length=30) private String fulfillmentIssueType; @Column(nullable=false) private int fulfillmentIssueQty; @Column(nullable=false) private int defectQty; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Result result;
    @Column(length=50) private String inspector; @Column(nullable=false) private LocalDateTime createdAt;
    protected FulfillmentIssue(){} public FulfillmentIssue(String fulfillmentIssueNo,PurchaseOrder purchaseOrder,String fulfillmentIssueType,int fulfillmentIssueQty,int defectQty,Result result,String inspector){this.fulfillmentIssueNo=fulfillmentIssueNo;this.purchaseOrder=purchaseOrder;this.fulfillmentIssueType=fulfillmentIssueType;this.fulfillmentIssueQty=fulfillmentIssueQty;this.defectQty=defectQty;this.result=result;this.inspector=inspector;this.createdAt=LocalDateTime.now();}
    public String getFulfillmentIssueNo(){return fulfillmentIssueNo;} public PurchaseOrder getPurchaseOrder(){return purchaseOrder;} public String getFulfillmentIssueType(){return fulfillmentIssueType;} public int getFulfillmentIssueQty(){return fulfillmentIssueQty;} public int getDefectQty(){return defectQty;} public Result getResult(){return result;} public String getInspector(){return inspector;}
}
