/**
 * 
 */
package com.htc.service;

import org.apache.ibatis.session.SqlSession;

import com.htc.dao.UserDao;
import com.htc.pojo.User;
import com.htc.utils.MyBatisSessionFactory;

/**  
* @ClassName UserService
* @Description:
* @author htc  
* @date 2019年8月9日下午4:49:40 
*/
public class UserService implements UserDao {
	@Override
	public User findUserById(int id) {
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		//调用方法
		User user = sqlSession.selectOne("user.findUserById", 1);
		//关闭连接
		MyBatisSessionFactory.closeSession(sqlSession);
		
		System.out.println(user);
		
		return user;
	}
	
	//dao层实现存在重复的代码！（创建sqlSession 关闭  提交事务）

}
