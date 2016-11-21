package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.CategoryDao;
import com.sxau.cyschool.pojo.Category;
import com.sxau.cyschool.service.CategoryService;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/18.
 */
public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao;

    public Category getCategoryByName(String name) throws Exception {
        List<Category> categories = categoryDao.getSingleCategoryByName(name);
        return categories.get(0);
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
}
