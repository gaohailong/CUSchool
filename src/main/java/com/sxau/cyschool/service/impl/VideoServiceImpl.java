package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.VideoDao;
import com.sxau.cyschool.pojo.Video;
import com.sxau.cyschool.service.VideoService;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/22.
 */
public class VideoServiceImpl implements VideoService {
    private VideoDao videoDao;

    public Video findVideoById(Integer id) throws Exception {
        return this.videoDao.findVideoById(id);
    }

    public void saveVideo(Video video) throws Exception {
        this.videoDao.saveVideo(video);
    }

    public void updateVideo(Video video) throws Exception {
        this.videoDao.updateVideo(video);
    }

    public List<Video> findAllVideo() throws Exception {
        return this.videoDao.findAllVideo();
    }

    public void deleteVideoById(Integer id) throws Exception {
        this.videoDao.deleteVideoById(id);
    }

    public int findCountVideo() throws Exception {
        int count = this.videoDao.findCountVideo();
        return count;
    }

    public VideoDao getVideoDao() {
        return videoDao;
    }

    public void setVideoDao(VideoDao videoDao) {
        this.videoDao = videoDao;
    }
}
