package com.eric.myshop.plus.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台用户表
 * </p>
 *
 * @author Eric Shen
 * @since 2019-12-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_admin")
public class UmsAdmin implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  private String username;

  private String password;

  /**
   * 头像
   */
  private String icon;

  /**
   * 邮箱
   */
  private String email;

  /**
   * 昵称
   */
  private String nickName;

  /**
   * 备注信息
   */
  private String note;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 最后登录时间
   */
  private Date loginTime;

  /**
   * 帐号启用状态：0->禁用；1->启用
   */
  private Integer status;


  public static final String ID = "id";

  public static final String USERNAME = "username";

  public static final String PASSWORD = "password";

  public static final String ICON = "icon";

  public static final String EMAIL = "email";

  public static final String NICK_NAME = "nick_name";

  public static final String NOTE = "note";

  public static final String CREATE_TIME = "create_time";

  public static final String LOGIN_TIME = "login_time";

  public static final String STATUS = "status";

}
