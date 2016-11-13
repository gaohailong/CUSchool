package com.sxau.cyschool.pojo;

import java.util.Date;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class TitleEntity {
    private int tId;
    private String tName;
    private String tContent;
    private Integer tRead;
    private Date tDate;
    private Integer tCategory;
    private Integer tLike;
    private Integer tSort;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent;
    }

    public Integer gettRead() {
        return tRead;
    }

    public void settRead(Integer tRead) {
        this.tRead = tRead;
    }

    public Date gettDate() {
        return tDate;
    }

    public void settDate(Date tDate) {
        this.tDate = tDate;
    }

    public Integer gettCategory() {
        return tCategory;
    }

    public void settCategory(Integer tCategory) {
        this.tCategory = tCategory;
    }

    public Integer gettLike() {
        return tLike;
    }

    public void settLike(Integer tLike) {
        this.tLike = tLike;
    }

    public Integer gettSort() {
        return tSort;
    }

    public void settSort(Integer tSort) {
        this.tSort = tSort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleEntity that = (TitleEntity) o;

        if (tId != that.tId) return false;
        if (tName != null ? !tName.equals(that.tName) : that.tName != null) return false;
        if (tContent != null ? !tContent.equals(that.tContent) : that.tContent != null) return false;
        if (tRead != null ? !tRead.equals(that.tRead) : that.tRead != null) return false;
        if (tDate != null ? !tDate.equals(that.tDate) : that.tDate != null) return false;
        if (tCategory != null ? !tCategory.equals(that.tCategory) : that.tCategory != null) return false;
        if (tLike != null ? !tLike.equals(that.tLike) : that.tLike != null) return false;
        if (tSort != null ? !tSort.equals(that.tSort) : that.tSort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tId;
        result = 31 * result + (tName != null ? tName.hashCode() : 0);
        result = 31 * result + (tContent != null ? tContent.hashCode() : 0);
        result = 31 * result + (tRead != null ? tRead.hashCode() : 0);
        result = 31 * result + (tDate != null ? tDate.hashCode() : 0);
        result = 31 * result + (tCategory != null ? tCategory.hashCode() : 0);
        result = 31 * result + (tLike != null ? tLike.hashCode() : 0);
        result = 31 * result + (tSort != null ? tSort.hashCode() : 0);
        return result;
    }
}
