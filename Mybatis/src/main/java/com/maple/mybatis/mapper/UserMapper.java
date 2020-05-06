package com.maple.mybatis.mapper;

import com.maple.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 21:53
 */
@Mapper
public interface UserMapper {

    List<User> selectAll();

    User selectUserByUserName(String userName);

    int insertUser(User user);

    //int updateUserByUserName(User user, String userName);

    int deleteUserById(Long id);

}
