//// this is the way basic auth was done before WebSecurityConfigurerAdapter was deprecated
//// refer to this if using older version of spring security
//package com.example.springsecuritytutorial.security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfigDeprecatedWay extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//        .authorizeRequests()
//        .anyRequest()
//        .authenticated()
//        .and()
//        .httpBasic();
//    }
//}
