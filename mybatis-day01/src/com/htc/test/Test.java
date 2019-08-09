/**
 * 
 */
package com.htc.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

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
		
		//使用会话中的方法操作数据库
		User user = sqlSession.selectOne("user.findUserById", 1);
		System.out.println(user);
	}
	
	//模糊查询    #{}  表示一个占位，向占位中输入参数  
	@org.junit.Test
	public void findUserByName(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//使用会话中的方法操作数据库
		List<User> user = sqlSession.selectList("user.findUserByName", "%a%");
		System.out.println(user);
	}
	
	//模糊查询  表示sql拼接 通过${}接受参数，比如传入字符串 需要自己加''
	@org.junit.Test
	public void findUserByName2(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//使用会话中的方法操作数据库
		List<User> user = sqlSession.selectList("user.findUserByName2", "a");
		System.out.println(user);
	}
	
	//注意增删改需要提交事务
	
	//新增用户
	@org.junit.Test
	public void saveUser(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		int result = sqlSession.insert("user.saveUser", new User(null, "李四", "男", new Date(), "测试"));
		sqlSession.commit();
		System.out.println(result);//1
	}
	
	//更新用户
	@org.junit.Test
	public void updateUser(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		int result = sqlSession.insert("user.updateUser", new User(10, "updateName", "男", new Date(), "测试"));
		sqlSession.commit();
		System.out.println(result);//1
	}
	
	//删除用户
	@org.junit.Test
	public void deleteUser(){
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		int result = sqlSession.delete("user.deleteUser", 11);
		sqlSession.commit();
		System.out.println(result);//1
	}
}
