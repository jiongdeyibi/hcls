package com.ghost.hcls.sys.service;

import com.ghost.hcls.core.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @Autowired
    SysRoleService sysRoleService;

    public ResultMap findAll() {
        return ResultMap.success().setData(sysRoleService.findAll());
    }
}
