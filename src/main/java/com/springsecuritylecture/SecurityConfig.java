package com.springsecuritylecture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        this.httpSecurity.authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated());
//        this.httpSecurity.formLogin(Customizer.withDefaults());

        http.authorizeHttpRequests((authorize) -> authorize.anyRequest().authenticated());
        http.formLogin(Customizer.withDefaults());

//        CustomSecurityConfigurer customSecurityConfigurer = new CustomSecurityConfigurer();
//        customSecurityConfigurer.setFlag(true);
        http.apply(new CustomSecurityConfigurer().setFlag(false));
        return http.build();
    };
}
