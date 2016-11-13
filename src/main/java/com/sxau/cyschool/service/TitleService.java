package com.sxau.cyschool.service;

import com.sxau.cyschool.pojo.TitleEntity;
import com.sxau.cyschool.utils.Page;

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
    TitleEntity findTitleById(int id) throws Exception;

    /**
     * 更新一篇文章
     *
     * @param titleEntity
     * @throws Exception
     */
    void updateTitle(TitleEntity titleEntity) throws Exception;

    /**
     * 保存书籍
     *
     * @param titleEntity
     * @throws Exception
     */
    void saveTitle(TitleEntity titleEntity) throws Exception;

    /**
     * 分页查询
     *
     * @param offset
     * @param limit
     * @param pararmMap
     * @return
     * @throws Exception
     */
    Page<TitleEntity> queryBook(int offset, int limit, Map<String, Object> pararmMap) throws Exception;

    /**
     * 查询文章总数
     *
     * @param paramMap
     * @return
     * @throws Exception
     */
    int queryBookCount(Map<String, Object> paramMap) throws Exception;
}
