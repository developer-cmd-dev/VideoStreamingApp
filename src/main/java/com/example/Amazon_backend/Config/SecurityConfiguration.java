package com.example.Amazon_backend.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(auth->{

                    auth.requestMatchers("/signup").permitAll()
                            .anyRequest().authenticated();


                })
                .sessionManagement(session->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                        )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
