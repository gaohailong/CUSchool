package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.CategoryDao;
import com.sxau.cyschool.pojo.Category;
import com.sxau.cyschool.service.CategoryService;

/**
 * Created by gaohailong on 2016/11/18.
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao;

    public Category getCategoryByName(String name) throws Exception {
        return categoryDao.getCategoryByName(name);
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
}
