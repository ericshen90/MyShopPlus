package com.eric.myshop.plus.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author EricShen
 * @date 2019-12-25
 */
@SpringBootApplication
@MapperScan(basePackages = "com.eric.myshop.plus.provider.dao")
public class ProviderAdminServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProviderAdminServiceApplication.class, args);
  }
}
