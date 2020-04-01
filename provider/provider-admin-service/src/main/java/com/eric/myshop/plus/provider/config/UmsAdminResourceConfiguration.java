package com.eric.myshop.plus.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 *
 * @author EricShen
 * @date 2020-03-26
 */
@Configuration
public class UmsAdminResourceConfiguration {

  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    // 配置默认的加密方式
    return new BCryptPasswordEncoder();
  }

}
