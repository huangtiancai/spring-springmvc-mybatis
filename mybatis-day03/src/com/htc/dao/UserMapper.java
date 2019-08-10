/**
 * 
 */
package com.htc.dao;

import java.util.List;

import com.htc.pojo.User;
import com.htc.pojo.UserQueryVO;

/**  
* @ClassName UserMapper
* @Description:
* 	1.mapper接口 相当于dao接口
* 	2.mapper接口的命名方式建议：表明+Mapper.java
* @author htc  
* @date 2019年8月9日下午4:58:11 
*/
public interface UserMapper {
	User findUserById(int id);
	List<User> findUserAll();
	List<User> findUserByName(UserQueryVO vo);
	
	List<User> dynamicFind(User user);//动态sql查询
	List<User> dynamicFind2(User user);//动态sql查询
	
	List<User> findUserByIds(UserQueryVO vo);//根据多个id 查询 
	List<User> findUserByIds2(UserQueryVO vo);//根据多个id 查询 
	List<User> findUserByIds3(UserQueryVO vo);//根据多个id 查询 
	List<User> findUserByIds4(UserQueryVO vo);//根据多个id 查询 
	
}
