/**
 * 
 */
package com.htc.controller;

import javax.annotation.Resource;

import com.htc.service.UserService;

/**  
* @ClassName:UserController
* @Description:
* @author:htc  
* @date:2019年7月30日 下午11:46:44
*/
public class UserController {
	@Resource(name="us")
	private UserService us = null;

	public void setUs(UserService us) {
		this.us = us;
	}
	
	
}
