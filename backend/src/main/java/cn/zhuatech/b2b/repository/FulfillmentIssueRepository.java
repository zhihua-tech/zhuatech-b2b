/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.b2b.repository; import cn.zhuatech.b2b.model.FulfillmentIssue; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface FulfillmentIssueRepository extends JpaRepository<FulfillmentIssue,Long>{List<FulfillmentIssue> findTop10ByOrderByIdDesc();long countByResult(FulfillmentIssue.Result result);}
