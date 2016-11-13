package com.sxau.cyschool.pojo;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class SortEntity {
    private int sId;
    private String sGrade;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsGrade() {
        return sGrade;
    }

    public void setsGrade(String sGrade) {
        this.sGrade = sGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SortEntity that = (SortEntity) o;

        if (sId != that.sId) return false;
        if (sGrade != null ? !sGrade.equals(that.sGrade) : that.sGrade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sId;
        result = 31 * result + (sGrade != null ? sGrade.hashCode() : 0);
        return result;
    }
}
