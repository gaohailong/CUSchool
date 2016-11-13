package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class BaseAction extends ActionSupport {
    /*
    *第几页
     */
    private int offest;
    /*
     * 每页显示的条数
	 */
    private int limit;
    /*
     * 查询条件
	 */
    private String whereSql;
    /*
     * 排序条件
	 */
    private String orderSql;

    /**
     * 获取url参数的值
     *
     * @param parameter
     * @return
     */
    public String getParameter(String parameter) {
        return this.getRequest().getParameter(parameter);
    }

    /**
     * 获取request对象
     *
     * @return
     */
    public HttpServletRequest getRequest() {
        return ServletActionContext.getRequest();
    }

    /**
     * 获取response对象
     *
     * @return
     */
    public HttpServletResponse getResponse() {
        return ServletActionContext.getResponse();
    }

    /**
     * 获取session对象
     *
     * @return
     */
    public HttpSession getSession() {
        return this.getRequest().getSession();
    }

    /**
     * 获取application对象
     *
     * @return
     */
    public ServletContext getApplication() {
        return ServletActionContext.getServletContext();
    }

    /**
     * 将对象保存session中
     *
     * @param key
     * @param obj
     */
    public void setSessionAttribute(String key, Object obj) {
        if (key != null && !key.trim().equals("")) {
            this.getSession().setAttribute(key, obj);
        }
    }

    /**
     * 获取session中的对象
     *
     * @param key
     * @return
     */
    public Object getSessionAttribute(String key) {
        if (key != null && !key.trim().equals(""))
            return this.getSession().getAttribute(key);
        else
            return null;
    }

    /**
     * 删除对象
     *
     * @param key
     */
    public void removeSessionAttribute(String key) {
        if (key != null && !key.trim().equals(""))
            this.getSession().removeAttribute(key);
    }

    public int getOffest() {
        return offest;
    }

    public void setOffest(int offest) {
        this.offest = offest;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getWhereSql() {
        return whereSql;
    }

    public void setWhereSql(String whereSql) {
        this.whereSql = whereSql;
    }

    public String getOrderSql() {
        return orderSql;
    }

    public void setOrderSql(String orderSql) {
        this.orderSql = orderSql;
    }
}
