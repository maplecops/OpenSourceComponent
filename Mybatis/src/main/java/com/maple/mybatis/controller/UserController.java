package com.maple.mybatis.controller;

import com.maple.mybatis.entity.User;
import com.maple.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 22:06
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    UserMapper userMapper;

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    @GetMapping("/{userName}")
    public User getUserByName(@PathVariable("userName") String userName) {
        return userMapper.selectUserByUserName(userName);
    }

    @PostMapping()
    public Long insertUser(@RequestBody User user) {
        log.info("user info is [{}]", user);
        int returnValue = userMapper.insertUser(user);
        log.info("return values is [{}]", returnValue);
        return user.getId();
    }

    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable("id") Long id) {
        return userMapper.deleteUserById(id);
    }
}
