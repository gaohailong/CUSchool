package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Admin;

import java.util.List;

/**
 * Created by gaohailong on 2016/12/1.
 */
public interface LoginDao {
    /**
     * 验证后台登陆用户
     *
     * @return
     * @throws Exception
     */
    List<Admin> verifyAdmin(String aname, String apass) throws Exception;
}
