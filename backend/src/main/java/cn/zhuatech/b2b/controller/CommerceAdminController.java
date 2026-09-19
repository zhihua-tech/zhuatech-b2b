/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.controller; import cn.zhuatech.b2b.common.ApiResponse; import cn.zhuatech.b2b.dto.B2bDto.*; import cn.zhuatech.b2b.service.B2bService; import org.springframework.security.access.prepost.PreAuthorize; import org.springframework.web.bind.annotation.*; import java.util.List;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/admin") @PreAuthorize("hasAnyRole('B2B_OPERATOR','QUALITY','ADMIN')") public class CommerceAdminController {private final B2bService service;/**
                                                                                                                                                                                    * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                    */
public CommerceAdminController(B2bService service){this.service=service;}/**
                                                                                                                                                                                                                                                             * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                             */
@GetMapping("/dashboard") public ApiResponse<Dashboard> dashboard(){return ApiResponse.ok(service.adminDashboard());}/**
                                                                                                                                                                                                                                                                                                                                                                                  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                                                                                                                  */
@GetMapping("/work-orders") public ApiResponse<List<PurchaseOrderView>> orders(){return ApiResponse.ok(service.purchaseOrders());}}
