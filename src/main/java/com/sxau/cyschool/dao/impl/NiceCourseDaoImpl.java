package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.pojo.Title;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/22.
 * 特色专业
 */
public class NiceCourseDaoImpl extends BaseHibernateDaoImpl<Title> implements TitleDao {
    public void saveTitle(Title title) throws Exception {
        this.saveObject(title);
    }

    public void deleteTitleById(int id) throws Exception {
        String sql = "delete from Title where id=" + id;
        this.deleteObjectsByIds(Title.class, new String[]{String.valueOf(id)});
    }

    public void updateTitle(Title Title) throws Exception {
        this.saveOrUpdateObject(Title);
    }

    public Title findTitleById(int id) throws Exception {
        Title Title = this.getObject(Title.class, id);
        return Title;
    }

    public List<Title> queryTitle(int offset, int limit, Map<String, Object> paramMap) throws Exception {
        StringBuffer hql = new StringBuffer("from Title t where 1 = 1");
        if (paramMap.size() != 0) {
            hql.append("and (t.tName like :key or t.tRead like :key)");
        }
        List<Title> titleEntities = this.findPageByQuery(hql.toString(), paramMap, offset, limit);
        return titleEntities;
    }

    public int queryTitleCount(Map<String, Object> paramMap) throws Exception {
        StringBuffer hql = new StringBuffer("select count(*) from Title t where 1=1");
        if (paramMap.size() != 0) {
            hql.append("and (t.tName like :key)");
        }
        int count = this.getInt(hql.toString(), paramMap);
        return count;
    }

    public List<Title> queryTitleByPageAndCondition(Title title, int page, int rows) throws Exception {
        StringBuffer string = new StringBuffer("from Title t where 1 = 1 ");
        if (title != null) {
            if (title.getTName() != null) {
                string.append("and t.TName like '%" + title.getTName() + "%'");
            }
        }
        string.append("and t.category.CContent='精品课程'");
        List<Title> titles = findDataByCondition(string.toString(), page, rows);
        return titles;
    }

    public int queryTitleCondition(Title title) throws Exception {
        StringBuffer stringBuffer = new StringBuffer("select count(*) from Title t where 1 = 1 ");
        if (title != null) {
            if (title.getTName() != null) {
                stringBuffer.append("and t.TName like '%" + title.getTName() + "%'");
            }
        }
        stringBuffer.append("and t.category.CContent='精品课程'");
        return this.getInt(stringBuffer.toString());
    }
}
