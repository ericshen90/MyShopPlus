package com.eric.myshop.plus.business.controller;

import com.eric.myshop.plus.commoms.dto.ResponseResult;
import com.eric.myshop.plus.provider.api.UmsAdminService;
import com.eric.myshop.plus.provider.entity.UmsAdmin;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EricShen
 * @date 2020-03-30
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("reg")
public class UmsAdminController {

  @Reference(version = "1.0.0")
  private UmsAdminService umsAdminService;

  @PostMapping(value = "")
  public ResponseResult<UmsAdmin> reg(@RequestBody UmsAdmin umsAdmin) {
    String message = validReg(umsAdmin);

    if (message == null) {
      Boolean flag = umsAdminService.addUmsAdmin(umsAdmin);
      if (flag) {
        UmsAdmin admin = umsAdminService.get(umsAdmin.getUsername());
        return new ResponseResult<>(HttpStatus.OK.value(), "用户注册成功", admin);
      }
    }
    return new ResponseResult<>(HttpStatus.NOT_ACCEPTABLE.value(),
        message != null ? message : "用户注册失败");
  }

  private String validReg(UmsAdmin umsAdmin) {
    UmsAdmin admin = umsAdminService.get(umsAdmin.getUsername());
    if (admin == null) {
      return null;
    }

    return "用户名已存在";
  }
}
