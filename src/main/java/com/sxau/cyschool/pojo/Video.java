package com.sxau.cyschool.pojo;

import java.util.Date;

/**
 * Video entity. @author MyEclipse Persistence Tools
 */

public class Video implements java.io.Serializable {

	// Fields

	private Integer VId;
	private String VLink;
	private String VType;
	private String VDes;
	private Date VDate;
	private Integer VRead;

	// Constructors

	/** default constructor */
	public Video() {
	}

	/** minimal constructor */
	public Video(String VLink, String VDes, Date VDate, Integer VRead) {
		this.VLink = VLink;
		this.VDes = VDes;
		this.VDate = VDate;
		this.VRead = VRead;
	}

	/** full constructor */
	public Video(String VLink, String VType, String VDes, Date VDate,
			Integer VRead) {
		this.VLink = VLink;
		this.VType = VType;
		this.VDes = VDes;
		this.VDate = VDate;
		this.VRead = VRead;
	}

	// Property accessors

	public Integer getVId() {
		return this.VId;
	}

	public void setVId(Integer VId) {
		this.VId = VId;
	}

	public String getVLink() {
		return this.VLink;
	}

	public void setVLink(String VLink) {
		this.VLink = VLink;
	}

	public String getVType() {
		return this.VType;
	}

	public void setVType(String VType) {
		this.VType = VType;
	}

	public String getVDes() {
		return this.VDes;
	}

	public void setVDes(String VDes) {
		this.VDes = VDes;
	}

	public Date getVDate() {
		return this.VDate;
	}

	public void setVDate(Date VDate) {
		this.VDate = VDate;
	}

	public Integer getVRead() {
		return this.VRead;
	}

	public void setVRead(Integer VRead) {
		this.VRead = VRead;
	}

}