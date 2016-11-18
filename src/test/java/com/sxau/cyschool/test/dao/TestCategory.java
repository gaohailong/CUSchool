package com.sxau.cyschool.test.dao;

import com.sxau.cyschool.dao.BaseHibernateDao;
import com.sxau.cyschool.dao.CategoryDao;
import com.sxau.cyschool.dao.impl.BaseHibernateDaoImpl;
import com.sxau.cyschool.dao.impl.CategoryDaoImpl;
import com.sxau.cyschool.pojo.Category;
import com.sxau.cyschool.test.base.TSpringHibernate;
import org.junit.Test;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/18.
 */
public class TestCategory extends TSpringHibernate {
    private CategoryDao categoryDao = new CategoryDaoImpl();
    private BaseHibernateDao<Category> categoryBaseHibernateDao = new BaseHibernateDaoImpl<Category>();

    @Test
    public void testHibernate() {
        String hql = "from Category c where c.CContent ='test";
        try {
            List<Category> list = categoryBaseHibernateDao.queryObject(hql);
            System.out.print(list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetCategoryByName() {
        try {
            String name = "test";
            categoryDao.getCategoryByName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
