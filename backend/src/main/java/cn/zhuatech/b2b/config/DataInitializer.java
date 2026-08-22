/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.config;

import cn.zhuatech.b2b.model.*;
import cn.zhuatech.b2b.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner seed(BusinessAccountRepository businessAccounts, PurchaseOrderRepository orders,
                           ProductCatalogRepository productCatalogs, FulfillmentIssueRepository fulfillmentIssues,
                           UserRepository users, PasswordEncoder encoder) {
        return args -> {
            if (businessAccounts.count() > 0) return;
            BusinessAccount chemistry = businessAccounts.save(new BusinessAccount("B2B-CHEM", "华东经销商", "订货运营中心", 180));
            BusinessAccount micro = businessAccounts.save(new BusinessAccount("B2B-MICRO", "战略客户", "研发中心", 120));
            BusinessAccount material = businessAccounts.save(new BusinessAccount("B2B-MAT", "海外渠道商", "工程中心", 96));

            PurchaseOrder t1 = orders.save(new PurchaseOrder("PO-260801-018", "GB-T-228", "工业网关季度补货单", material, 24, 16, 1, LocalDate.now().plusDays(1), PurchaseOrder.Status.RUNNING, "GW-Q3"));
            PurchaseOrder t2 = orders.save(new PurchaseOrder("PO-260801-021", "PO-TERM-2612", "智能终端渠道订货单", chemistry, 18, 8, 0, LocalDate.now().plusDays(1), PurchaseOrder.Status.RUNNING, "TERM-12"));
            PurchaseOrder t3 = orders.save(new PurchaseOrder("PO-260802-006", "ISO-4833", "备品备件年度订单", micro, 12, 0, 0, LocalDate.now().plusDays(3), PurchaseOrder.Status.RELEASED, "SP-2026"));
            PurchaseOrder t4 = orders.save(new PurchaseOrder("PO-260728-015", "PO-OVERSEA-09", "海外交付批次订单", chemistry, 20, 20, 1, LocalDate.now(), PurchaseOrder.Status.COMPLETED, "SEA-09"));

            productCatalogs.saveAll(List.of(
                new ProductCatalog("CAT-HPLC-03", "工业网关目录", chemistry, ProductCatalog.Status.RUNNING, 88),
                new ProductCatalog("CAT-ICP-02", "智能终端目录", chemistry, ProductCatalog.Status.IDLE, 76),
                new ProductCatalog("CAT-UTM-05", "实施服务目录", material, ProductCatalog.Status.RUNNING, 91),
                new ProductCatalog("CAT-INC-08", "备品备件目录", micro, ProductCatalog.Status.ALARM, 62)
            ));
            fulfillmentIssues.saveAll(List.of(
                new FulfillmentIssue("ISS-260801-032", t1, "留样核验", 6, 0, FulfillmentIssue.Result.PASSED, "周妍"),
                new FulfillmentIssue("ISS-260801-011", t2, "前处理核验", 3, 0, FulfillmentIssue.Result.PASSED, "陆承"),
                new FulfillmentIssue("ISS-260801-018", t4, "交付复核", 5, 1, FulfillmentIssue.Result.FAILED, "周妍"),
                new FulfillmentIssue("ISS-260802-003", t3, "订单接收确认", 4, 0, FulfillmentIssue.Result.PENDING, "陆承")
            ));
            String demo = encoder.encode("Demo@2026");
            users.saveAll(List.of(
                new UserAccount("operator", demo, "陆承", UserAccount.Role.BUSINESS_BUYER, "B2B-CHEM"),
                new UserAccount("planner", demo, "周妍", UserAccount.Role.B2B_OPERATOR, null),
                new UserAccount("quality", demo, "顾清", UserAccount.Role.QUALITY, null),
                new UserAccount("admin", encoder.encode("ZhuaTech@2026"), "系统管理员", UserAccount.Role.ADMIN, null)
            ));
        };
    }
}
