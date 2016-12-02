package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.HomeService;
import com.sxau.cyschool.service.ImageService;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;

import java.util.List;

/**
 * Created by gaohailong on 2016/12/2.
 */
public class ImageAction extends ActionSupport {
    private ImageService imageService;
    private HomeService homeService;

    private Image image;
    private Integer nowPage;
    private List<Image> images;
    private List<Title> notifications;
    private Integer totalPage;

    private Page<Image> page;

    public String findPrePic() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        page = imageService.queryAllImageByKey(image, nowPage, 10);
        images = page.getRows();
        totalPage = page.getTotalPage();
        notifications = homeService.queryNotification();
        return "findPrePic";
    }

    public ImageService getImageService() {
        return imageService;
    }

    public void setImageService(ImageService imageService) {
        this.imageService = imageService;
    }

    public HomeService getHomeService() {
        return homeService;
    }

    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }

    public List<Title> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Title> notifications) {
        this.notifications = notifications;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
