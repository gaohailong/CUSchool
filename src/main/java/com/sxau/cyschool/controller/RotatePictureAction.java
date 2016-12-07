package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Category;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.CategoryService;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;

import java.util.Date;
import java.util.List;

/**
 * Created by gaohailong on 2016/11/22.
 */
public class RotatePictureAction extends ActionSupport {
    //注入元素
    private TitleService titleService;
    private CategoryService categoryService;
    //传输部分
    private String notificationHead;
    private String notificationContent;
    private List<Title> titleList;
    private Title title;
    private Integer nowPage;
    private int totalPage;
    private Integer tid;
    private Category t_category;
    private String picUrl;
    //变量
    private Page<Title> page;

    //查找所有轮播图文章
    public String findRotate() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        page = titleService.queryTitleByCondition(title, nowPage, 10);
        titleList = page.getRows();
        totalPage = page.getTotalPage();
        return "findRotate";
    }

    //查找一个轮播图文章
    public String findOneSchoolRotate() throws Exception {
        if (tid == null||tid == 0 ) {
            return ERROR;
        }
        title = titleService.findTitleById(tid);
        return "findOneSchoolRotate";
    }

    //添加轮播图文章
    public String addRotate() throws Exception {
        Title title = new Title();
        //将其他数据保存
        title.setTContent(notificationContent);
        title.setTName(notificationHead);
        title.setTDate(new Date());
        title.setTRead(0);
        title.setTImage(picUrl);
        Category category = categoryService.getCategoryByName("首页轮播图");
        title.setCategory(category);
        titleService.saveTitle(title);
        return null;
    }

    //删除轮播图文章
    public String deleteSchoolRotate() throws Exception {
//       titleService.deleteTitle(tid);
        //TODO 和修改一样，只是将文章的category改为学校要闻
        if (tid == null||tid == 0 ) {
            return ERROR;
        }
        title = titleService.findTitleById(tid);
        Category category = categoryService.getCategoryByName("学校要闻");
        title.setCategory(category);
        titleService.updateTitle(title);
        return SUCCESS;
    }

    //修改轮播图文章
    public String updateSchoolRotate() throws Exception {
        if (tid == null||tid == 0) {
            return ERROR;
        }
        title = titleService.findTitleById(tid);
        //TODO 设置图片的链接
        title.setTName(notificationHead);
        title.setTContent(notificationContent);
        titleService.updateTitle(title);
        return null;
    }

    public TitleService getTitleService() {
        return titleService;
    }

    public void setTitleService(TitleService titleService) {
        this.titleService = titleService;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public String getNotificationHead() {
        return notificationHead;
    }

    public void setNotificationHead(String notificationHead) {
        this.notificationHead = notificationHead;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public List<Title> getTitleList() {
        return titleList;
    }

    public void setTitleList(List<Title> titleList) {
        this.titleList = titleList;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Category getT_category() {
        return t_category;
    }

    public void setT_category(Category t_category) {
        this.t_category = t_category;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
