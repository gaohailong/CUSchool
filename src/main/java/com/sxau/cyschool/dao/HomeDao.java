package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.pojo.Video;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/29.
 * 首页
 */
public interface HomeDao {

    /**
     * 查询学校要闻
     *
     * @return
     * @throws Exception
     */
    List<Title> queryNews() throws Exception;

    /**
     * 查询轮播图
     *
     * @return
     * @throws Exception
     */
    List<Title> queryRotate() throws Exception;

    /**
     * 查询通知
     *
     * @return
     * @throws Exception
     */
    List<Title> queryNotification() throws Exception;

    /**
     * 查询毕业风采
     *
     * @return
     * @throws Exception
     */
    List<Title> queryGraduation() throws Exception;

    /**
     * 点击加一
     *
     * @throws Exception
     */
    void clickReading(Integer id) throws Exception;

    /**
     * 通过关键字查找文章
     *
     * @return
     * @throws Exception
     */
    List<Title> queryAllTitleByKey(Title title, int page, int rows) throws Exception;

    /**
     * 查询文章的总数
     *
     * @param title
     * @return
     * @throws Exception
     */
    Integer queryCountTitleByKey(Title title) throws Exception;
}
