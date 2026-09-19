/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.model;
import jakarta.persistence.*; import java.time.LocalDateTime;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Entity @Table(name="b2b_fulfillment_issue") public class FulfillmentIssue extends BaseEntity {
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public enum Result { PENDING, PASSED, FAILED }
    @Column(nullable=false,unique=true,length=32) private String fulfillmentIssueNo; @ManyToOne(optional=false,fetch=FetchType.LAZY) private PurchaseOrder purchaseOrder;
    @Column(nullable=false,length=30) private String fulfillmentIssueType; @Column(nullable=false) private int fulfillmentIssueQty; @Column(nullable=false) private int defectQty; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Result result;
    @Column(length=50) private String inspector; @Column(nullable=false) private LocalDateTime createdAt;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    protected FulfillmentIssue(){} /**
                                    * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                    */
public FulfillmentIssue(String fulfillmentIssueNo,PurchaseOrder purchaseOrder,String fulfillmentIssueType,int fulfillmentIssueQty,int defectQty,Result result,String inspector){this.fulfillmentIssueNo=fulfillmentIssueNo;this.purchaseOrder=purchaseOrder;this.fulfillmentIssueType=fulfillmentIssueType;this.fulfillmentIssueQty=fulfillmentIssueQty;this.defectQty=defectQty;this.result=result;this.inspector=inspector;this.createdAt=LocalDateTime.now();}
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getFulfillmentIssueNo(){return fulfillmentIssueNo;} /**
                                                                       * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                       */
public PurchaseOrder getPurchaseOrder(){return purchaseOrder;} /**
                                                                                                                                      * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                      */
public String getFulfillmentIssueType(){return fulfillmentIssueType;} /**
                                                                                                                                                                                                            * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                            */
public int getFulfillmentIssueQty(){return fulfillmentIssueQty;} /**
                                                                                                                                                                                                                                                                             * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                             */
public int getDefectQty(){return defectQty;} /**
                                                                                                                                                                                                                                                                                                                          * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                                                          */
public Result getResult(){return result;} /**
                                                                                                                                                                                                                                                                                                                                                                    * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                                                                                                    */
public String getInspector(){return inspector;}
}
