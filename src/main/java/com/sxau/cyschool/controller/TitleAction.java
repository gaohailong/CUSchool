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
 * Created by gaohailong on 2016/11/13.
 */
public class TitleAction extends ActionSupport {
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
    //变量
    private Page<Title> page;

    //查找通知
    public String findNotification() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
        page = titleService.queryTitleByCondition(title, nowPage, 10);
        titleList = page.getRows();
//        nowPage = page.getPageNum();
        totalPage = page.getTotalPage();
        return "findNotification";
    }

    //添加通知
    public String addNotification() throws Exception {
        Title title = new Title();
        //将其他数据保存
        title.setTContent(notificationContent);
        title.setTName(notificationHead);
        title.setTDate(new Date());
        Category category = categoryService.getCategoryByName("通知公告");
        title.setCategory(category);
        titleService.saveTitle(title);
        return null;
    }

    public String deleteNotification() throws Exception {
        System.out.print("=====");
        return SUCCESS;
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
}
