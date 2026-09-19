/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.service;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class EnterpriseOrderReleaseServiceTest {
    private final EnterpriseOrderReleaseService service = new EnterpriseOrderReleaseService();

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void releasesControlledEnterpriseOrder() {
        var result = service.assess(new EnterpriseOrderReleaseService.Request(
            "SO-001", "C-001", true, true, true, 10, 20, true, false, false, true, true));
        assertThat(result.decision()).isEqualTo(EnterpriseOrderReleaseService.Decision.RELEASE);
        assertThat(result.releasable()).isTrue();
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void blocksCommercialAndComplianceFailures() {
        var result = service.assess(new EnterpriseOrderReleaseService.Request(
            "SO-002", "C-002", false, false, false, 50, 10, false, true, false, true, true));
        assertThat(result.decision()).isEqualTo(EnterpriseOrderReleaseService.Decision.BLOCKED);
        assertThat(result.blockers()).hasSize(6);
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void reviewsMissingDeliveryEvidence() {
        var result = service.assess(new EnterpriseOrderReleaseService.Request(
            "SO-003", "C-003", true, true, true, 5, 5, true, false, false, false, false));
        assertThat(result.decision()).isEqualTo(EnterpriseOrderReleaseService.Decision.REVIEW);
        assertThat(result.actions()).hasSize(2);
    }
}
