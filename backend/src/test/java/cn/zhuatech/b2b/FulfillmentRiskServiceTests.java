/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b;import cn.zhuatech.b2b.service.FulfillmentRiskService;import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class FulfillmentRiskServiceTests{private final FulfillmentRiskService s=new FulfillmentRiskService();/**
                                                                                                       * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                       */
@Test void blocksSeverelyConstrainedOrder(){var r=s.evaluate(new FulfillmentRiskService.Request("O1",100,30,0,1,5,true,true));assertEquals("BLOCK_OR_NOTIFY",r.status());}/**
                                                                                                                                                                                                                                                                                 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                                                                                                                                                                                                                 */
@Test void keepsAllocatedOrderOnTrack(){var r=s.evaluate(new FulfillmentRiskService.Request("O2",100,100,80,10,0,false,false));assertEquals("ON_TRACK",r.status());}}
