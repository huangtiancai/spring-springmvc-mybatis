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
	//查询订单
	@org.junit.Test
	public void getOrders(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类(orders代理)
		OrdersMapper om = sqlSession.getMapper(OrdersMapper.class);
		
		List<Orders> os = om.getOrders();
		//只查订单不会联表查询
		System.out.println(os.get(2).getNumbers());
		//查询关联属性，进行延迟加载
		System.out.println(os.get(2).getUser().getUsername());

		sqlSession.close();
	}
	
	//查询订单
	@org.junit.Test
	public void findUserById(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类(orders代理)
		OrdersMapper om = sqlSession.getMapper(OrdersMapper.class);
		
		User user = om.findUserById(1);
		System.out.println(user);
		sqlSession.close();
	}
	
}
