package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.pojo.Video;
import com.sxau.cyschool.service.VideoService;

import java.util.Date;
import java.util.List;

/**
 * Created by gaohailong on 2016/11/22.
 */
public class VideoAction extends ActionSupport {
    private VideoService videoService;

    private Integer vid;
    private List<Video> videos;
    private Video video;
    private String desc;
    private String link;

    public String findSchool() throws Exception {
        videos = videoService.findAllVideo();
        return "findVideo";
    }

    public String findOneSchool() throws Exception {
        video = videoService.findVideoById(vid);
        return "findOneVideo";
    }

    public String deleteSchool() throws Exception {
        videoService.deleteVideoById(vid);
        return SUCCESS;
    }

    public String addSchool() throws Exception {
        if (videoService.findCountVideo() > 0) {
            return ERROR;
        } else {
            Video video = new Video();
            video.setVLink(link);
            video.setVDes(desc);
            video.setVRead(0);
            video.setVDate(new Date());
            videoService.saveVideo(video);
            return null;
        }
    }

    public String updateSchool() throws Exception {
        System.out.print("tsteeeee=========="+vid);
        Video video = videoService.findVideoById(vid);
        video.setVLink(link);
        video.setVDes(desc);
        System.out.print("link"+link+"desc"+desc);
        videoService.updateVideo(video);
        return null;
    }

    public VideoService getVideoService() {
        return videoService;
    }

    public void setVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
