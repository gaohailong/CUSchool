package com.sxau.cyschool.service;

import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.utils.Page;


/**
 * Created by gaohailong on 2016/11/29.
 */
public interface ImageService {
    /**
     * 查询图片
     *
     * @return
     * @throws Exception
     */
    Image queryImage() throws Exception;

    /**
     * 点击加一
     *
     * @throws Exception
     */
    void updateImgClickReading(Integer id) throws Exception;

    /**
     * 通过关键字查找图片
     *
     * @return
     * @throws Exception
     */
    Page<Image> queryAllImageByKey(Image image, int page, int rows) throws Exception;

    /**
     * 查找图片总数
     *
     * @param image
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
//    Integer queryCountByKey(Image image, int page, int rows) throws Exception;
}
