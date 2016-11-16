package com.sxau.cyschool.pojo;

/**
 * Image entity. @author MyEclipse Persistence Tools
 */

public class Image implements java.io.Serializable {

	// Fields

	private Integer IId;
	private Admin admin;
	private String ILink;
	private String IDes;
	private String IHead;
	private Integer IClick;
	private Integer IPosition;

	// Constructors

	/** default constructor */
	public Image() {
	}

	/** full constructor */
	public Image(Admin admin, String ILink, String IDes, String IHead,
			Integer IClick, Integer IPosition) {
		this.admin = admin;
		this.ILink = ILink;
		this.IDes = IDes;
		this.IHead = IHead;
		this.IClick = IClick;
		this.IPosition = IPosition;
	}

	// Property accessors

	public Integer getIId() {
		return this.IId;
	}

	public void setIId(Integer IId) {
		this.IId = IId;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getILink() {
		return this.ILink;
	}

	public void setILink(String ILink) {
		this.ILink = ILink;
	}

	public String getIDes() {
		return this.IDes;
	}

	public void setIDes(String IDes) {
		this.IDes = IDes;
	}

	public String getIHead() {
		return this.IHead;
	}

	public void setIHead(String IHead) {
		this.IHead = IHead;
	}

	public Integer getIClick() {
		return this.IClick;
	}

	public void setIClick(Integer IClick) {
		this.IClick = IClick;
	}

	public Integer getIPosition() {
		return this.IPosition;
	}

	public void setIPosition(Integer IPosition) {
		this.IPosition = IPosition;
	}

}