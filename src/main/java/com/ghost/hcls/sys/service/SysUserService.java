package com.ghost.hcls.sys.service;

import com.ghost.hcls.core.util.ResultMap;
import com.ghost.hcls.sys.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    SysUserRepository sysUserRepository;

    public ResultMap findAll() {
        return ResultMap.success().setData(sysUserRepository.findAll());
    }
}
