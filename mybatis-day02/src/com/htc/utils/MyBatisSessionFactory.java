/**
 * 
 */
package com.htc.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**  
* @ClassName:MyBatisSessionFactory
* @Description:工具类
* @author:htc  
* @date:2019年8月7日 下午6:55:21
*/
public class MyBatisSessionFactory {
	//创建工厂对象
	private static SqlSessionFactory sqlSessionFactory;
	
	static{
		try {
			//解析xml文件,获取xml文件的输入流
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			//实例化工厂对象
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//获取会话
	public static SqlSession getSession(){
		return sqlSessionFactory.openSession();	
	}
	
	//关闭会话
	public static void closeSession(SqlSession sqlSession){
		if(sqlSession!=null){
			sqlSession.close();	
		}
	}
	
	
	
	
}
