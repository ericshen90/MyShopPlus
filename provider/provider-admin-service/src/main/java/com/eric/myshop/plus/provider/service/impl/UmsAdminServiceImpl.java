package com.eric.myshop.plus.provider.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eric.myshop.plus.provider.api.UmsAdminService;
import com.eric.myshop.plus.provider.dao.UmsAdminDao;
import com.eric.myshop.plus.provider.entity.UmsAdmin;
import java.util.Date;
import javax.annotation.Resource;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Eric Shen
 * @since 2019-12-25
 */
@Service(version = "1.0.0")
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminDao, UmsAdmin> implements
    UmsAdminService {

  @Resource
  private BCryptPasswordEncoder bCryptPasswordEncoder;


  @Override
  public Boolean addUmsAdmin(UmsAdmin umsAdmin) {
    initUmsAdmin(umsAdmin);
    return save(umsAdmin);
  }

  @Override
  public UmsAdmin get(String username) {
    return getOne(new QueryWrapper<UmsAdmin>().eq(UmsAdmin.USERNAME, username));
  }

  @Override
  public UmsAdmin get(UmsAdmin umsAdmin) {
    return null;
  }

  /**
   * 初始化用户对象
   *
   * @param umsAdmin {@link UmsAdmin}
   */
  private void initUmsAdmin(UmsAdmin umsAdmin) {
    Date now = new Date();
    umsAdmin.setCreateTime(now);
    umsAdmin.setLoginTime(now);

    if (umsAdmin.getStatus() == null) {
      umsAdmin.setStatus(0);
    }

    umsAdmin.setPassword(bCryptPasswordEncoder.encode(umsAdmin.getPassword()));
  }

}
