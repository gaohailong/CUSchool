package com.sxau.cyschool.pojo;

/**
 * Created by gaohailong on 2016/11/13.
 */
public class AdminEntity {
    private int aId;
    private String aName;
    private String aPhone;
    private Integer aGrade;
    private String aPassword;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPhone() {
        return aPhone;
    }

    public void setaPhone(String aPhone) {
        this.aPhone = aPhone;
    }

    public Integer getaGrade() {
        return aGrade;
    }

    public void setaGrade(Integer aGrade) {
        this.aGrade = aGrade;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (aId != that.aId) return false;
        if (aName != null ? !aName.equals(that.aName) : that.aName != null) return false;
        if (aPhone != null ? !aPhone.equals(that.aPhone) : that.aPhone != null) return false;
        if (aGrade != null ? !aGrade.equals(that.aGrade) : that.aGrade != null) return false;
        if (aPassword != null ? !aPassword.equals(that.aPassword) : that.aPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aId;
        result = 31 * result + (aName != null ? aName.hashCode() : 0);
        result = 31 * result + (aPhone != null ? aPhone.hashCode() : 0);
        result = 31 * result + (aGrade != null ? aGrade.hashCode() : 0);
        result = 31 * result + (aPassword != null ? aPassword.hashCode() : 0);
        return result;
    }
}
