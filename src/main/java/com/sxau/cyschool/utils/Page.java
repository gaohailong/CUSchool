package com.sxau.cyschool.utils;

import java.util.List;

/**
 * Created by gaohailong on 2016/11/11.
 */
public class Page<T> {
    private List<T> rows;
    private long total;//总条数
    private int pageNum;//
    private int offest;//第几条记录
    private int totalPage;//总页数
    private int limit;//显示条数

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getOffest() {
        return offest;
    }

    public void setOffest(int offest) {
        this.offest = offest;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
