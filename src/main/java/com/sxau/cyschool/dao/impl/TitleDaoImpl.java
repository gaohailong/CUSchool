package com.sxau.cyschool.dao.impl;

import com.sxau.cyschool.dao.TitleDao;
import com.sxau.cyschool.pojo.TitleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class TitleDaoImpl extends BaseHibernateDaoImpl<TitleEntity> implements TitleDao {
    public void saveTitle(TitleEntity titleEntity) throws Exception {
        this.saveObject(titleEntity);
    }

    public void deleteTitleById(int id) throws Exception {
        String sql = "delete from TitleEntity where id=" + id;
        this.deleteObjectsByIds(TitleEntity.class, new String[]{String.valueOf(id)});
    }

    public void updateTitle(TitleEntity titleEntity) throws Exception {
        this.saveOrUpdateObject(titleEntity);
    }

    public TitleEntity findTitleById(int id) throws Exception {
        TitleEntity titleEntity = this.loadObject(TitleEntity.class, id);
        return titleEntity;
    }

    public List<TitleEntity> queryTitle(int offset, int limit, Map<String, Object> paramMap) throws Exception {
        StringBuffer hql = new StringBuffer("from TitleEntity t where 1= 1");
        if (paramMap.size() != 0) {
            hql.append("and (t.tName like :key or t.tRead like :key)");
        }
        List<TitleEntity> titleEntities = this.findPageByQuery(hql.toString(), paramMap, offset, limit);
        return titleEntities;
    }

    public int queryTitleCount(Map<String, Object> paramMap) throws Exception {
        StringBuffer hql = new StringBuffer("select count(*) from TitleEntity t where 1=1");
        if (paramMap.size() != 0) {
            hql.append("and (t.tName like :key or t.tRead like :key)");
        }
        int count = this.getInt(hql.toString(), paramMap);
        return count;
    }
}
