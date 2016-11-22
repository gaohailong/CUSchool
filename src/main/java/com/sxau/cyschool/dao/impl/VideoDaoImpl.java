package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.BaseHibernateDao;
import com.sxau.cyschool.dao.VideoDao;
import com.sxau.cyschool.pojo.Video;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/22.
 */
public class VideoDaoImpl extends BaseHibernateDaoImpl<Video> implements VideoDao {

    public Video findVideoById(Integer id) throws Exception {
        Video video = this.getObject(Video.class, id);
        return video;
    }

    public void saveVideo(Video video) throws Exception {
        this.saveObject(video);
    }

    public void updateVideo(Video video) throws Exception {
        this.updateObjectOfUpdate(video);
    }

    public List<Video> findAllVideo() throws Exception {
        return this.queryAll(Video.class);
    }

    public void deleteVideoById(Integer id) throws Exception {
        this.deleteObjectsByIds(Video.class, new String[]{String.valueOf(id)});
    }

    public int findCountVideo() throws Exception {
        String hql = "select count(*) from Video";
        int count = this.getInt(hql);
        return count;
    }
}
