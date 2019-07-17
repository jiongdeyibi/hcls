package com.ghost.hcls.core.config;

import com.ghost.hcls.sys.entity.SysUser;
import com.ghost.hcls.sys.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserService implements UserDetailsService{
    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String userAccount) throws UsernameNotFoundException {
        UserDetails userDetails=sysUserRepository.findByAccount(userAccount);
        if (userDetails == null) {
            throw new UsernameNotFoundException("用户登录失败");
        }
        return userDetails;
    }
}
