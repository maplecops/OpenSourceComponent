package com.maple.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 21:49
 */
@Alias("Privilege")
@Data
public class Privilege {

    private Long id;

    private String privilegeName;

    private String privilegeUrl;

}
