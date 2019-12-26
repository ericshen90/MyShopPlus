package com.eric.myshop.plus.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eric.myshop.plus.provider.dao.UmsAdminDao;
import com.eric.myshop.plus.provider.entity.UmsAdmin;
import com.eric.myshop.plus.provider.service.UmsAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Eric Shen
 * @since 2019-12-25
 */
@Service
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminDao, UmsAdmin> implements
    UmsAdminService {

}
