package com.hiynn.usercenter.dao;


import com.hiynn.usercenter.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: kehaiyong
 * @Description:
 * @Date: 2018/4/23 13:38
 * @ModifiedBy:
 */
public interface TestUserMapper {

    List<SysUser> selectAllUser();


    SysUser selectUserByuserId(@Param("userId") Integer userId);

}
