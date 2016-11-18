package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.CategoryDao;
import com.sxau.cyschool.exception.SystemException;
import com.sxau.cyschool.pojo.Category;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/18.
 */
public class CategoryDaoImpl extends BaseHibernateDaoImpl<Category> implements CategoryDao {
    public Category getCategoryByName(String categoryName) throws Exception {
        System.out.print("test");
        if (categoryName == null) {
            throw new SystemException("传入的参数为空");
        } else {
            System.out.print("2");
            String hql = "from Category c where c.CContent = '" + categoryName + "'";
            System.out.print(hql);
            List<Category> categories = this.queryObject(hql);
            System.out.print(categories.size());
            Category category = categories.get(0);
            return category;
        }
    }
}
