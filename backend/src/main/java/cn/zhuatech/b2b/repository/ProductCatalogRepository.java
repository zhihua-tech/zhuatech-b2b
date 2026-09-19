/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.repository; import cn.zhuatech.b2b.model.ProductCatalog; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
public interface ProductCatalogRepository extends JpaRepository<ProductCatalog,Long>{/**
                                                                                      * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                      */
List<ProductCatalog> findAllByOrderByCodeAsc();/**
                                                                                                                                     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                     */
long countByStatus(ProductCatalog.Status status);}
