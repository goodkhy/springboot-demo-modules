/*
 * Copyright (C), 2013-2018, 天津大海云科技有限公司
 */
package com.hiynn.common.base;

/**
 * 分页参数 通用类
 *
 * @author kehaiyong
 * @date 2018/9/10 11:13
 * @modified By kehaiyong
 * @since 1.0.0
 */
public class BasePage {

    private Integer pageNum = 1;//当前页数

    private Integer pageSize = 10;//每页记录数

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

