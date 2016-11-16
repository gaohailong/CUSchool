package com.sxau.cyschool.service;

import com.sxau.cyschool.pojo.Title;
import com.sxau.cyschool.utils.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/13.
 */
public interface TitleService {
    /**
     * 删除一篇文章
     *
     * @param id
     * @throws Exception
     */
    void deleteTitle(int id) throws Exception;

    /**
     * 查询一篇文章
     *
     * @param id
     * @return
     * @throws Exception
     */
    Title findTitleById(int id) throws Exception;

    /**
     * 更新一篇文章
     *
     * @param Title
     * @throws Exception
     */
    void updateTitle(Title Title) throws Exception;

    /**
     * 保存书籍
     *
     * @param Title
     * @throws Exception
     */
    void saveTitle(Title Title) throws Exception;

    /**
     * 分页查询
     *
     * @param offset
     * @param limit
     * @param pararmMap
     * @return
     * @throws Exception
     */
    Page<Title> queryTitle(int offset, int limit, Map<String, Object> pararmMap) throws Exception;

    /**
     * 查询文章总数
     *
     * @param paramMap
     * @return
     * @throws Exception
     */
    int queryTitleCount(Map<String, Object> paramMap) throws Exception;

    /**
     * 条件分页查询
     */
    Page<Title> queryTitleByCondition(Title title, int page, int rows) throws Exception;
}
