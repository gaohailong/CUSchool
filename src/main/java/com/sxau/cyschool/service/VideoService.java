package com.sxau.cyschool.service;

import com.sxau.cyschool.pojo.Video;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/22.
 */
public interface VideoService {
    /**
     * 查询一个video
     *
     * @param id
     * @return
     * @throws Exception
     */
    Video findVideoById(Integer id) throws Exception;

    /**
     * 保存一个video
     *
     * @param video
     * @throws Exception
     */
    void saveVideo(Video video) throws Exception;

    /**
     * 更新一个video
     *
     * @param video
     * @throws Exception
     */
    void updateVideo(Video video) throws Exception;

    /**
     * 查询所有video
     *
     * @return
     * @throws Exception
     */
    List<Video> findAllVideo() throws Exception;

    /**
     * 通过id删除
     *
     * @throws Exception
     */
    void deleteVideoById(Integer id) throws Exception;

    /**
     * 查找所有的cideo总数
     *
     * @return
     * @throws Exception
     */
    int findCountVideo() throws Exception;
}
