package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Category;

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
     Category getCategoryByName(String categoryName) throws Exception;
}
