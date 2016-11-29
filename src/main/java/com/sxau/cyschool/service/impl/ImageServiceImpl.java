package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.ImageDao;
import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.service.ImageService;

/**
 * Created by gaohailong on 2016/11/29.
 */
public class ImageServiceImpl implements ImageService {
    private ImageDao imageDao;

    public Image queryImage() throws Exception {
        return imageDao.queryImage();
    }

    public ImageDao getImageDao() {
        return imageDao;
    }

    public void setImageDao(ImageDao imageDao) {
        this.imageDao = imageDao;
    }
}
