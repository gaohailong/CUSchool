package com.sxau.cyschool.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.sxau.cyschool.pojo.Admin;

import java.util.Map;

/**
 * Created by gaohailong on 2016/12/1.
 */
public class LoginInterceptor extends MethodFilterInterceptor {

    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {   System.out.print("拦截器进入了");
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        Admin admin = (Admin) session.get("admin");
        if (admin == null) {
            return "fail";
        }
        return actionInvocation.invoke();
    }
}
