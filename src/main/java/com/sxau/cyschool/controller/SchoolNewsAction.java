package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Category;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.CategoryService;
import com.sxau.cyschool.service.HomeService;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;

import java.util.Date;
import java.util.List;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class SchoolNewsAction extends ActionSupport {
    //注入元素
    private TitleService titleService;
    private CategoryService categoryService;
    private HomeService homeService;
    //传输部分
    private String notificationHead;
    private String notificationContent;
    private List<Title> titleList;
    private List<Title> notifications;
    private Title title;
    private Integer nowPage;
    private int totalPage;
    private Integer tid;
    private Category t_category;
    //变量
    private Page<Title> page;

    //=====================后台===========================

    public String tour() throws Exception {

        return "tourNews";
    }

    //查找通知
    public String findSchool() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        page = titleService.queryTitleByCondition(title, nowPage, 10);
        titleList = page.getRows();
        totalPage = page.getTotalPage();
        return "findSchoolNews";
    }

    //查找一个通知
    public String findOneSchool() throws Exception {
        if (tid == null || tid == 0) {
            return ERROR;
        }
        title = titleService.findTitleById(tid);
        return "updateSchoolNews";
    }

    //添加通知
    public String addSchool() throws Exception {
        Title title = new Title();
        //将其他数据保存
        title.setTContent(notificationContent);
        title.setTName(notificationHead);
        title.setTDate(new Date());
        title.setTRead(0);
        Category category = categoryService.getCategoryByName("学校要闻");
        title.setCategory(category);
        titleService.saveTitle(title);
        return null;
    }

    //删除通知
    public String deleteSchool() throws Exception {
        titleService.deleteTitle(tid);
        return SUCCESS;
    }

    //修改通知
    public String updateSchool() throws Exception {
        if (tid == null || tid == 0) {
            return ERROR;
        }
        title = titleService.findTitleById(tid);
        title.setTName(notificationHead);
        title.setTContent(notificationContent);
        titleService.updateTitle(title);
        return null;
    }

    //===============================前台====================================
    //查找通知
    public String findPreSchool() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        page = titleService.queryTitleByCondition(title, nowPage, 10);
        titleList = page.getRows();
        totalPage = page.getTotalPage();
        notifications = homeService.queryNotification();
        return "findPreSchool";
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

    public void setTid(Integer tid) {
        this.tid = tid;
    }

}
