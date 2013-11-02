package com.alibaba.biz.bo.impl;

import javax.annotation.Resource;

import com.alibaba.biz.User;
import com.alibaba.biz.bo.IUserBo;
import com.alibaba.biz.mapper.UserMapperExt;

/**
 * 类UserBoImpl.java的实现描述：TODO 类实现描述
 * 
 * @author Administrator 2013年10月31日 下午2:52:12
 */
public class UserBoImpl implements IUserBo {

    @Resource
    private UserMapperExt userMapperExt;

    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public int del(User user) {
        return 0;
    }

    @Override
    public int count() {
        return userMapperExt.selectAppUser(null);
    }

}
