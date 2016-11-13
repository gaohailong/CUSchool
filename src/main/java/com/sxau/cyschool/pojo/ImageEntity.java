package com.sxau.cyschool.pojo;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class ImageEntity {
    private int iId;
    private String iLink;
    private String iDes;
    private String iHead;
    private Integer iClick;
    private int iPosition;

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getiLink() {
        return iLink;
    }

    public void setiLink(String iLink) {
        this.iLink = iLink;
    }

    public String getiDes() {
        return iDes;
    }

    public void setiDes(String iDes) {
        this.iDes = iDes;
    }

    public String getiHead() {
        return iHead;
    }

    public void setiHead(String iHead) {
        this.iHead = iHead;
    }

    public Integer getiClick() {
        return iClick;
    }

    public void setiClick(Integer iClick) {
        this.iClick = iClick;
    }

    public int getiPosition() {
        return iPosition;
    }

    public void setiPosition(int iPosition) {
        this.iPosition = iPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageEntity that = (ImageEntity) o;

        if (iId != that.iId) return false;
        if (iPosition != that.iPosition) return false;
        if (iLink != null ? !iLink.equals(that.iLink) : that.iLink != null) return false;
        if (iDes != null ? !iDes.equals(that.iDes) : that.iDes != null) return false;
        if (iHead != null ? !iHead.equals(that.iHead) : that.iHead != null) return false;
        if (iClick != null ? !iClick.equals(that.iClick) : that.iClick != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iId;
        result = 31 * result + (iLink != null ? iLink.hashCode() : 0);
        result = 31 * result + (iDes != null ? iDes.hashCode() : 0);
        result = 31 * result + (iHead != null ? iHead.hashCode() : 0);
        result = 31 * result + (iClick != null ? iClick.hashCode() : 0);
        result = 31 * result + iPosition;
        return result;
    }
}
