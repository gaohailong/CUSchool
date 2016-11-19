package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.CategoryDao;
import com.sxau.cyschool.exception.SystemException;
import com.sxau.cyschool.pojo.Category;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/18.
 */
public class CategoryDaoImpl extends BaseHibernateDaoImpl<Category> implements CategoryDao {
    public List<Category> getSingleCategoryByName(String categoryName) throws Exception {
        if (categoryName == null) {
            throw new SystemException("传入的参数为空");
        } else {
            String hql = "from Category c where c.CContent = ?";
            return this.querySingleObject(hql, categoryName);
        }
    }
}
