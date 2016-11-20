package com.sxau.cyschool.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/11.
 */
public interface BaseHibernateDao<T> {
    /**
     * 保存对象
     *
     * @param t
     * @return
     * @throws Exception
     */
    Serializable saveObject(T t) throws Exception;

    /**
     * 保存或更改对象
     *
     * @param t
     * @throws Exception
     */
    void saveOrUpdateObject(T t) throws Exception;

    /**
     * 删除对象,需要慎重，其将删除所有的关联对象
     *
     * @param t
     * @throws Exception
     */
    void deleteObject(T t) throws Exception;

    /**
     * 根据类型删除指定对象
     *
     * @param clazz 类型
     * @param ids   要删除类型的主键
     * @return
     * @throws Exception
     */
    int deleteObjectsByIds(Class<T> clazz, String[] ids) throws Exception;

    /**
     * 删除所有的对象
     *
     * @return
     */
    int deleteAll(Class<T> clazz) throws Exception;

    /**
     * 更新对象
     *
     * @param t
     * @throws Exception
     */
    void updateObject(T t) throws Exception;

    /**
     * 根据sql语句进行增删改操作，只支持原生sql
     *
     * @param string
     * @return
     * @throws Exception
     */
    int executeUpdate(String string) throws Exception;

    /**
     * Load出对象 根据主键，获得数据库一条对应的记录,如果没有相应的实体，抛出异常
     *
     * @param clazz
     * @param id
     * @return
     * @throws Exception
     */
    T loadObject(Class<T> clazz, Serializable id) throws Exception;

    /**
     * get出对象 根据主键，获得数据库一条对应的记录,如果没有相应的实体，返回 null
     *
     * @param clazz
     * @param id
     * @return
     * @throws Exception
     */
    T getObject(Class<T> clazz, Serializable id) throws Exception;

    /**
     * 查找对象
     *
     * @param queryString 要执行的sql语句
     * @return
     * @throws Exception
     */
    List<T> queryObject(String queryString) throws Exception;

    /**
     * 查找对象
     *
     * @param queryString
     * @param conditionMap 存放queryString语句中的 标识符和实际值 对
     * @return
     * @throws Exception
     */
    List<T> queryObject(String queryString, Map<String, Object> conditionMap) throws Exception;

    /**
     * 查找对象
     *
     * @param queryString 存放queryString语句中参数值
     * @param parameters
     * @return
     * @throws Exception
     */
    List<T> queryObject(String queryString, Object[] parameters) throws Exception;

    /**
     * 获取所有对象
     *
     * @param clazz
     * @return
     * @throws Exception
     */
    List<T> queryAll(Class<T> clazz) throws Exception;

    /**
     * 读出所有的对象
     *
     * @param clazz 对象类型
     * @param ids   要读出对象的主键集合
     * @return
     * @throws Exception
     */
    List<T> queryObjectByIds(Class<T> clazz, String[] ids) throws Exception;


    /**
     * 自己写的分页查询
     */
    List<T> findDataByCondition(String queryString, int page, int rows) throws Exception;

    /**
     * 分页查询
     *
     * @param queryString 查询语句
     * @param startIndex  记录起始行
     * @param endIndex    记录结束行
     * @return List 分页结果
     * @throws Exception
     */
    List<T> findPageByQuery(String queryString, int startIndex, int endIndex) throws Exception;

    /**
     * 条件分页查询
     *
     * @param queryString
     * @param conditionMap
     * @param startIndex
     * @param endIndex
     * @return
     * @throws Exception
     */
    List<T> findPageByQuery(String queryString, Map<String, Object> conditionMap, int startIndex, int endIndex) throws Exception;

    /**
     * 条件分页查询
     *
     * @param queryString
     * @param parameters
     * @param startIndex
     * @param endIndex
     * @return
     * @throws Exception
     */
    List<T> findPageByQuery(String queryString, Object[] parameters, int startIndex, int endIndex) throws Exception;

    /**
     * 执行sql返回一个int指
     *
     * @param sql
     * @return
     * @throws Exception
     */
    int getInt(String sql) throws Exception;

    /**
     * 获得sql语句的执行结果，该语句返回一个能转化为整形的值
     *
     * @param sql
     * @return
     * @throws Exception
     */
    int getInt(String sql, Map<String, Object> conditionMap) throws Exception;

    /**
     * 获取sql语句的执行结果，该语句返回一个能转化为整形的值
     *
     * @param sql
     * @param parameters
     * @return
     * @throws Exception
     */
    int getInt(String sql, Object[] parameters) throws Exception;

    /**
     * 查询一个对象
     *
     * @param queryString
     * @param name
     * @return
     * @throws Exception
     */
    List<T> querySingleObject(String queryString, String name) throws Exception;

    /**
     * 更新一个对象
     * @param t
     * @throws Exception
     */
    void updateObjectOfUpdate(T t) throws Exception;
}
