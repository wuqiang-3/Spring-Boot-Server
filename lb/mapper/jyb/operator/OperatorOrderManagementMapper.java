package com.maryun.lb.mapper.jyb.operator;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.maryun.model.PageData;

@Mapper
public interface OperatorOrderManagementMapper {
	List<PageData> listPage(PageData pd); // 订单查询

	List<PageData> listPageMEMO(PageData pd); // 用户信息沟通备忘录

	List<PageData> listPagehistoryorder(PageData pd); // 订单查询中的历史订单表格

	List<PageData> uinameDesc(PageData pd); // 订单查询中的用户历史订单信息

	List<PageData> onumDesc(PageData pd); // 订单查询中的订单详细信息

	List<PageData> expertLibsDesc(PageData pd); // 订单查询中的专家库信息

	List<PageData> spDesc(PageData pd); // 订单查询中的代理商信息

	List<PageData> accompanyDesc(PageData pd); // 订单查询中的陪诊人员信息

	List<PageData> keyNodeDesc(PageData pd); // 订单查询中的就诊过程记录信息

	List<PageData> evalDesc(PageData pd); // 订单查询中的评价内容信息

	List<PageData> evallevelDesc(PageData pd); // 订单查询中的评价星级信息

	void changeOrderStatus(PageData pd); // 修改订单状态
	
	PageData selectUserArea(PageData pd);//查询运营人员区域
}
