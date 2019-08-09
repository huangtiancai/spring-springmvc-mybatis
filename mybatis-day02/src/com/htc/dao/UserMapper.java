/**
 * 
 */
package com.htc.dao;

import java.util.List;

import com.htc.pojo.User;

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
}
