package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Image;

import java.util.List;

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

    /**
     * 修改阅读量
     *
     * @throws Exception
     */
    void imageClickRead(Integer id) throws Exception;

    /**
     * 通过关键字查找图片
     *
     * @return
     * @throws Exception
     */
    List<Image> queryAllImageByKey(Image image, int page, int rows) throws Exception;

    /**
     * 查找图片总数
     *
     * @param image
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    Integer queryCountByKey(Image image) throws Exception;
}
