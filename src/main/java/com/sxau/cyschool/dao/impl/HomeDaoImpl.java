package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.HomeDao;
import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.pojo.Image;
import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.pojo.Video;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class HomeDaoImpl extends BaseHibernateDaoImpl<Title> implements HomeDao {
    public List<Title> queryNews() throws Exception {
        String hql = "from Title t where t.category.CContent='学校要闻' order by t.TId desc";
        List<Title> titles = this.findData(hql, 0, 5);
        return titles;
    }

    public List<Title> queryRotate() throws Exception {
        String hql = "from Title t where t.category.CContent='首页轮播图' order by t.TId desc";
        List<Title> titles = this.findData(hql);
        return titles;
    }

    public List<Title> queryNotification() throws Exception {
        String hql = "from Title t where t.category.CContent='通知公告' order by t.TId desc";
        List<Title> titles = this.findData(hql, 0, 5);
        return titles;
    }

    public List<Title> queryGraduation() throws Exception {
        String hql = "from Title t where t.category.CContent='毕业风采' order by t.TId desc";
        List<Title> titles = this.findData(hql, 0, 4);
        return titles;
    }

    public void clickReading(Integer id) throws Exception {
        String hql = "update title t set t.t_read=t_read+1 where t.id=" + id;
        int count = this.executeUpdate(hql);
    }

    public List<Title> queryAllTitleByKey(Title title, int page, int rows) throws Exception {
        StringBuffer string = new StringBuffer("from Title t where 1 = 1 ");
        if (title != null) {
            if (title.getTName() != null) {
                string.append("and t.TName like '%" + title.getTName() + "%'");
            }
        }
        string.append(" order by t.TId desc ");
        List<Title> titles = findDataByCondition(string.toString(), page, rows);
        return titles;
    }

    public Integer queryCountTitleByKey(Title title) throws Exception {
        StringBuffer string = new StringBuffer("select count(*) from Title t where 1 = 1 ");
        if (title != null) {
            if (title.getTName() != null) {
                string.append("and t.TName like '%" + title.getTName() + "%'");
            }
        }
        string.append(" order by t.TId desc ");
        return this.getInt(string.toString());
    }

}
