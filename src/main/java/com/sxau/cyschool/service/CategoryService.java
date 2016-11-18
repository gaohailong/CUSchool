package com.sxau.cyschool.service;

import com.sxau.cyschool.pojo.Category;

/**
 * Created by gaohailong on 2016/11/18.
 */
public interface CategoryService {
    Category getCategoryByName(String name) throws Exception;
}
