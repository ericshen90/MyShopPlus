package com.eric.myshop.plus.provider.service.impl;

import com.eric.myshop.plus.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author EricShen
 * @date 2019-12-25
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

  @Override
  public String echo(String str) {
    return "Echo from Dubbo " + str;
  }
}

