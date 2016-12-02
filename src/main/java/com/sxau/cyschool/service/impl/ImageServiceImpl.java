package com.sxau.cyschool.service.impl;

import com.sxau.cyschool.dao.ImageDao;
import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.service.ImageService;
import com.sxau.cyschool.utils.Page;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/29.
 */
public class ImageServiceImpl implements ImageService {
    private ImageDao imageDao;

    public Image queryImage() throws Exception {
        return imageDao.queryImage();
    }

    public void updateImgClickReading(Integer id) throws Exception {
        imageDao.imageClickRead(id);
    }

    public Page<Image> queryAllImageByKey(Image image, int page, int rows) throws Exception {
        Page<Image> pagee = new Page<Image>();
        List<Image> images = imageDao.queryAllImageByKey(image, page, rows);
        pagee.setRows(images);
        int total = imageDao.queryCountByKey(image);
        pagee.setTotal(total);
        int totalPage = total % rows == 0 ? total / rows : total / rows + 1;
        pagee.setTotalPage(totalPage);
        return pagee;
    }

    public ImageDao getImageDao() {
        return imageDao;
    }

    public void setImageDao(ImageDao imageDao) {
        this.imageDao = imageDao;
    }
}
