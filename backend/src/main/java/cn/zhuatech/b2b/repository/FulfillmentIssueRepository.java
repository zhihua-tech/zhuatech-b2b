/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.repository; import cn.zhuatech.b2b.model.FulfillmentIssue; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
public interface FulfillmentIssueRepository extends JpaRepository<FulfillmentIssue,Long>{/**
                                                                                          * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                          */
List<FulfillmentIssue> findTop10ByOrderByIdDesc();/**
                                                                                                                                            * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                            */
long countByResult(FulfillmentIssue.Result result);}
