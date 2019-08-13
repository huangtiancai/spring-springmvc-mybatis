package com.htc.mapper;

import com.htc.pojo.User;
import com.htc.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	//mapper接口中的方法解析:
	//按条件计数
    int countByExample(UserExample example);
    //按条件删除
    int deleteByExample(UserExample example);
    //按主键删除
    int deleteByPrimaryKey(Integer id);
    
    //插入数据，返回值的ID
    int insert(User record);
    //Integer insert(User record);
    //String insert(User record);
    
    //插入一条数据,只插入不为null的字段
    int insertSelective(User record);
    //insertSelective(User record);
    //String insertSelective(User record);
    
    //按主键查询
    User selectByPrimaryKey(Integer id);
    //按条件查询
    List<User> selectByExample(UserExample example);
    //按条件查询（包括BLOB字段）。只有当数据表中的字段类型有为二进制的才会产生。
    List<User> selectByExampleWithBLOGs(UserExample example);
    
    //按主键更新
    int updateByPrimaryKey(User record);
    //按主键更新值不为null的字段
    int updateByPrimaryKeySelective(User record);
    //按条件更新
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
    //按条件更新值不为null的字段
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);
    
    
    
}