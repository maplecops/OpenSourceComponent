package com.maple.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 21:52
 */
@Alias("RolePrivilege")
@Data
public class RolePrivilege {

    private Long id;

    private Long roleId;

    private Long privilegeId;

}
