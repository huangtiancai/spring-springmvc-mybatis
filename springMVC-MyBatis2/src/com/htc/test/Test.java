/**
 * 
 */
package com.htc.test;

/**  
* @ClassName Test
* @Description:测试类
* @author htc  
* @date 2019年8月14日上午11:49:12 
*/
public class Test {
	@org.junit.Test
	public void testStrOut(){
		//双引号内使用双引号必须在里面的双引号前加转义字符"\"
		System.out.println("\"这是一串带双引号的字符串\"");
	}
}
