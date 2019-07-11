//package com.ghost.hcls.core.entity;
//
//import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.provider.ClientDetails;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import java.util.*;
//
//@Data
//@Entity
//@Table(name = "sys_oauth_client", schema = "shop")
//public class OauthClient extends BaseTimeEntity implements ClientDetails {
//
//    @Column(name = "client_id", unique = true, columnDefinition = "varchar(36) comment '客户编号'")
//    private String clientId;
//
//    @Column(name = "client_secret", columnDefinition = "varchar(60) comment '客户密码'")
//    private String clientSecret;
//
//    @Column(name = "supplier_id", columnDefinition = "varchar(36) comment '供应商编号'")
//    private String supplierId;
//
//    @Column(name = "resource_ids", columnDefinition = "varchar(128) comment '可访问资源'")
//    private String resourceIds;
//
//    @Column(name = "scopes", columnDefinition = "varchar(128) comment '可访问权限范围'")
//    private String scopes;
//
//    @Column(name = "authorities", columnDefinition = "varchar(128) comment '拥有权限'")
//    private String authorities;
//
//    @Column(name = "visits", columnDefinition = "int(10) comment '访问次数'")
//    private Integer visits;
//
//    @Override public String getClientId() {
//        return clientId;
//    }
//
//    @Override public Set<String> getResourceIds() {
//        return new HashSet<>(Arrays.asList(resourceIds.trim().split(",")));
//    }
//
//    @Override public boolean isSecretRequired() {
//        return true;
//    }
//
//    @Override public String getClientSecret() {
//        return clientSecret;
//    }
//
//    @Override public boolean isScoped() {
//        return true;
//    }
//
//    @Override public Set<String> getScope() {
//        return new HashSet<>(Arrays.asList(scopes.trim().split(",")));
//    }
//
//    @Override public Set<String> getAuthorizedGrantTypes() {
//        return new HashSet<>(Arrays.asList("client_credentials", "password", "refresh_token"));
//    }
//
//    @Override public Set<String> getRegisteredRedirectUri() {
//        return null;
//    }
//
//    @Override public Collection<GrantedAuthority> getAuthorities() {
//        HashSet<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        for(String auth : authorities.trim().split(",")){
//            grantedAuthorities.add(new SimpleGrantedAuthority(auth));
//        }
//        return grantedAuthorities;
//    }
//
//    @Override public Integer getAccessTokenValiditySeconds() {
//        return 24 * 3600;
//    }
//
//    @Override public Integer getRefreshTokenValiditySeconds() {
//        return 24 * 3600;
//    }
//
//    @Override public boolean isAutoApprove(String s) {
//        return false;
//    }
//
//    @Override public Map<String, Object> getAdditionalInformation() {
//        return null;
//    }
//}
