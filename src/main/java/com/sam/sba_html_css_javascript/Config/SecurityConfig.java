package com.sam.sba_html_css_javascript.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                                authorizeRequests
//                                .requestMatchers("/index","/static/css/**","/static/images/**","/static/JS/**").permitAll()
                                        .requestMatchers("/static/css/**","/static/images/**","/static/JS/**").permitAll()
                                        .requestMatchers("/index").permitAll()
                                        .requestMatchers("/contact").permitAll()
                                        .requestMatchers("/about").permitAll()
                                        .requestMatchers("/login").permitAll()
                                        .requestMatchers("/contact/list").permitAll()
                                        .requestMatchers("/calculate").permitAll()
                                        .requestMatchers("/welcome").permitAll()
                                        .anyRequest().authenticated()
                )
                .formLogin(formLogin ->
                        formLogin
                                .defaultSuccessUrl("/contact", true)

                );
        return http.build();
    }
}

