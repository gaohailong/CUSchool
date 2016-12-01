package com.sxau.cyschool.service;

import com.sxau.cyschool.pojo.Title;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/29.
 */
public interface HomeService {
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
     * @throws Exception
     */
    void clickReading(Integer id) throws Exception;
}
