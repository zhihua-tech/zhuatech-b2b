/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.b2b.repository; import cn.zhuatech.b2b.model.ProductCatalog; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface ProductCatalogRepository extends JpaRepository<ProductCatalog,Long>{List<ProductCatalog> findAllByOrderByCodeAsc();long countByStatus(ProductCatalog.Status status);}
