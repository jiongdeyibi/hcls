package com.ghost.hcls.sys.controller;

import com.ghost.hcls.core.util.ResultMap;
import com.ghost.hcls.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {
    @Autowired
    SysUserService sysUserService;

    @RequestMapping("/login")
    public ResultMap list(){
        return ResultMap.success().setData("good");
    }
}
