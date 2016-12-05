package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.qiniu.util.Auth;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.pojo.Video;
import com.sxau.cyschool.service.VideoService;
import net.sf.json.JSONObject;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private String videoToken;
    private String message;

    public String findSchool() throws Exception {
        videos = videoService.findAllVideo();
        return "findVideo";
    }

    public String findOneSchool() throws Exception {
        video = videoService.findVideoById(vid);
        String ACCESS_KEY = "lJUnoZL99-hVC8NIONJP1cm0zWyPeqIgM9owaERF";
        String SECRET_KEY = "AEHms0DpeC6Wpe2N_RhEtydC2NuyXdK_J4uBKBB3";
        //要上传的空间
        String bucketname = "cuschool";
        //密钥配置
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        videoToken = auth.uploadToken(bucketname);
        return "findOneVideo";
    }

    public String deleteSchool() throws Exception {
        videoService.deleteVideoById(vid);
        return SUCCESS;
    }

    public String addSchool() throws Exception {
        if (link == null || "".equals(link)) {
            System.out.print("执行了判断");
            message = "未输入任何链接";
            return "qiniuToken";
        }
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
        Video video = videoService.findVideoById(vid);
        video.setVLink(link);
        video.setVDes(desc);
        videoService.updateVideo(video);
        return null;
    }

    //获取token
    public String getToken() throws Exception {
        String ACCESS_KEY = "lJUnoZL99-hVC8NIONJP1cm0zWyPeqIgM9owaERF";
        String SECRET_KEY = "AEHms0DpeC6Wpe2N_RhEtydC2NuyXdK_J4uBKBB3";
        //要上传的空间
        String bucketname = "cuschool";
        //密钥配置
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        videoToken = auth.uploadToken(bucketname);
        return "qiniuToken";
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

    public String getVideoToken() {
        return videoToken;
    }

    public void setVideoToken(String videoToken) {
        this.videoToken = videoToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
