package com.ghost.hcls.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //        http
        //                .authorizeRequests()
        //                .antMatchers("/","/styles/**","/scripts/**").permitAll() //指定那些URL不要被保护
        //                .antMatchers("/res/list").hasRole("USER") //ROLE_ 去除  一定要在 /** 前面才有作用
        //                .antMatchers("/**").hasRole("ADMIN")  //此处要把 ROLE_ 去除
        //                .anyRequest().authenticated()
        //                .and()
        //                .formLogin()
        //                .loginPage("/login") //登录的时候你要跳转到哪里
        //                .failureUrl("/login?error") //失败页面
        //                .permitAll() //登录任意访问
        //                .and()
        //                .rememberMe() //rememberMe
        //                .and() //注销行为任意访问
        //                .logout()
        //                .permitAll()
        //                .and()
        //                .csrf() //关闭csrf 不然不支持post
        //                .disable();

        http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .authorizeRequests()                                            //默认拦截所有
                .antMatchers("/oauth/**", "/v2/**").permitAll()               //不拦截路径
                .anyRequest().authenticated()
                .antMatchers("/api/**").hasAnyAuthority("e_mall_role")
        ;
        http.headers().cacheControl();

    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    UserDetailsService customUserService() { //注册UserDetailsService 的bean
        return new CustomerUserService(); //注入刚刚写的service
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(customUserService()); //user Details Service验证
        /*auth
                .inMemoryAuthentication()
                //用户名密码和角色
                .withUser("jyq").password("123456").roles("USER");*/
    }
}
