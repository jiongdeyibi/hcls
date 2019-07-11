package com.ghost.hcls.sys.repository;

import com.ghost.hcls.sys.entity.SysRole;
import com.ghost.hcls.sys.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysRoleRepository extends JpaRepository<SysRole, String> {
}
