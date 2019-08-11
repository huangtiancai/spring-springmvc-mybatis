/**
 * 
 */
package com.htc.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.htc.dao.OrdersMapper;
import com.htc.pojo.Orders;
import com.htc.pojo.OrdersCustom;
import com.htc.pojo.User;
import com.htc.utils.MyBatisSessionFactory;


/**  
* @ClassName:Test
* @Description:测试类
* @author:htc  
* @date:2019年8月7日 下午7:04:03
*/
public class Test {
	//查询订单信息关联查询用户信息【用户名/性别】-resultType
	@org.junit.Test
	public void findOrdersAndUserMessage(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类(orders代理)
		OrdersMapper om = sqlSession.getMapper(OrdersMapper.class);
		
		List<OrdersCustom> os = om.findOrdersAndUserMessage();
		System.out.println(os);
		System.out.println("订单记录数："+os.size());
		//订单扩展类OrdersCustom的扩展属性-->扩展方法(OrdersCustom的get/set方法)
		System.out.println(os.get(2).getUsername());
		System.out.println(os.get(2).getSex());
		//订单扩展类OrdersCustom继承了Orders(Orders的get/set方法)
		System.out.println(os.get(2).getId());
		System.out.println(os.get(2).getUser_id());
		System.out.println(os.get(2).getNumbers());
		System.out.println(os.get(2).getCreatetitle());
		System.out.println(os.get(2).getNote());

	}
	
	//查询订单信息关联查询用户信息【用户名/性别】-resultMap
	@org.junit.Test
	public void findOrdersAndUserMessageMap(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类(orders代理)
		OrdersMapper om = sqlSession.getMapper(OrdersMapper.class);
		
		List<Orders> or = om.findOrdersAndUserMessageMap();
		System.out.println(or);
		System.out.println("订单记录数："+or.size());
		System.out.println(or.get(1));
		System.out.println(or.get(1).getNote());

	}
	

	//查询所有的订单信息及订单信息下的订单明细
	@org.junit.Test
	public void findOrdersAndUserAndDetailMessage(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类(orders代理)
		OrdersMapper om = sqlSession.getMapper(OrdersMapper.class);
		
		List<Orders> or = om.findOrdersAndUserAndDetailMessage();
		System.out.println(or);
		System.out.println("订单记录数："+or.size());
		System.out.println(or.get(1));
		System.out.println(or.get(1).getNote());
	}
	
	//查询所有用户信息，关联查询订单及订单详情及商品信息
	@org.junit.Test
	public void findOrdersAndUserAndDetailAndItemsMessage(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类(orders代理)
		OrdersMapper om = sqlSession.getMapper(OrdersMapper.class);
		
		List<User> users = om.findOrdersAndUserAndDetailAndItemsMessage();
		System.out.println(users);
		System.out.println("用户数数："+users.size());
		System.out.println(users.get(0).getOrderList().get(0).getNote());
	}
	
}
