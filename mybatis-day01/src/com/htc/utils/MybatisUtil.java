/**
 * 
 */
package com.htc.utils;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**  
* @ClassName:MybatisUtil
* @Description:使用Mybatis的API来创建一个工具类，通过mybatis配置文件与数据库的信息，得到Connection对象
* @author:htc  
* @date:2019年8月7日 下午7:14:44
*/
public class MybatisUtil {
	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
	private static SqlSessionFactory sqlSessionFactory;
	/**
	 * 加载位于src/mybatis.xml配置文件
	 */
	static{
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			//实例化工厂对象
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 禁止外界通过new方法创建 
	 */
	private MybatisUtil(){
		
	}
	
	//获取会话SqlSession
	public static SqlSession getSession(){
		//从当前线程中获取SqlSession对象
		SqlSession sqlSession = threadLocal.get();
		//如果SqlSession对象为空
		if(sqlSession==null){
			//在SqlSessionFactory非空的情况下，获取SqlSession对象
			sqlSession = sqlSessionFactory.openSession();
			//将SqlSession对象与当前线程绑定在一起
			threadLocal.set(sqlSession);
		}
		//返回SqlSession对象
		return sqlSession;	
	}
	
	//关闭SqlSession与当前线程分开
	public static void closeSession(){
		//从当前线程中获取SqlSession对象
		SqlSession sqlSession = threadLocal.get();
		//如果SqlSession对象非空
		if(sqlSession!=null){
			//关闭SqlSession对象
			sqlSession.close();
			//分开当前线程与SqlSession对象的关系，目的是让GC尽早回收
			threadLocal.remove();
		}
	}
	
	public static void main(String[] args) {
		Connection conn = MybatisUtil.getSession().getConnection();
		System.out.println(conn!=null?"连接成功":"连接失败");
	}
	
}
