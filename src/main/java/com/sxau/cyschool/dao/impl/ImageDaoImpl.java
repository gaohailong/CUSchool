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
        String hql = "update Image i set i.IClic=i.IClic+1 where i.IId=" + id;
        int count = this.executeUpdate(hql);
    }

    public List<Image> queryAllImageByKey(Image image, int page, int rows) throws Exception {
        StringBuffer hql = new StringBuffer("from Image i where 1 = 1");
        if (image != null) {
            if (image.getIDes() != null) {
                hql.append("and i.IDes like '%" + image.getIDes() + "%'");
            }
        }
        hql.append(" order by i.IId desc ");
        List<Image> images = this.findDataByCondition(hql.toString(), page, rows);
        return images;
    }

    public Integer queryCountByKey(Image image) throws Exception {
        StringBuffer hql = new StringBuffer("select count(*) from Image i where 1 = 1 ");
        if (image != null) {
            if (image.getIDes() != null) {
                hql.append("and i.IDes like '%" + image.getIDes() + "%'");
            }
        }
        hql.append("order by i.IId desc");
        return this.getInt(hql.toString());
    }
}
