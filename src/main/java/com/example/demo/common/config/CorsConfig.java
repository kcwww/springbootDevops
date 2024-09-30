package com.example.demo.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
  private final String FRONTEND_URL = "http://localhost:3000";
  private final String FRONTEND_URL_PROD = "https://www.jungchanye.store";
  private final String FRONTEND_URL_PROD2 = "https://jungchanye.store";

  @Bean
  public CorsFilter corsFilter() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    config.addAllowedOrigin(FRONTEND_URL);
    config.addAllowedOrigin(FRONTEND_URL_PROD);
    config.addAllowedOrigin(FRONTEND_URL_PROD2);
    config.addAllowedMethod(HttpMethod.GET);
    config.addAllowedMethod(HttpMethod.POST);
    config.addAllowedMethod(HttpMethod.PUT);
    config.addAllowedMethod(HttpMethod.DELETE);
    config.addAllowedHeader("*");
    source.registerCorsConfiguration("/**", config);
    return new CorsFilter(source);
  }
}
