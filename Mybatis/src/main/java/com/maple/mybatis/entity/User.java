package com.maple.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 21:43
 */
@Alias("User")
@Data
public class User {

    private Long id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userInfo;

    private byte[] headImg;

    private Date createTime;

}
