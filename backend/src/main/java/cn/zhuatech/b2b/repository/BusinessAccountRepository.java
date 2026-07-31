/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. */
package cn.zhuatech.b2b.repository; import cn.zhuatech.b2b.model.BusinessAccount; import org.springframework.data.jpa.repository.JpaRepository; import java.util.Optional;
public interface BusinessAccountRepository extends JpaRepository<BusinessAccount,Long>{Optional<BusinessAccount> findByCode(String code);}
