package com.sxau.cyschool.controller;

import com.sxau.cyschool.service.TitleService;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class TitleAction extends BaseAction {
    private TitleService titleService;

    public TitleService getTitleService() {
        return titleService;
    }

    public void setTitleService(TitleService titleService) {
        this.titleService = titleService;
    }
}
