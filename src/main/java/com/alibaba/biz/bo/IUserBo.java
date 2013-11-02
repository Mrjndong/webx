package com.alibaba.biz.bo;

import com.alibaba.biz.User;

/**
 * 
 * 类IUserBo.java的实现描述：TODO 类实现描述 
 * @author Administrator 2013年10月31日 下午2:51:15
 */
public interface IUserBo {
    
    /**
     * 
     * @param user
     * @return
     */
     int save(User user);
     
     /**
      * 
      * @param user
      * @return
      */
     int del(User user);
     
     /**
      * 
      * @return
      */
     int count();
}
