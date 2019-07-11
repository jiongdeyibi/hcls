package com.ghost.hcls.sys.entity;

import com.ghost.hcls.core.entity.BaseEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_role", schema = "hcls")
@Data
public class SysRole extends BaseEntity implements GrantedAuthority {
    @Column(name = "sys_user_id", columnDefinition = "varchar(256) comment '用户id'")
    private String userId;

    @Column(name = "role_name", columnDefinition = "varchar(256) comment '角色名称'")
    private String roleName;

    @Override
    public String getAuthority() {
        return this.roleName;
    }
}
