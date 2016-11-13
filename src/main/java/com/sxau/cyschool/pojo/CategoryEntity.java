package com.sxau.cyschool.pojo;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class CategoryEntity {
    private int cId;
    private String cContent;
    private String cNumber;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (cId != that.cId) return false;
        if (cContent != null ? !cContent.equals(that.cContent) : that.cContent != null) return false;
        if (cNumber != null ? !cNumber.equals(that.cNumber) : that.cNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId;
        result = 31 * result + (cContent != null ? cContent.hashCode() : 0);
        result = 31 * result + (cNumber != null ? cNumber.hashCode() : 0);
        return result;
    }
}
