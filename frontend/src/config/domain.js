/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
export const domain={
 code:'B2B',systemName:'企业订货协同平台',englishName:'BUSINESS TO BUSINESS COMMERCE',
 theme:{primary:'#6750a4',dark:'#382b5d',accent:'#3d87bb'},
 workspace:'订货运营中心 / 企业客户运营',fieldWorkspace:'华东经销商',period:'2026-08-01 · 周六',liveText:'商品目录数据链路正常',
 fieldContextLabel:'当前企业客户',fieldContext:'日班 · 08:30—17:30',fieldUser:'陆承',fieldRole:'企业采购员',adminUser:'周妍',adminRole:'企业客户主管',
 adminTitle:'企业客户运营驾驶舱',adminBreadcrumb:'企业客户运营 / 今日态势',adminSubtitle:'集中查看订单接收、履约、核验、商品目录与时限风险。',exportAction:'导出履约日报',createAction:'新建订货单',
 chartTitle:'履约完成趋势',chartSubtitle:'当日累计完成率 / 计划目标',chartLabels:['08:30','09:30','10:30','11:30','13:30','14:30','15:30','16:30','17:30'],loadTitle:'企业客户负荷',loadSubtitle:'履约中订单占可用能力',recordsTitle:'履约中订单',recordsSubtitle:'按承诺时限与异常优先显示',issueTitle:'履约与交付风险',issueSubtitle:'需要企业客户主管处理的事项',
 recordName:'订货单',itemName:'商品 / 项目',unitName:'企业客户',batchName:'商品批次',planName:'计划项目',doneName:'已完成',exceptionName:'异常',unitLabel:'项',
 listBreadcrumb:'订单管理 / 任务台账',listSubtitle:'统一管理订单接收、任务分派、履约、核验与订单归档。',listSummary:[['今日新增订单','36'],['履约中订单','28'],['待复核','8'],['超时风险','2',true]],tabs:['全部','待确认','履约中','待复核','已完成'],
 fieldBreadcrumb:'履约执行 / 我的工作台',fieldTitle:'企业订货工作台',fieldSubtitle:'当前 7 项履约中订单 · 2 个商品清单待确认 · 企业采购员陆承',fieldSecondary:'交接记录',reportAction:'录入结果',fieldNoticeTitle:'账户与价格已校验',fieldNotice:'授信额度、协议价格与交付地址均已校验',
 steps:['订单接收确认','库存确认','履约执行','交付复核','订单归档'],documentAction:'查看交易规则',printAction:'打印商品标签',resourceCardTitle:'商品目录状态',resourceValueLabel:'可订库存',resourceHealthLabel:'目录有效率',quickSubtitle:'企业客户高频业务入口',quickActions:[['结果录入','/shopfloor/report','发货数量与履约结果'],['商品流转','/shopfloor/material','物流节点与签收凭证'],['目录选品','/shopfloor/resources','价格、库存与上架记录'],['异常上报','/shopfloor/andon','缺货、延迟与签收异常']],
 reportDefaults:[3,0],reportTitle:'履约结果录入',reportSubtitle:'记录原始结果、异常数量和履约过程备注。',reportSuccess:'履约结果已保存并进入核验队列',reportPlaceholder:'填写发货依据、交付异常或拆单说明',reportFootnote:'提交后写入原始记录并生成订单动态',ruleTitle:'制度控制要求',ruleSubtitle:'PO-TERM-2612 · V4.3',rules:[['账期','45 天'],['授信占用','68%'],['协议价校验','已通过'],['目录版本','有效',true]],fieldTotals:[['16','已完成项目'],['1','异常结果'],['5','待复核结果'],['98.2%','订单数据完整率']],
 adminMenus:[['/admin','home','运营驾驶舱'],['/admin/work-orders','order','订货单'],['/admin/samples','box','商品管理'],['/admin/schedule','calendar','排班预约'],['/admin/methods','process','制度与标准'],['/admin/reviews','quality','交付复核'],['/admin/resources','machine','商品目录'],['/admin/report','chart','订货分析']],
 fieldMenus:[['/shopfloor','home','我的工作台'],['/shopfloor/report','report','结果录入'],['/shopfloor/tasks','order','待检任务'],['/shopfloor/material','box','商品流转'],['/shopfloor/resources','machine','目录选品'],['/shopfloor/andon','risk','异常上报',1]],
 moduleTitles:{tasks:['待检任务','查看任务优先级、商品状态与承诺时限'],material:['商品流转','跟踪接收、分样、留样与销毁全过程'],resources:['目录选品','管理商品目录档期、校准和使用记录'],andon:['异常上报','登记并跟踪 OOS、OOT 与环境异常'],samples:['商品管理','管理商品登记、标签、位置和生命周期'],schedule:['排班预约','协调人员、商品目录和制度的可用时间'],methods:['制度与标准','维护交易规则、限度和标准物质'],reviews:['交付复核','执行价格复核、订单动态批准和电子签名'],report:['订货分析','分析周转时间、一次通过率和异常趋势']},
 tagline:'让每一份履约结果都有完整订单动态链',storyTitle:'从订单接收到订单动态，<br/>每个结果都可核验、可追溯。',storyText:'连接商品、制度、商品目录、人员与原始数据的企业客户数字底座。',pattern:[2,3,8,9,10,15,16,17,22,23,24,29,30,28],loginStats:[['98.2%','订单数据完整率'],['28','当前履约中订单'],['3.6 天','平均交付周期']],loginTitle:'企业客户订货运营中心',adminDemo:'客户 / 订单 / 履约',fieldDemo:'履约 / 结果 / 异常'
}
export const records=[
 {no:'PO-260801-018',name:'工业网关季度补货单',code:'PO-GW-2608',unit:'海外渠道商',group:'订货运营中心',plan:24,done:16,exception:1,due:'08-02',batch:'GW-Q3',status:'履约中',progress:67,priority:'加急'},
 {no:'PO-260801-021',name:'智能终端渠道订货单',code:'PO-TERM-2612',unit:'华东经销商',group:'订货运营中心',plan:18,done:8,exception:0,due:'08-02',batch:'TERM-12',status:'履约中',progress:44,priority:'正常'},
 {no:'PO-260802-006',name:'备品备件年度订单',code:'PO-SPARE-26',unit:'战略客户',group:'研发中心',plan:12,done:0,exception:0,due:'08-04',batch:'SP-2026',status:'待确认',progress:0,priority:'正常'},
 {no:'PO-260728-015',name:'海外交付批次订单',code:'PO-OVERSEA-09',unit:'华东经销商',group:'订货运营中心',plan:20,done:20,exception:1,due:'08-01',batch:'SEA-09',status:'已完成',progress:100,priority:'正常'},
 {no:'PO-260801-024',name:'门店开业物料订单',code:'PO-STORE-18',unit:'华东经销商',group:'订货运营中心',plan:15,done:10,exception:0,due:'08-03',batch:'STORE-18',status:'待复核',progress:67,priority:'关注'}]
export const resources=[{code:'CAT-GW-03',name:'工业网关目录',unit:'华东经销商',status:'运行',health:88,value:'126',valueUnit:'台',note:'华东协议目录 · 126 台可订'},{code:'CAT-UTM-05',name:'实施服务目录',unit:'海外渠道商',status:'运行',health:91,value:'48',valueUnit:'项',note:'实施档期已锁定至 2026-10'},{code:'CAT-INC-08',name:'备品备件目录',unit:'战略客户',status:'报警',health:62,value:'92',valueUnit:'%',note:'备件目录库存同步异常'}]
export const reviews=[{no:'REV-260801-032',title:'工业网关订单交付核验',type:'交付复核',detail:'8 个交付批次 · 周妍',result:'通过'},{no:'REV-260801-011',title:'智能终端协议价核验',type:'价格复核',detail:'12 个商品行 · 顾清',result:'待确认'},{no:'REV-260728-018',title:'海外批次签收异常调查',type:'异常评审',detail:'ISS-260728-02',result:'异常'}]
export const adminMetrics=[['今日新增订单','36','较昨日增加 8 份','blue'],['按时完成率','96.8%','目标值 ≥ 95.0%','green'],['待复核结果','8','其中 2 项加急','orange'],['异常 / OOS','2','1 项进入调查','red']]
export const fieldMetrics=[['今日任务','7','18 个订单明细','blue'],['已完成','16','当前进度 67%','green'],['待复核','5','数据已完整提交','orange'],['商品目录档期','今日可订','工业网关目录','slate']]
export const chartActual=[8,18,29,42,49,61,72,84,91],chartTarget=[10,21,32,43,36,65,76,87,98]
export const loads=[['华东经销商',92,'12 项在检'],['海外渠道商',78,'8 项在检'],['战略客户',71,'6 项在检'],['零售连锁客户',56,'5 项在检']]
export const issues=[{type:'商品目录',title:'工业网关可用库存不足',detail:'CAT-INC-08 · 缺口 24 台',status:'调查中'},{type:'结果',title:'海外批次签收数量不符',detail:'ISS-260728-02 · 等待物流回单',status:'待判定'},{type:'时限',title:'门店物料可能错过开业窗口',detail:'预计延迟 1 天',status:'协调中'}]
