# 企业级 B2B 订单释放门禁

[知华科技（上海如静知华信息科技有限公司）](https://www.zhuatech.cn/)为 B2B 开源版增加企业订单释放治理。

`POST /api/enterprise/b2b/order-release` 联合校验框架合同、协议价格、授信、可订库存、税务资料、出口许可、交付承诺和采购凭证，输出 `RELEASE / REVIEW / BLOCKED` 及整改动作。

生产应用可将该门禁接入订单审批与履约流水线，并将价格、信用、库存和合规快照写入不可变审计记录。
