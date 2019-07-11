package com.ghost.hcls.sys.repository;

import com.ghost.hcls.sys.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SysUserRepository extends JpaRepository<SysUser, String> {
    @Query("select u from SysUser u where u.userAccount=?1")
    SysUser findByAccount(String userAccount);
}
