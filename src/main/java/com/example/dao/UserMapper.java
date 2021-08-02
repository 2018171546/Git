package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    // 新增数据
    @Insert("insert into user(id,email,password,username) values(#{id},#{email},#{password},#{username}) ")
    boolean insertUser(User user);

    // 更改数据
    @Update("update user set password=#{password},username=#{username},id=#{id},email=#{email} where id=#{id}")
    boolean updateUserById(User user);

    // 删除数据
    @Delete("delete from user where id=#{id}")
    boolean deleteUserById(long id);

    // 根据username查询数据
    @Select("select id,email,password,username from user where username=#{username}")
    User gerUserByUsername(String username);

    @Select("select id,email,password,username from user where username like #{username} ")
    List<User> findUserByUsername(String username);

    // 查询所有数据
    @Select("select id,email,password,username from user")
    List<User> listUsersAll();

}
