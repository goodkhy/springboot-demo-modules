package com.hiynn.usercenter.service.impl;


import com.hiynn.common.base.ResultInfo;
import com.hiynn.usercenter.dao.TestUserMapper;
import com.hiynn.usercenter.dto.TestUserDto;
import com.hiynn.usercenter.entity.SysUser;
import com.hiynn.usercenter.service.ITestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author: kehaiyong
 * @Description:
 * @Date: 2018/4/23 13:38
 * @ModifiedBy:
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class TestUserServiceImpl implements ITestUserService {

    @Autowired
    private TestUserMapper testUserMapper;

    /**
     * @author kehaiyong
     * @description 查询所有用户的基本信息
     * @date 2019/3/5 15:52
     * @param
     * @return
     * @modified By
     * @throws
     */
    @Override
    public ResultInfo selectAllUser() {
        try {
            List<SysUser> users = testUserMapper.selectAllUser();
            if (CollectionUtils.isEmpty(users)){
                return ResultInfo.failure("查询用户信息为空");
            }
            return ResultInfo.success("查询所有用户信息成功").build(users);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultInfo.failure("查询用户信息异常，请联系管理员");
        }
    }

    /**
     * @author kehaiyong
     * @description 根据用户Id查询用户的基本信息
     * @date 2019/3/5 16:06
     * @param userId 用户id
     * @return
     * @modified By
     * @throws
     */
    @Override
    public ResultInfo selectUserByUserId(Integer userId) {
        //基本参数校验
        if (null == userId){
            return ResultInfo.failure("用户id不能为空");
        }
        try {
            SysUser sysUser = testUserMapper.selectUserByuserId(userId);
            if (null == sysUser){
                return ResultInfo.failure("查询用户不存在");
            }
            return ResultInfo.success("查询用户成功").build(sysUser);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultInfo.failure("查询用户信息异常，请联系管理员");
        }
    }

    @Override
    public ResultInfo addUser(TestUserDto testUserDto) {
        //基本参数校验
        //添加逻辑
        return null;
    }
}
