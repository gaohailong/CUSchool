package com.sxau.cyschool.pojo;

import java.sql.Date;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class VideoEntity {
    private int vId;
    private String vLink;
    private String vType;
    private String vDes;
    private Date vDate;
    private Integer vRead;

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    public String getvLink() {
        return vLink;
    }

    public void setvLink(String vLink) {
        this.vLink = vLink;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public String getvDes() {
        return vDes;
    }

    public void setvDes(String vDes) {
        this.vDes = vDes;
    }

    public Date getvDate() {
        return vDate;
    }

    public void setvDate(Date vDate) {
        this.vDate = vDate;
    }

    public Integer getvRead() {
        return vRead;
    }

    public void setvRead(Integer vRead) {
        this.vRead = vRead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoEntity that = (VideoEntity) o;

        if (vId != that.vId) return false;
        if (vLink != null ? !vLink.equals(that.vLink) : that.vLink != null) return false;
        if (vType != null ? !vType.equals(that.vType) : that.vType != null) return false;
        if (vDes != null ? !vDes.equals(that.vDes) : that.vDes != null) return false;
        if (vDate != null ? !vDate.equals(that.vDate) : that.vDate != null) return false;
        if (vRead != null ? !vRead.equals(that.vRead) : that.vRead != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vId;
        result = 31 * result + (vLink != null ? vLink.hashCode() : 0);
        result = 31 * result + (vType != null ? vType.hashCode() : 0);
        result = 31 * result + (vDes != null ? vDes.hashCode() : 0);
        result = 31 * result + (vDate != null ? vDate.hashCode() : 0);
        result = 31 * result + (vRead != null ? vRead.hashCode() : 0);
        return result;
    }
}
