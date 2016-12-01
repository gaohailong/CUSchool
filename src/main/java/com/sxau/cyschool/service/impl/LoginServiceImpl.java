package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.LoginDao;
import com.sxau.cyschool.pojo.Admin;
import com.sxau.cyschool.service.LoginService;

import java.util.List;

/**
 * Created by gaohailong on 2016/12/1.
 */
public class LoginServiceImpl implements LoginService {
    private LoginDao loginDao;

    public List<Admin> queryAdmin(String aname, String apass) throws Exception {
        return loginDao.verifyAdmin(aname, apass);
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
}
