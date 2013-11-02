package com.alibaba.biz.mapper;

import javax.annotation.Resource;

import com.alibaba.biz.User;

/**
 * 类UserMapperExt.java的实现描述：TODO 类实现描述
 * 
 * @author Administrator 2013年10月31日 下午3:39:07
 */

@Resource
public interface UserMapperExt {

    public int selectAppUser(User user);
}
