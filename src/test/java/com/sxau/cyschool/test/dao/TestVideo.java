package com.sxau.cyschool.test.dao;

import com.sxau.cyschool.dao.VideoDao;
import com.sxau.cyschool.dao.impl.VideoDaoImpl;
import com.sxau.cyschool.test.base.TSpringHibernate;
import org.junit.Test;

/**
 * Created by gaohailong on 2016/11/22.
 */
public class TestVideo extends TSpringHibernate {
    private VideoDao videoDao=new VideoDaoImpl();
    @Test
    public void testGetObject(){
        try {
           System.out.print(videoDao.findVideoById(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
