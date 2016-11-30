package com.sxau.cyschool.dao.impl;

import com.mchange.v2.c3p0.DataSources;
import com.sxau.cyschool.dao.BaseHibernateDao;
import com.sxau.cyschool.exception.SystemException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by gaohailong on 2016/11/11.
 */
public class BaseHibernateDaoImpl<T> implements BaseHibernateDao<T> {
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public Serializable saveObject(T t) throws Exception {
        if (t == null) {
            throw new SystemException("传入参数为空");
        } else {
            return sessionFactory.getCurrentSession().save(t);
        }
    }

    public void saveOrUpdateObject(T t) throws Exception {
        if (t == null) {
            throw new SystemException("传入的参数为空");
        } else {
            sessionFactory.getCurrentSession().saveOrUpdate(t);
        }
    }

    public void deleteObject(T t) throws Exception {
        if (t == null) {
            throw new SystemException("传入的参数为空");
        } else {
            sessionFactory.getCurrentSession().delete(t);
        }
    }

    public int deleteObjectsByIds(Class<T> clazz, String[] ids) throws Exception {
        if (clazz != null && ids != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < ids.length - 1; i++) {
                stringBuffer.append("'" + ids[i] + "',");
            }
            stringBuffer = stringBuffer.append("'" + ids[ids.length - 1] + "'");

            final String sql = "delete from " + clazz.getName() + " where id in (" + stringBuffer.toString() + ")";
            Object resultObject = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
            return Integer.parseInt(resultObject.toString());
        } else {
            throw new SystemException("传入的参数为空");
        }
    }

    public int deleteAll(Class<T> clazz) throws Exception {
        //   sessionFactory.getCurrentSession().delete(clazz);
        if (clazz != null) {
            return sessionFactory.getCurrentSession().createQuery("delete " + clazz.getName()).executeUpdate();
        } else {
            throw new SystemException("传入的参数为空");
        }
    }

    public void updateObject(T t) throws Exception {
        if (t != null) {
            sessionFactory.getCurrentSession().saveOrUpdate(t);
        } else {
            throw new SystemException("传入的参数为空");
        }
    }

    public int executeUpdate(String string) throws Exception {
        if (string != null) {
            sessionFactory.getCurrentSession().createSQLQuery(string).executeUpdate();
        } else {
            throw new SystemException("传入的参数为空");
        }
        return 0;
    }

    public T loadObject(Class<T> clazz, Serializable id) throws Exception {
        if (clazz != null && id != null) {
            T object = (T) sessionFactory.getCurrentSession().load(clazz, id);
            return object;
        } else {
            throw new SystemException("传入的参数为空");
        }
    }

    public T getObject(Class<T> clazz, Serializable id) throws Exception {
        if (clazz != null && id != null) {
            T object = (T) sessionFactory.getCurrentSession().get(clazz, id);
            return object;
        } else {
            throw new SystemException("传入的参数为空");
        }
    }

    public List<T> queryObject(String queryString) throws Exception {
        if (queryString == null) {
            throw new SystemException("传入的参数为空");
        } else {
//            System.out.print(sessionFactory);
            List<T> lists = getSession().createQuery(queryString).list();
            return lists;
        }
    }

    public List<T> querySingleObject(String queryString, String name) throws Exception {
        if (queryString == null) {
            throw new SystemException("传入的参数为空");
        } else {
            List<T> object = getSession().createQuery(queryString).setString(0, name).list();
            return object;
        }
    }

    public List<T> queryObject(String queryString, Map<String, Object> conditionMap) throws Exception {
        if (conditionMap == null) {
            return this.queryObject(queryString);
        } else if (queryString == null) {
            throw new SystemException("传入的参数为空");
        } else {
            Query query = sessionFactory.getCurrentSession().createQuery(queryString);
            Iterator<String> it = conditionMap.keySet().iterator();
            while (it.hasNext()) {
                Object key = it.next();
                query.setParameter(key.toString(), conditionMap.get(key));
            }
            List<T> resultList = query.list();
            return resultList;
        }
    }

    public List<T> queryObject(String queryString, Object[] parameters) throws Exception {
        if (parameters == null) {
            return this.queryObject(queryString);
        } else if (queryString == null) {
            throw new SystemException("传入参数为空");
        } else {
            Query query = sessionFactory.getCurrentSession().createQuery(queryString);
            for (int i = 0; i < parameters.length; i++) {
                query.setParameter(i, parameters[i]);
            }
            List<T> resultList = query.list();
            return resultList;
        }
    }

    public List<T> queryAll(Class<T> clazz) throws Exception {
        if (clazz != null) {
            List<T> resultList = sessionFactory.getCurrentSession().createQuery(" from " + clazz.getSimpleName()).list();
            return resultList;
        } else {
            throw new SystemException("传入参数为空");
        }
    }

    public List<T> queryObjectByIds(Class<T> clazz, String[] ids) throws Exception {
        if (clazz != null && ids != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < ids.length - 1; i++) {
                stringBuffer.append("'" + ids[i] + "',");
            }
            stringBuffer.append("'" + ids[ids.length - 1] + "'");
            String sql = "from" + clazz.getName() + " where id in (" + stringBuffer.toString() + ")";
            return this.queryObject(sql);
        } else {
            throw new SystemException("传入参数为空");
        }
    }

    public List<T> findDataByCondition(String queryString, int page, int rows) throws Exception {
        if (queryString == null) {
            throw new SystemException("传入的参数为空！");
        } else if (page < 0 || rows < 0) {
            throw new SystemException("传入startIndex或limit不符合要求");
        } else {
            Query query = getSessionFactory().getCurrentSession().createQuery(queryString);
            query.setFirstResult((page - 1) * rows);
            query.setMaxResults(rows);
            List<T> resultLists = query.list();
            return resultLists;
        }
    }

    public List<T> findData(String queryString) throws Exception {
        if (queryString == null) {
            throw new SystemException("传入参数为空");
        } else {
            Query query = sessionFactory.getCurrentSession().createQuery(queryString);
            List<T> resultList = query.list();
            return resultList;
        }
    }


    public List<T> findPageByQuery(String queryString, int startIndex, int endIndex) throws Exception {
        if (queryString == null) {
            throw new SystemException("传入参数为空");
        } else if (startIndex < 0 || endIndex < 0) {
            throw new SystemException("传入startIndex或limit不符合要求");
        } else {
            Query query = sessionFactory.getCurrentSession().createQuery(queryString);
            query.setFirstResult(startIndex);
            query.setMaxResults(endIndex);
            List<T> resultList = query.list();
            return resultList;
        }
    }

    public List<T> findPageByQuery(String queryString, Map<String, Object> conditionMap, int startIndex, int endIndex) throws Exception {
        if (conditionMap != null) {
            return this.findPageByQuery(queryString, startIndex, endIndex);
        } else {
            if (queryString == null) {
                throw new SystemException("传入参数为空");
            } else if (startIndex < 0 || endIndex < 0) {
                throw new SystemException("传入startIndex或limit不符合要求");
            } else {
                Query query = sessionFactory.getCurrentSession().createQuery(queryString);
                Iterator<String> iterator = conditionMap.keySet().iterator();
                while (iterator.hasNext()) {
                    Object key = iterator.next();
                    query.setParameter(key.toString(), conditionMap.get(key));
                }
                query.setFirstResult(startIndex);
                query.setMaxResults(endIndex);
                List<T> resultList = query.list();
                return resultList;
            }
        }
    }

    public List<T> findPageByQuery(String queryString, Object[] parameters, int startIndex, int endIndex) throws Exception {
        if (parameters == null) {
            return this.findPageByQuery(queryString, startIndex, endIndex);
        } else {
            if (queryString == null) {
                throw new SystemException("传入参数为空");
            } else {
                Query query = sessionFactory.getCurrentSession().createQuery(queryString);
                for (int i = 0; i < parameters.length; i++) {
                    query.setParameter(i, parameters[i]);
                }
                query.setFirstResult(startIndex);
                query.setMaxResults(endIndex);
                List<T> resultList = query.list();
                return resultList;
            }
        }
    }

    public int getInt(String sql) throws Exception {
        if (sql == null) {
            throw new SystemException("传入参数为空");
        } else {
            try {
                Query query = sessionFactory.getCurrentSession().createQuery(sql);
                Object result = query.uniqueResult();
                return Integer.parseInt(result.toString());
            } catch (Exception e) {
                throw new SystemException("传入的sql语句不符合条件：能够返回一个能转化为整形的值");
            }
        }
    }

    public int getInt(String sql, Object[] parameters) throws Exception {
        if (parameters == null) {
            return this.getInt(sql);
        } else if (sql == null) {
            throw new SystemException("传入参数为空");
        } else {
            Query query = sessionFactory.getCurrentSession().createQuery(sql);
            for (int i = 0; i < parameters.length; i++) {
                query.setParameter(i, parameters[i]);
            }
            try {
                Long result = (Long) query.uniqueResult();
                return result.intValue();
            } catch (Exception e) {
                throw new SystemException("传入的sql语句不符合条件：能够返回一个能转化为整形的值");
            }
        }
    }


    public int getInt(String sql, Map<String, Object> conditionMap) throws Exception {
        if (conditionMap == null) {
            return this.getInt(sql);
        } else if (sql == null) {
            throw new SystemException("传入的参数为空");
        } else {
            Query query = sessionFactory.getCurrentSession().createQuery(sql);
            Iterator<String> iterator = conditionMap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                query.setParameter(key.toString(), conditionMap.get(key));
            }
            try {
                Long result = (Long) query.uniqueResult();
                return result.intValue();
            } catch (Exception e) {
                throw new SystemException("传入的sql语句不符合条件：能够返回一个能转化为整形的值");
            }
        }
    }

    public void updateObjectOfUpdate(T t) throws Exception {
        if (t == null) {
            throw new SystemException("参数不能为空");
        } else {
            sessionFactory.getCurrentSession().update(t);
            sessionFactory.getCurrentSession().flush();
        }
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}