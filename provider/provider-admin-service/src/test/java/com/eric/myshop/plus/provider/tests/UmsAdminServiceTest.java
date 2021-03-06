package com.eric.myshop.plus.provider.tests;

import com.eric.myshop.plus.provider.entity.UmsAdmin;
import com.eric.myshop.plus.provider.api.UmsAdminService;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class UmsAdminServiceTest {

  @Resource
  private UmsAdminService umsAdminService;
  @Resource
  private BCryptPasswordEncoder bCryptPasswordEncoder;


  @Test
  @Transactional
  public void testSelectAll() {
    List<UmsAdmin> umsAdmins = umsAdminService.list();
    umsAdmins.forEach(umsAdmin -> System.out.println("umsAdmin = " + umsAdmin.toString()));
  }

  @Test
  public void testInsert() {
    UmsAdmin umsAdmin = new UmsAdmin();
    umsAdmin.setUsername("eric");
    umsAdmin.setPassword(bCryptPasswordEncoder.encode("123456"));
    umsAdmin.setEmail("ahsbt@126.com");
    umsAdmin.setNickName("bing");
    umsAdmin.setIcon("i");
    boolean flag = umsAdminService.save(umsAdmin);
    Assert.assertTrue(flag);
  }

}