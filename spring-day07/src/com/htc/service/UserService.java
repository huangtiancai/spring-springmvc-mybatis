/**
 * 
 */
package com.htc.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.htc.dao.UserDao;

/**  
* @ClassName:UserService
* @Description:
* @author:htc  
* @date:2019年7月29日 下午10:05:25
*/
public interface UserService {
	void delete(Integer id);
}
