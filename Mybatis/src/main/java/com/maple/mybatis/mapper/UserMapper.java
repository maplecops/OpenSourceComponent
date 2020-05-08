package com.maple.mybatis.mapper;

import com.maple.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    int updateUserByUserName(@Param("user") User user, @Param("userName") String userName);

    int deleteUserById(Long id);

    List<String> getEmailByUserNames(List<String> userNameList);

}
