package com.eric.myshop.plus.business.controller;

import com.eric.myshop.plus.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2020-03-26
 */
@RestController
@RequestMapping("echo")
public class EchoController {

  @Reference(version = "1.0.0")
  private EchoService echoService;

  @GetMapping("{name}")
  public String hi(@PathVariable String name) {
    return echoService.echo(name);
  }

}
