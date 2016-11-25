package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.controller.SchoolGallery;
import com.sxau.cyschool.dao.SchoolGalleryDao;
import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.service.SchoolGalleryService;
import com.sxau.cyschool.service.TitleService;
import com.sxau.cyschool.utils.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/24.
 */
public class SchoolGalleryServiceImpl implements SchoolGalleryService {
    private SchoolGalleryDao schoolGalleryDao;

//    private TitleDao titleDao;
//
//    public void deleteTitle(int id) throws Exception {
//        this.titleDao.deleteTitleById(id);
//    }
//
//    public Title findTitleById(int id) throws Exception {
//        return this.titleDao.findTitleById(id);
//    }
//
//    public void updateTitle(Title title) throws Exception {
//        this.titleDao.updateObjectOfUpdate(title);
//    }
//
//    public void saveTitle(Title title) throws Exception {
//        this.titleDao.saveTitle(title);
//    }
//
//    public Page<Title> queryTitle(int offset, int limit, Map<String, Object> pararmMap) throws Exception {
//        Page<Title> titlePage = new Page<Title>();
//        titlePage.setRows(titleDao.queryTitle(offset, limit, pararmMap));
//        int total = titleDao.queryTitleCount(pararmMap);
//        titlePage.setTotal(total);
//        int totalPage = total / limit == 0 ? total / limit : total / limit + 1;
//        titlePage.setTotalPage(totalPage);
//        int pageNum = (offset / limit) + 1;
//        if (pageNum < 1)
//            pageNum = 1;
//        if (pageNum > totalPage)
//            pageNum = totalPage;
//        titlePage.setPageNum(pageNum);
//        return titlePage;
//    }
//
//    public int queryTitleCount(Map<String, Object> paramMap) throws Exception {
//        return titleDao.queryTitleCount(paramMap);
//    }
//
//    public Page<Title> queryTitleByCondition(Title title, int page, int rows) throws Exception {
//        Page<Title> pagee = new Page<Title>();
//        pagee.setRows(titleDao.queryTitleByPageAndCondition(title, page, rows));
//        int totals = titleDao.queryTitleCondition(title);
//        pagee.setTotal(totals);
//        int totalPage = totals / rows == 0 ? totals / rows + 1 : totals / rows;
//        pagee.setTotalPage(totalPage);
//        return pagee;
//    }
//
//    public TitleDao getTitleDao() {
//        return titleDao;
//    }
//
//    public void setTitleDao(TitleDao titleDao) {
//        this.titleDao = titleDao;
//    }

    public void deletePhotoById(Integer id) throws Exception {
        this.schoolGalleryDao.deletePhotoById(id);
    }

    public void updatePhotoByPhoto(Image image) throws Exception {
        this.schoolGalleryDao.updatePhotoByPhoto(image);
    }

    public void savePhoto(Image image) throws Exception {
        this.schoolGalleryDao.savePhoto(image);
    }

    public Page<Image> queryImageByCondition(Image image, int page, int rows) throws Exception {
        Page<Image> pagee = new Page<Image>();
        List<Image> images = this.schoolGalleryDao.queryImageByCondition(image, page, rows);
        int totals = this.schoolGalleryDao.queryImageCount(image);
        int totalPage = totals % rows == 0 ? totals / rows : totals / rows + 1;
        pagee.setRows(images);
        pagee.setTotal(totals);
        pagee.setTotalPage(totalPage);
        return pagee;
    }

    public int queryImageCount(Image image) throws Exception {
        return this.schoolGalleryDao.queryImageCount(image);
    }

    public SchoolGalleryDao getSchoolGalleryDao() {
        return schoolGalleryDao;
    }

    public void setSchoolGalleryDao(SchoolGalleryDao schoolGalleryDao) {
        this.schoolGalleryDao = schoolGalleryDao;
    }
}
