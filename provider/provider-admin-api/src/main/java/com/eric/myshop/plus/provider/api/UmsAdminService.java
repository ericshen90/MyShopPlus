package com.eric.myshop.plus.provider.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eric.myshop.plus.provider.entity.UmsAdmin;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author Eric Shen
 * @since 2019-12-25
 */
public interface UmsAdminService extends IService<UmsAdmin> {

  Boolean addUmsAdmin(UmsAdmin umsAdmin);

  UmsAdmin get(String username);

  UmsAdmin get(UmsAdmin umsAdmin);

}
