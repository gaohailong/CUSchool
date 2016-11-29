package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Image;

/**
 * Created by gaohailong on 2016/11/29.
 */
public interface ImageDao {
    /**
     * 查询图片
     *
     * @return
     * @throws Exception
     */
    Image queryImage() throws Exception;
}
