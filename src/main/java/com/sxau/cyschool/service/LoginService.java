package com.sxau.cyschool.service;

import com.sxau.cyschool.pojo.Admin;

import java.util.List;

/**
 * Created by gaohailong on 2016/12/1.
 */
public interface LoginService {

    /**
     * 验证用户
     *
     * @param aname
     * @param apass
     * @return
     * @throws Exception
     */
    List<Admin> queryAdmin(String aname, String apass) throws Exception;
}
