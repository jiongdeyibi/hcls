package com.ghost.hcls.sys.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ghost.hcls.core.entity.BaseEntity;
import com.ghost.hcls.core.entity.BaseTimeEntity;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "sys_user", schema = "hcls")
@Data
public class SysUser extends BaseTimeEntity implements UserDetails {

    @Column(name = "user_account", columnDefinition = "varchar(256) comment '用户账号'")
    private String userAccount;

    @Column(name = "password", columnDefinition = "varchar(256) comment '用户密码'")
    private String password;

    @Column(name = "user_name", columnDefinition = "varchar(256) comment '用户姓名'")
    private String userName;

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private List<SysRole> sysRoles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (SysRole sysRole : sysRoles) {
            authorities.add(new SimpleGrantedAuthority(sysRole.getRoleName()));
        }
        return authorities;
    }

    @Override
    @JsonIgnore
    public String getUsername() {
        return this.userAccount;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @JsonIgnore
    public boolean isEnabled() {
        return super.getAble();
    }
}
