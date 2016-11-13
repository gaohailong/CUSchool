package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.TitleEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public interface TitleDao extends BaseHibernateDao<TitleEntity> {
    /**
     * 保存一个实体
     *
     * @param titleEntity
     * @throws Exception
     */
    void saveTitle(TitleEntity titleEntity) throws Exception;

    /**
     * 删除一个实体
     *
     * @param id
     * @throws Exception
     */
    void deleteTitleById(int id) throws Exception;

    /**
     * 更新一个实体
     *
     * @param titleEntity
     * @throws Exception
     */
    void updateTitle(TitleEntity titleEntity) throws Exception;

    /**
     * 通过id查找title
     *
     * @param id
     * @return
     * @throws Exception
     */
    TitleEntity findTitleById(int id) throws Exception;

    /**
     * 分页查询文章
     *
     * @param offset
     * @param limit
     * @param paramMap
     * @return
     * @throws Exception
     */
    List<TitleEntity> queryTitle(int offset, int limit, Map<String, Object> paramMap) throws Exception;

    /**
     * 查询文章总数
     *
     * @param paramMap
     * @return
     * @throws Exception
     */
    int queryTitleCount(Map<String, Object> paramMap) throws Exception;
}
