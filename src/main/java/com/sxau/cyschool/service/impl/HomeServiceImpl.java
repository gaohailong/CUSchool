package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.HomeDao;
import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.HomeService;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class HomeServiceImpl implements HomeService {

    private HomeDao homeDao;

    public List<Title> queryNews() throws Exception {
        return homeDao.queryNews();
    }

    public List<Title> queryRotate() throws Exception {
        return homeDao.queryRotate();
    }

    public List<Title> queryNotification() throws Exception {
        return homeDao.queryNotification();
    }

    public List<Title> queryGraduation() throws Exception {
        return homeDao.queryGraduation();
    }

    public void clickReading(Integer id) throws Exception {
        homeDao.clickReading(id);
    }

    public Page<Title> queryAllTitleByKey(Title title, int page, int rows) throws Exception {
        Page<Title> pagee = new Page<Title>();
        pagee.setRows(homeDao.queryAllTitleByKey(title, page, rows));
        int totals = homeDao.queryCountTitleByKey(title);
        pagee.setTotal(totals);
        int totalPage = totals / rows == 0 ? totals / rows + 1 : totals / rows;
        pagee.setTotalPage(totalPage);
        return pagee;
    }

    public HomeDao getHomeDao() {
        return homeDao;
    }

    public void setHomeDao(HomeDao homeDao) {
        this.homeDao = homeDao;
    }

}
