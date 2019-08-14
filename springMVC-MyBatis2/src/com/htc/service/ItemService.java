/**
 * 
 */
package com.htc.service;

import java.util.List;

import com.htc.pojo.Item;

/**  
* @ClassName:ItemService
* @Description:
* @author:htc  
* @date:2019年8月12日 下午11:35:40
*/
public interface ItemService {
	//查询商品列表
	List<Item> queryItemList();
	
	//根据商品id查询商品
	Item queryItemById(int id);
	
	//根据id更新商品
	void updateItemById(Item item);

}
