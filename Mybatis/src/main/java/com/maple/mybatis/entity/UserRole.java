package com.maple.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 21:50
 */
@Alias("UserRole")
@Data
public class UserRole {

    private Long id;

    private Long userId;

    private Long roleId;

}
