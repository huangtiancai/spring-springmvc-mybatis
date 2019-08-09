/**
 * 
 */
package com.htc.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.htc.dao.UserMapper;
import com.htc.pojo.User;
import com.htc.utils.MyBatisSessionFactory;


/**  
* @ClassName:Test
* @Description:测试类
* @author:htc  
* @date:2019年8月7日 下午7:04:03
*/
public class Test {
	//根据用户id查询
	@org.junit.Test
	public void findUserById(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类(mappder的代理方式???)
		UserMapper um = sqlSession.getMapper(UserMapper.class);
		
		User user = um.findUserById(3);
		System.out.println(user);
	}
	
	//查询所有
	@org.junit.Test
	public void findUserAll(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		UserMapper um = sqlSession.getMapper(UserMapper.class);
		List<User> user = um.findUserAll();
		System.out.println(user);
	}
	
}
