/**
 * 
 */
package com.htc.dao;

import java.util.List;

import com.htc.pojo.Orders;
import com.htc.pojo.OrdersCustom;
import com.htc.pojo.User;

/**  
* @ClassName:OrdersMapper
* @Description:
* @author:htc  
* @date:2019年8月11日 下午3:18:21
*/
public interface OrdersMapper {
	//查询订单信息关联查询用户信息【用户名/性别】
	List<OrdersCustom> findOrdersAndUserMessage();
	List<Orders> findOrdersAndUserMessageMap();
	
	//查询所有的订单信息及订单信息下的订单明细
	List<Orders> findOrdersAndUserAndDetailMessage();
	//查所有用户信息，关联查询订单及订单详情及商品信息
	List<User> findOrdersAndUserAndDetailAndItemsMessage();
	
	//查询订单
	List<Orders> getOrders();
	//根据id查询用户
	User findUserById(int id);
}
