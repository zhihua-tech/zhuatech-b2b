/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.controller;

import cn.zhuatech.b2b.common.ApiResponse;
import cn.zhuatech.b2b.service.CreditDecisionService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class CreditDecisionController {
    private final CreditDecisionService service;
    public CreditDecisionController(CreditDecisionService service) { this.service = service; }
    @PostMapping("/credit-decision")
    public ApiResponse<CreditDecisionService.Result> evaluate(@Valid @RequestBody CreditDecisionService.Request request) {
        return ApiResponse.ok(service.evaluate(request));
    }
}
