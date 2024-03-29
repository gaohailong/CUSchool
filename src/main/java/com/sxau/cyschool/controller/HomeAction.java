package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.pojo.Video;
import com.sxau.cyschool.service.HomeService;
import com.sxau.cyschool.service.ImageService;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.service.VideoService;
import com.sxau.cyschool.utils.Page;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/29.
 * 首页的所有数据
 */
public class HomeAction extends ActionSupport {
    private HomeService homeService;
    private ImageService imageService;
    private VideoService videoService;
    private TitleService titleService;

    private List<Title> newss;
    private List<Title> graduations;
    private List<Title> rotates;
    private List<Title> notifications;
    private List<Title> titles;
    private Image image;
    private Video video;
    private Integer tid;
    private Title title;
    private String keyword;
    private Integer nowPage;
    private Integer totalPage;

    private Page<Title> page;

    //查找首页所有的数据
    public String findAll() throws Exception {
        newss = homeService.queryNews();
        graduations = homeService.queryGraduation();
        rotates = homeService.queryRotate();
        notifications = homeService.queryNotification();
        image = imageService.queryImage();
        video = videoService.queryVideoService();
        return "findAllHome";
    }

    //查找一个通知
    public String findOneSchoolPre() throws Exception {
        if (tid == null || tid == 0) {
            return ERROR;
        }
        homeService.updateClickReading(tid);
        title = titleService.findTitleById(tid);
        notifications = homeService.queryNotification();
        return "findOneTitle";
    }

    public String findSearch() throws Exception {
        Title title = new Title();
        if (keyword != null) {
            keyword = keyword.trim();
            title.setTName(keyword);
        }
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        page = homeService.queryAllTitleByKey(title, nowPage, 10);
        titles = page.getRows();
        totalPage = page.getTotalPage();
        notifications = homeService.queryNotification();
        return "findSearch";
    }

    public HomeService getHomeService() {
        return homeService;
    }

    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }

    public ImageService getImageService() {
        return imageService;
    }

    public void setImageService(ImageService imageService) {
        this.imageService = imageService;
    }

    public VideoService getVideoService() {
        return videoService;
    }

    public void setVideoService(VideoService videoService) {
        this.videoService = videoService;
    }

    public List<Title> getGraduations() {
        return graduations;
    }

    public void setGraduations(List<Title> graduations) {
        this.graduations = graduations;
    }

    public List<Title> getRotates() {
        return rotates;
    }

    public void setRotates(List<Title> rotates) {
        this.rotates = rotates;
    }

    public List<Title> getNotification() {
        return notifications;
    }

    public void setNotification(List<Title> notifications) {
        this.notifications = notifications;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public List<Title> getNewss() {
        return newss;
    }

    public void setNewss(List<Title> newss) {
        this.newss = newss;
    }

    public List<Title> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Title> notifications) {
        this.notifications = notifications;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public TitleService getTitleService() {
        return titleService;
    }

    public void setTitleService(TitleService titleService) {
        this.titleService = titleService;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
