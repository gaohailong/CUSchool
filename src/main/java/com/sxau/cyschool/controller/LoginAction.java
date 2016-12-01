package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Admin;
import com.sxau.cyschool.service.LoginService;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/12/1.
 */
public class LoginAction extends ActionSupport {
    private LoginService loginService;

    private String aname;
    private String apass;
    private String message;

    public String findAdmin() throws Exception {
        aname = aname.trim();
        apass = apass.trim();
        List<Admin> admins = loginService.queryAdmin(aname, apass);
        if (admins != null && admins.size() != 0) {
            ActionContext actionContext = ActionContext.getContext();
            Map session = actionContext.getSession();
            session.put("admin", admins.get(0));
            return "main";
        } else {
            message = "用户名或密码错误";
            return "fail";
        }
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
