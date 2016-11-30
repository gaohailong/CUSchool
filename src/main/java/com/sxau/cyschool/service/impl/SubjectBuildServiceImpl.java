package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;

import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class SubjectBuildServiceImpl implements TitleService {

    private TitleDao titleDao;

    public void deleteTitle(int id) throws Exception {
        this.titleDao.deleteTitleById(id);
    }

    public Title findTitleById(int id) throws Exception {
        return this.titleDao.findTitleById(id);
    }

    public void updateTitle(Title title) throws Exception {
        this.titleDao.updateObjectOfUpdate(title);
    }

    public void saveTitle(Title title) throws Exception {
        this.titleDao.saveTitle(title);
    }

    public Page<Title> queryTitle(int offset, int limit, Map<String, Object> pararmMap) throws Exception {
        Page<Title> titlePage = new Page<Title>();
        titlePage.setRows(titleDao.queryTitle(offset, limit, pararmMap));
        int total = titleDao.queryTitleCount(pararmMap);
        titlePage.setTotal(total);
        int totalPage = total / limit == 0 ? total / limit : total / limit + 1;
        titlePage.setTotalPage(totalPage);
        int pageNum = (offset / limit) + 1;
        if (pageNum < 1)
            pageNum = 1;
        if (pageNum > totalPage)
            pageNum = totalPage;
        titlePage.setPageNum(pageNum);
        return titlePage;
    }

    public int queryTitleCount(Map<String, Object> paramMap) throws Exception {
        return titleDao.queryTitleCount(paramMap);
    }

    public Page<Title> queryTitleByCondition(Title title, int page, int rows) throws Exception {
        Page<Title> pagee = new Page<Title>();
        pagee.setRows(titleDao.queryTitleByPageAndCondition(title, page, rows));
        int totals = titleDao.queryTitleCondition(title);
        pagee.setTotal(totals);
        int totalPage = totals % rows == 0 ? totals / rows : totals / rows + 1;
        pagee.setTotalPage(totalPage);
        return pagee;
    }


    public TitleDao getTitleDao() {
        return titleDao;
    }

    public void setTitleDao(TitleDao titleDao) {
        this.titleDao = titleDao;
    }
}
