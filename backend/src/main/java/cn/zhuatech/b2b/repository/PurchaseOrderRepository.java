/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.repository; import cn.zhuatech.b2b.model.PurchaseOrder; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder,Long>{List<PurchaseOrder> findAllByOrderByDueDateAsc();List<PurchaseOrder> findByBusinessAccountCodeOrderByDueDateAsc(String code);long countByStatus(PurchaseOrder.Status status);}
