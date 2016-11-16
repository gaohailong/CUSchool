package com.sxau.cyschool.controller;

import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class TitleAction extends BaseAction {
    private TitleService titleService;
    private Title title;
    private Page<Title> page;

    public String addTitle() {
        HttpServletRequest request = this.getRequest();
        Title titleEntity = new Title();
        return null;
    }

    public String findNotification() throws Exception {
        System.out.print("test");
//        page = titleService.queryTitleByCondition(title, page.getPageNum(), 10);
        return "queryByPage";
    }

    public Page<Title> getPage() {
        return page;
    }

    public void setPage(Page<Title> page) {
        this.page = page;
    }

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
}
