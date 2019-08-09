/**
 * 
 */
package com.htc.test;

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
	public static void main(String[] args) {
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//使用会话中的方法操作数据库
		User user = sqlSession.selectOne("user.findUserById", 1);
		System.out.println(user);
	}
}
