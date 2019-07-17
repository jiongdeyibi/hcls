package com.ghost.hcls.core.config;

import com.ghost.hcls.core.util.ResultMap;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        ResultMap resultMap = new ResultMap();

        resultMap.setSuccess(true);
        resultMap.setCode("200");
        resultMap.setMsg("Login Success!");

        httpServletResponse.getWriter().write(resultMap.toString());
    }
}
