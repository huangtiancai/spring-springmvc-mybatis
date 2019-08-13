/**
 * 
 */
package com.htc.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
* @ClassName DateConverter
* @Description:自定义Converter:日期转换器
* @author htc  
* @date 2019年8月13日下午4:20:51
 */

//Converter<S, T>
//S:source:需要转换的源的类型
//T:target:需要转换的目标类型
public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		//把字符串转换为日期类型
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = simpleDateFormat.parse(source);
			return date;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果转换异常则返回空
		return null;
	}

}
