/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.controller;import cn.zhuatech.b2b.common.ApiResponse;import cn.zhuatech.b2b.service.FulfillmentRiskService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/b2b/insights/fulfillment-risk") public class FulfillmentRiskController{private final FulfillmentRiskService service;/**
                                                                                                                                                           * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                           */
public FulfillmentRiskController(FulfillmentRiskService service){this.service=service;}/**
                                                                                                                                                                                                                                                  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                  */
@PostMapping ApiResponse<FulfillmentRiskService.Result> evaluate(@Valid @RequestBody FulfillmentRiskService.Request r){return ApiResponse.ok(service.evaluate(r));}}
