//package com.ghost.hcls.sys.entity;
//
//import com.ghost.hcls.core.entity.BaseEntity;
//import lombok.Data;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "sys_user_role", schema = "hcls")
//@Data
//public class SysUserRole extends BaseEntity{
//    @Column(name = "user_id", columnDefinition = "varchar(256) comment '用户id'")
//    String userId;
//
////    @Column(name = "role_id", columnDefinition = "varchar(256) comment '角色id'")
////    String roleId;
//
////    @OneToMany(cascade = {CascadeType.PERSIST})
////    @JoinColumn(name = "role_name")
//    @OneToOne
//    @JoinColumn(name="roleId",referencedColumnName="id")
//    private SysRole sysRole;
//    SysRole roleId;
//}
