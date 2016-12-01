package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.LoginDao;
import com.sxau.cyschool.pojo.Admin;

import java.util.List;

/**
 * Created by gaohailong on 2016/12/1.
 */
public class LoginDaoImpl extends BaseHibernateDaoImpl<Admin> implements LoginDao {
    public List<Admin> verifyAdmin(String aname, String apass) throws Exception {
        String hql = "from Admin a where a.AName = ? and a.APass = ? ";
        List<Admin> admins = this.queryObject(hql, new Object[]{aname, apass});
        return admins;
    }
}
