//package com.ghost.hcls.core.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * 系统默认界面设置
// *
// * @auther hzy
// * @data 2018/4/28 9:59
// * @QQ 291471000
// */
//@Configuration
//public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        // login页面在 templates 文件夹下
//        registry.addViewController("/").setViewName("login");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        super.addViewControllers(registry);
//    }
//}