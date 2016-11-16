package com.sxau.cyschool.pojo;

/**
 * TitleId entity. @author MyEclipse Persistence Tools
 */

public class TitleId implements java.io.Serializable {

	// Fields

	private Integer TId;
	private Admin admin;

	// Constructors

	/** default constructor */
	public TitleId() {
	}

	/** full constructor */
	public TitleId(Integer TId, Admin admin) {
		this.TId = TId;
		this.admin = admin;
	}

	// Property accessors

	public Integer getTId() {
		return this.TId;
	}

	public void setTId(Integer TId) {
		this.TId = TId;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TitleId))
			return false;
		TitleId castOther = (TitleId) other;

		return ((this.getTId() == castOther.getTId()) || (this.getTId() != null
				&& castOther.getTId() != null && this.getTId().equals(
				castOther.getTId())))
				&& ((this.getAdmin() == castOther.getAdmin()) || (this
						.getAdmin() != null && castOther.getAdmin() != null && this
						.getAdmin().equals(castOther.getAdmin())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTId() == null ? 0 : this.getTId().hashCode());
		result = 37 * result
				+ (getAdmin() == null ? 0 : this.getAdmin().hashCode());
		return result;
	}

}