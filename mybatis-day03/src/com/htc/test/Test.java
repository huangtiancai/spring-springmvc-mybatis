/**
 * 
 */
package com.htc.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.htc.dao.UserMapper;
import com.htc.pojo.User;
import com.htc.pojo.UserCustom;
import com.htc.pojo.UserQueryVO;
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
		System.out.println(user.getId()+" "+user.getUsername()+" "+user.getSex());
		
		//UserMapper.xml中的sql语句:
		//1.select id as id_,username as username_,sex as sex_ from user where id=#{id}
		//打印的user:
		//User [id=3, username=jack, sex=男, birthday=null, address=null]
		//2.select id as id_,username as username_,sex as sex_,birthday,address from user where id=#{id}
		//打印的user:
		//User [id=3, username=jack, sex=男, birthday=Tue Aug 08 00:00:00 CST 2017, address=广州]
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
	
	//模糊查询    使用到包装类
	@org.junit.Test
	public void findUserByName(){		
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		//获取代理的实现类 
		UserMapper um = sqlSession.getMapper(UserMapper.class);
		//包装类
		UserQueryVO userQueryVO = new UserQueryVO();
		User user = new User();
		user.setUsername("%a%");
		userQueryVO.setUser(user);
		
		List<User> users = um.findUserByName(userQueryVO);
		
		System.out.println(users);	
		
	}
	
	
	//动态sql查询
	@org.junit.Test
	public void dynamicFind(){		
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类
		UserMapper um = sqlSession.getMapper(UserMapper.class);		
		
		//new一个新的用户，构造一个新的对象
		//public User(Integer id, String username, String sex, Date birthday, String address){}
		//注意：1).id可以为 具体的基本数值类型或为null;2).username,sex,address为字符串，可以设置为"...." 或""
		
		//1.动态地查询所有性别为女的用户
		//User user = new User(null, "", "女", null, "");
		//2.动态地模糊查询用户名带"a"的用户
		User user = new User(null, "%a%", "", null, "");
		List<User> users = um.dynamicFind(user);
		
		System.out.println(users);	
		
	}
	
	//动态sql查询
	@org.junit.Test
	public void dynamicFind2(){		
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
		//获取代理的实现类
		UserMapper um = sqlSession.getMapper(UserMapper.class);		
		
		//1.动态地查询所有性别为女的用户
		//User user = new User(null, "", "女", null, "");
		//2.动态地模糊查询用户名带"a"的用户
		User user = new User(null, "%a%", "", null, "");
		List<User> users = um.dynamicFind(user);
		
		System.out.println(users);	
		
	}

	//根据多个id 查询
	@org.junit.Test
	public void findUserByIds(){		
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		//获取代理的实现类
		UserMapper um = sqlSession.getMapper(UserMapper.class);		
		
//		private UserCustom userCustom;   class UserQueryVO
//		private List<Integer> ids;       class UserCustom
//		userCustom.ids
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		
		UserCustom uc = new UserCustom();
		uc.setIds(ids);
		
		UserQueryVO vo = new UserQueryVO();
		vo.setUserCustom(uc);
		
		List<User> users = um.findUserByIds(vo);
		
		System.out.println(users);	
		
	}

	
	//根据多个id 查询
	@org.junit.Test
	public void findUserByIds2(){		
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
	
		//获取代理的实现类
		UserMapper um = sqlSession.getMapper(UserMapper.class);		
		
//			private UserCustom userCustom;   class UserQueryVO
//			private List<Integer> ids;       class UserCustom
//			userCustom.ids
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		
		UserCustom uc = new UserCustom();
		uc.setIds(ids);
		
		UserQueryVO vo = new UserQueryVO();
		vo.setUserCustom(uc);
		
		List<User> users = um.findUserByIds(vo);
		
		System.out.println(users);	
		
	}
	
	
	//根据多个id 查询
	@org.junit.Test
	public void findUserByIds3(){		
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
	
		//获取代理的实现类
		UserMapper um = sqlSession.getMapper(UserMapper.class);		
		
//				private UserCustom userCustom;   class UserQueryVO
//				private List<Integer> ids;       class UserCustom
//				userCustom.ids
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		
		UserCustom uc = new UserCustom();
		uc.setIds(ids);
		
		UserQueryVO vo = new UserQueryVO();
		vo.setUserCustom(uc);
		
		List<User> users = um.findUserByIds(vo);
		
		System.out.println(users);	
		
	}
	
	@org.junit.Test
	public void findUserByIds4(){		
		//获得会话
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		
	
		//获取代理的实现类
		UserMapper um = sqlSession.getMapper(UserMapper.class);		
		
//				private UserCustom userCustom;   class UserQueryVO
//				private List<Integer> ids;       class UserCustom
//				userCustom.ids
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(5);
		
		UserCustom uc = new UserCustom();
		uc.setIds(ids);
		
		UserQueryVO vo = new UserQueryVO();
		vo.setUserCustom(uc);
		
		List<User> users = um.findUserByIds(vo);
		
		System.out.println(users);	
		
	}
	
}
