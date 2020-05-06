create table user(
                     id bigint(20) not null auto_increment comment '主键',
                     user_name varchar(50) comment '用户名',
                     user_password varchar(50) comment '密码',
                     user_email varchar(100) comment '邮箱',
                     user_info text comment '简介',
                     head_img blob comment '头像',
                     create_time datetime comment '创建时间',
                     primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 comment '用户表';

create table role(
                     id bigint(20) not null auto_increment comment '主键',
                     role_name varchar(50) comment '角色名称',
                     enable int(1) comment '有效标识 0-有效 1-失效',
                     create_by bigint comment '创建人',
                     create_time datetime comment '创建时间',
                     primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 comment '角色表';

create table privilege(
                          id bigint(20) not null auto_increment comment '主键',
                          privilege_name varchar(50) comment '权限名称',
                          privilege_url varchar(100) comment '权限URL',
                          primary key (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 comment '权限表';

create table user_role(
                          id bigint(20) not null auto_increment comment '主键',
                          user_id bigint comment '用户id',
                          role_id bigint comment '角色id',
                          primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 comment '用户角色表';

create table role_privilege(
                               id bigint(20) not null auto_increment comment '主键',
                               role_id bigint comment '角色id',
                               privilege_id bigint comment '权限id',
                               primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8 comment '角色权限表';