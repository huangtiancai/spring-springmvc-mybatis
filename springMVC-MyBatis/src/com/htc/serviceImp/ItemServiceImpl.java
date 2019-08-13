/**
 * 
 */
package com.htc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.mapper.ItemMapper;
import com.htc.pojo.Item;
import com.htc.service.ItemService;

/**  
* @ClassName:ItemServiceImpl
* @Description:
* @author:htc  
* @date:2019年8月12日 下午11:38:55
*/
@Service
public class ItemServiceImpl implements ItemService {
	//注意：
	//1.一般在service的实现类中进行依赖属性的注入（service接口也可）
	//2.UserService要依赖ud属性
	//3.将指定具体的对象实例注入： @Resources(name=”指定的对象实例”)
//		@Resource(name="ud2")
//		private UserDao ud;
	
	//自动注入也可Autowired
	
	@Autowired
	private ItemMapper itemMapper; 
	//显示商品列表
	@Override
	public List<Item> queryItemList() {
		List<Item> list =  itemMapper.selectByExample(null);
		return null;
	}

}
