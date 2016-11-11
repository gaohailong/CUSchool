package com.sxau.cyschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by gaohailong on 2016/11/11.
 */
@Repository
public class User {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void find(String isban){
        String hql="";
        getSession().createQuery(hql).setString(0,isban);
    }
}
