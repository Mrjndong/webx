package com.alibaba.webx.heioo.app1.module.rpc;

import java.util.List;

import com.alibaba.biz.User;
import com.alibaba.citrus.extension.rpc.annotation.ResourceMapping;
import com.alibaba.citrus.extension.rpc.annotation.WebResource;

/**
 * 类UserRpc.java的实现描述：TODO 类实现描述
 * 
 * @author Administrator 2013年11月4日 上午11:12:35
 */

@WebResource("/userRpc")
public class UserRpc {

    @ResourceMapping("find")
    public List<User> queryUsers() {
        return null;
    }
}
