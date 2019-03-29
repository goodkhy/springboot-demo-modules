package com.hiynn.usercenter.controller;


import com.hiynn.common.base.ResultInfo;
import com.hiynn.usercenter.dto.TestUserDto;
import com.hiynn.usercenter.service.ITestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: kehaiyong
 * @Description: 测试接口
 * @Date: 2018/4/23 13:37
 * @ModifiedBy:
 */
@Api(value = "用户操作测试接口", tags = {"TestUserController"},description = "用户操作测试接口")
@RestController
@RequestMapping("/test_users")
public class TestUserController {
    private static final Logger logger = LoggerFactory.getLogger(TestUserController.class);

    @Autowired
    private ITestUserService userService;

    /**
     * @author kehaiyong
     * @description 查询所有用户的基本信息
     * @date 2019/3/5 15:52
     * @param
     * @return
     * @modified By
     * @throws
     */
    @ApiOperation(value = "查询所有用户的基本信息", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultInfo selectAllUser(){
        ResultInfo result = userService.selectAllUser();
        return result;
    }

    /**
     * @author kehaiyong
     * @description 根据用户Id查询用户的基本信息
     * @date 2019/3/5 15:51
     * @param userId 用户id
     * @return
     * @modified By
     * @throws
     */
    @ApiOperation(value = "根据用户Id查询用户的基本信息", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true, paramType = "path", dataType = "int")
    })
    @GetMapping(value = "/{userId}/id", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultInfo selectUserByuserId(@PathVariable("userId") Integer userId){
        ResultInfo resultInfo = userService.selectUserByUserId(userId);
        return resultInfo;
    }

    /**
     * @author kehaiyong
     * @description 新增用户接口
     * @date 2019/3/5 16:17
     * @param testUserDto 添加用户前端参数传输类
     * @return
     * @modified By
     * @throws
     */
    @ApiOperation(value = "添加用户", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResultInfo addUser(@RequestBody TestUserDto testUserDto){
        ResultInfo resultInfo = userService.addUser(testUserDto);
        return resultInfo;
    }

}
