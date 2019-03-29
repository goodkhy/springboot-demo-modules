package com.hiynn.usercenter.service;


import com.hiynn.common.base.ResultInfo;
import com.hiynn.usercenter.dto.TestUserDto;

/**
 * @Author: kehaiyong
 * @Description:
 * @Date: 2018/4/23 13:37
 * @ModifiedBy:
 */
public interface ITestUserService {

    /**
     * @author kehaiyong
     * @description 查询所有用户的基本信息
     * @date 2019/3/5 15:52
     * @param
     * @return
     * @modified By
     * @throws
     */
    ResultInfo selectAllUser();

    /**
     * @author kehaiyong
     * @description 根据用户Id查询用户的基本信息
     * @date 2019/3/5 16:13
     * @param userId 用户id
     * @return
     * @modified By
     * @throws
     */
    ResultInfo selectUserByUserId(Integer userId);

    /**
     * @author kehaiyong
     * @description
     * @date 2019/3/5 16:18
     * @param testUserDto
     * @return
     * @modified By
     * @throws
     */
    ResultInfo addUser(TestUserDto testUserDto);
}
