package com.htc.bean;
import java.util.Date;

/**
 * 
 */

/**  
* @ClassName:User
* @Description:
* @author:htc  
* @date:2019年7月31日 下午10:14:59
*/
public class User {
	private Integer userid;
	private String username;
	private String userpwd;
	private String head;
	private Date regtime;
	private Integer sex;

	public User() {
		
	}

	/**
	 * @return the userid
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the userpwd
	 */
	public String getUserpwd() {
		return userpwd;
	}

	/**
	 * @param userpwd the userpwd to set
	 */
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	/**
	 * @return the head
	 */
	public String getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(String head) {
		this.head = head;
	}

	/**
	 * @return the regtime
	 */
	public Date getRegtime() {
		return regtime;
	}

	/**
	 * @param regtime the regtime to set
	 */
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	/**
	 * @return the sex
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * @param userid
	 * @param username
	 * @param userpwd
	 * @param head
	 * @param regtime
	 * @param sex
	 */
	public User(Integer userid, String username, String userpwd, String head, Date regtime, Integer sex) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.head = head;
		this.regtime = regtime;
		this.sex = sex;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", head=" + head
				+ ", regtime=" + regtime + ", sex=" + sex + "]";
	}
	
	
	
}	
