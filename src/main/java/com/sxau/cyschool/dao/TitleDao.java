package com.sxau.cyschool.dao;

import com.sxau.cyschool.pojo.Title;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public interface TitleDao extends BaseHibernateDao<Title> {
    /**
     * 保存一个实体
     *
     * @param title
     * @throws Exception
     */
    void saveTitle(Title title) throws Exception;

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
     * @param Title
     * @throws Exception
     */
    void updateTitle(Title Title) throws Exception;

    /**
     * 通过id查找title
     *
     * @param id
     * @return
     * @throws Exception
     */
    Title findTitleById(int id) throws Exception;

    /**
     * 分页查询文章
     *
     * @param offset
     * @param limit
     * @param paramMap
     * @return
     * @throws Exception
     */
    List<Title> queryTitle(int offset, int limit, Map<String, Object> paramMap) throws Exception;

    /**
     * 查询文章总数
     *
     * @param paramMap
     * @return
     * @throws Exception
     */
    int queryTitleCount(Map<String, Object> paramMap) throws Exception;

    /**
     * 分页条件查询
     */
    List<Title> queryTitleByPageAndCondition(Title title, int page, int rows) throws Exception;

    /**
     * 查询文章总数
     *
     * @return
     */
    int queryTitleCondition(Title title) throws Exception;

    /**
     * 点击加一
     * @throws Exception
     */
    void clickReading() throws Exception;
}
