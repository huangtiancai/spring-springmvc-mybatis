/**
 * 
 */
package com.htc.pojo;

import java.util.List;

/**  
* @ClassName QueryVO
* @Description:包装类
* @author htc  
* @date 2019年8月13日下午4:04:17 
*/
public class QueryVO {
	private Item item;
	
	//用对象属性接受数组,属性名要同页面的name值相同
	//name="ids"
	private Integer[] ids;
	//用对象的属性接收List集合
	private List<Item> itemList;
	
	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
}
