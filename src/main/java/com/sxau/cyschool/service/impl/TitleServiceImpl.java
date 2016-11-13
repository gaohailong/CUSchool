package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.pojo.TitleEntity;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class TitleServiceImpl implements TitleService {

    private TitleDao titleDao;

    public void deleteTitle(int id) throws Exception {
        this.titleDao.deleteTitleById(id);
    }

    public TitleEntity findTitleById(int id) throws Exception {
        return this.titleDao.findTitleById(id);
    }

    public void updateTitle(TitleEntity titleEntity) throws Exception {
        this.titleDao.updateTitle(titleEntity);
    }

    public void saveTitle(TitleEntity titleEntity) throws Exception {
        this.titleDao.saveObject(titleEntity);
    }

    public Page<TitleEntity> queryBook(int offset, int limit, Map<String, Object> pararmMap) throws Exception {
        Page<TitleEntity> titleEntityPage = new Page<TitleEntity>();
        titleEntityPage.setRows(titleDao.queryTitle(offset, limit, pararmMap));
        int total = titleDao.queryTitleCount(pararmMap);
        titleEntityPage.setTotal(total);
        int totalPage = total / limit == 0 ? total / limit : total / limit + 1;
        titleEntityPage.setTotalPage(totalPage);
        int pageNum = (offset / limit) + 1;
        if (pageNum < 1)
            pageNum = 1;
        if (pageNum > totalPage)
            pageNum = totalPage;
        titleEntityPage.setPageNum(pageNum);
        return titleEntityPage;
    }

    public int queryBookCount(Map<String, Object> paramMap) throws Exception {
        return titleDao.queryTitleCount(paramMap);
    }

    public TitleDao getTitleDao() {
        return titleDao;
    }

    public void setTitleDao(TitleDao titleDao) {
        this.titleDao = titleDao;
    }
}
