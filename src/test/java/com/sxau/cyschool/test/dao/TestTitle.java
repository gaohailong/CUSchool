package com.sxau.cyschool.test.dao;

import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.dao.impl.TitleDaoImpl;
import com.sxau.cyschool.test.base.TSpringHibernate;
import org.junit.Test;

/**
 * Created by gaohailong on 2016/11/16.
 */
public class TestTitle extends TSpringHibernate {
    private TitleDao titleDao = new TitleDaoImpl();

    @Test
    public void testQueryTitleByPageAndCondition() {
        try {
            System.out.print(titleDao.queryTitleByPageAndCondition(null, 1, 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
