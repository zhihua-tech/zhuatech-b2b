/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.controller;

import cn.zhuatech.b2b.common.ApiResponse;
import cn.zhuatech.b2b.service.EnterpriseOrderReleaseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/enterprise/b2b")
public class EnterpriseOrderReleaseController {
    private final EnterpriseOrderReleaseService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public EnterpriseOrderReleaseController(EnterpriseOrderReleaseService service) { this.service = service; }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/order-release")
    public ApiResponse<EnterpriseOrderReleaseService.Assessment> assess(
        @Valid @RequestBody EnterpriseOrderReleaseService.Request request) {
        return ApiResponse.ok(service.assess(request));
    }
}
