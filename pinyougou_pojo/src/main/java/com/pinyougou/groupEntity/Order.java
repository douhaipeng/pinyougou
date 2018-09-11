package com.pinyougou.groupEntity;

import java.io.Serializable;
import java.util.List;

import com.pinyougou.pojo.TbItem;
import com.pinyougou.pojo.TbOrder;

public class Order implements Serializable{
	
	private TbOrder tbOrder;
	
	private List<TbItem> tbItemList;

	public TbOrder getTbOrder() {
		return tbOrder;
	}

	public void setTbOrder(TbOrder tbOrder) {
		this.tbOrder = tbOrder;
	}

	public List<TbItem> getTbItemList() {
		return tbItemList;
	}

	public void setTbItemList(List<TbItem> tbItemList) {
		this.tbItemList = tbItemList;
	}
	
}
