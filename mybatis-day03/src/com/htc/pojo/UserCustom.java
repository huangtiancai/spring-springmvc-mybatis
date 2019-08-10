/**
 * 
 */
package com.htc.pojo;

import java.util.List;

/**  
* @ClassName UserCustom
* @Description:用户扩展类
* @author htc  
* @date 2019年8月10日上午10:12:28 
*/
public class UserCustom extends User{
	//扩展
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	
}
