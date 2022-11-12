package com.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
@Component
public interface UserMapper extends BaseMapper<User>{

//    @Select("SELECT * from sys_s")
//    List<User> findAll();
//
//    @Insert("INSERT into sys_s(username, password,nickname,email,phone,address) VALUES (#{username}, #{password}," +
//            " #{nickname}, #{email},#{phone}, #{address})")
//    int insert(User user);
//
//    int update(User user);
//
//    @Delete("delete from sys_s where id = #{id}")
//    Integer deleteById(@Param("id") Integer id);
}
