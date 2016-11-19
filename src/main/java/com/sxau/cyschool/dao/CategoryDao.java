package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Category;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/18.
 */
public interface CategoryDao {
    /**
     * 通过分类名名查询分类
     * @param categoryName
     * @return
     * @throws Exception
     */
     List<Category> getSingleCategoryByName(String categoryName) throws Exception;
}
