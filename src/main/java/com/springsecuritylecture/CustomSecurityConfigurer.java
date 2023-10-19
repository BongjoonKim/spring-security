package com.springsecuritylecture;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class CustomSecurityConfigurer extends AbstractHttpConfigurer<CustomSecurityConfigurer, HttpSecurity> {

    // 테스트
    private boolean isSecure;

    @Override
    public void init(HttpSecurity builder) throws Exception {
        super.init(builder);
        System.out.println("init method start");
    }

    @Override
    public void configure(HttpSecurity builder) throws Exception {
        super.configure(builder);
        System.out.println("configure method start");
        if (isSecure) {
            System.out.println("http is required");
        } else {
            System.out.println("http is optional");

        }
    }

    public CustomSecurityConfigurer setFlag(boolean isSecure) {
        this.isSecure = isSecure;
        return this;

    }
}
