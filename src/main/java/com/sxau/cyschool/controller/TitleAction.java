package com.sxau.cyschool.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.sxau.cyschool.pojo.Category;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.CategoryService;
import com.sxau.cyschool.service.TitleService;

import java.util.Date;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class TitleAction extends ActionSupport {
    private TitleService titleService;
    private CategoryService categoryService;

    private Title title;
    //    private Page<Title> page;
    private Integer nowPage;
    private String notificationHead;
    private String notificationContent;

//    public String addTitle() {
//        HttpServletRequest request = this.getRequest();
//        Title titleEntity = new Title();
//        return null;
//    }

    //查找通知
    public String findNotification() throws Exception {
        if (nowPage == null || nowPage == 0) {
            nowPage = 1;
        }
//        page = titleService.queryTitleByCondition(title, page.getPageNum(), 10);
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

//    public Page<Title> getPage() {
//        return page;
//    }

//    public void setPage(Page<Title> page) {
//        this.page = page;
//    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public TitleService getTitleService() {
        return titleService;
    }

    public void setTitleService(TitleService titleService) {
        this.titleService = titleService;
    }

    public Integer getNowPage() {
        return nowPage;
    }

    public void setNowPage(Integer nowPage) {
        this.nowPage = nowPage;
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

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
