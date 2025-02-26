package com.jtp.jutopia.web.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.DispatcherType;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
    	httpSecurity
        .authorizeHttpRequests(auth -> auth
            .anyRequest().permitAll() // 모든 요청을 인증 없이 허용
        )
        .csrf(csrf -> csrf.disable()) // CSRF 보호 비활성화
        .formLogin(login -> login.disable()) // 로그인 폼 비활성화
        .httpBasic(basic -> basic.disable()); // HTTP 기본 인증 비활성화

    	return httpSecurity.build();
    	
    	
    	
    	
    	
    	
    	
        // throws Exception 적는 이유 : authorizeHttpRequests, build가 예외를 던지고 있음.
//        httpSecurity
//            .authorizeHttpRequests((authorize) -> authorize
//            		.dispatcherTypeMatchers(DispatcherType.FORWARD, DispatcherType.INCLUDE).permitAll() // 내부 요청 허용
//                    .requestMatchers("/", "/index").permitAll() // 로그인 없이 접근 가능
//                    .requestMatchers("/css/**", "/js/**", "/images/**").permitAll() // 정적 리소스 허용
//                    .requestMatchers("/member/login").permitAll() // 로그인 페이지 접근 가능
//                    .anyRequest().authenticated() // 그 외 모든 요청은 로그인 필요
//            )
//            .formLogin((formLogin) -> formLogin
//                    .loginPage("/member/login") // 로그인 페이지 경로
//                    .loginProcessingUrl("/member/login") // 로그인 처리 경로
//                    .defaultSuccessUrl("/index",true) // 로그인 성공 시 이동할 페이지
//                    .permitAll()
//            )
//            .logout((logout) -> logout
//                    .logoutUrl("/logout") // 로그아웃 URL
//                    .logoutSuccessUrl("/index") // 로그아웃 후 이동할 페이지
//                    .invalidateHttpSession(true) // 세션 삭제
//            )
//            .csrf(csrf -> csrf.disable()); // 개발 중 CSRF 비활성화
//
//        return httpSecurity.build(); // SecurityFilterChain 객체를 반환
    }
}