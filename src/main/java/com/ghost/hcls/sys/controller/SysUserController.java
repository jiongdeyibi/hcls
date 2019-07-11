package com.ghost.hcls.sys.controller;

import com.ghost.hcls.core.util.ResultMap;
import com.ghost.hcls.sys.repository.SysUserRepository;
import com.ghost.hcls.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sysUser")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;

    @RequestMapping("/list")
    public ResultMap list(){
        return sysUserService.findAll();
    }
}
