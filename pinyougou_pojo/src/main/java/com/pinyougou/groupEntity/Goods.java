package com.pinyougou.groupEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbGoodsDesc;
import com.pinyougou.pojo.TbItem;

public class Goods implements Serializable{
	
	private  TbGoods tbGoods;
	private TbGoodsDesc tbGoodsDesc;
	
	private List<TbItem> itemsList;

	private Map categoryMap;
	
	
	public Map getCategoryMap() {
		return categoryMap;
	}


	public void setCategoryMap(Map categoryMap) {
		this.categoryMap = categoryMap;
	}


	public Goods() {
		super();
	}


	public TbGoods getTbGoods() {
		return tbGoods;
	}

	public void setTbGoods(TbGoods tbGoods) {
		this.tbGoods = tbGoods;
	}

	public TbGoodsDesc getTbGoodsDesc() {
		return tbGoodsDesc;
	}

	public void setTbGoodsDesc(TbGoodsDesc tbGoodsDesc) {
		this.tbGoodsDesc = tbGoodsDesc;
	}

	public List<TbItem> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<TbItem> itemsList) {
		this.itemsList = itemsList;
	}

	
}
