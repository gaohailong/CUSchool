package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.ImageDao;
import com.sxau.cyschool.pojo.Image;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/29.
 */
public class ImageDaoImpl extends BaseHibernateDaoImpl<Image> implements ImageDao {
    private ImageDao imageDao;

    public Image queryImage() throws Exception {
        String hql = "from Image i order by i.IId desc limit 0,1";
        List<Image> images = this.findData(hql);
        if (images != null) {
            Image image = images.get(0);
            return image;
        } else {
            return null;
        }
    }

    public void imageClickRead(Integer id) throws Exception {
        String hql="update Image i set i.IClic=i.IClic+1 where i.IId="+id;
        int count = this.executeUpdate(hql);
    }
}
