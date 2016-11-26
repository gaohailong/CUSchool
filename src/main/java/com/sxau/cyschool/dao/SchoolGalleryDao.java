package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Image;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/24.
 */
public interface SchoolGalleryDao {
    /**
     * 通过id删除
     *
     * @param id
     * @throws Exception
     */
    void deletePhotoById(Integer id) throws Exception;

    /**
     * 修改
     *
     * @param image
     * @throws Exception
     */
    void updatePhotoByPhoto(Image image) throws Exception;

    /**
     * 添加
     *
     * @param image
     * @throws Exception
     */
    void savePhoto(Image image) throws Exception;

    /**
     * 分页条件查询
     *
     * @param image
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    List<Image> queryImageByCondition(Image image, int page, int rows) throws Exception;

    /**
     * 条件查询图片总数
     *
     * @param image
     * @return
     * @throws Exception
     */
    int queryImageCount(Image image) throws Exception;

    /**
     * 通过id查询图片
     * @param id
     * @return
     * @throws Exception
     */
    Image findImageById(int id) throws Exception;
}
