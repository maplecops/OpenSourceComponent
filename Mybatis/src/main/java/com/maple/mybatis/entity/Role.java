package com.maple.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 21:46
 */
@Alias("Role")
@Data
public class Role {

    private Long id;

    private String roleName;

    private Integer enabled;

    private Long createBy;

    private Date createTime;

}
