package com.hsj.demo.mapper;

import com.hsj.demo.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from sys_user")
    List<User> findAll();
    @Insert("insert into sys_user(username,password,nickname,email,phone,address)" +
            " values (#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    int insert(User user);
    @Delete("delete from sys_user where id = #{id}")
    Integer deleteById(Integer id);
}
