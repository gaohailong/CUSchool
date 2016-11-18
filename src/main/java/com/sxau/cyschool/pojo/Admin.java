package com.sxau.cyschool.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer AId;
	private String AName;
	private String APhone;
	private Integer AGrade;
	private String APass;
	private Set images = new HashSet(0);
	private Set videos = new HashSet(0);
	private Set titles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String AName, String APhone, String APass) {
		this.AName = AName;
		this.APhone = APhone;
		this.APass = APass;
	}

	/** full constructor */
	public Admin(String AName, String APhone, Integer AGrade, String APass,
			Set images, Set videos, Set titles) {
		this.AName = AName;
		this.APhone = APhone;
		this.AGrade = AGrade;
		this.APass = APass;
		this.images = images;
		this.videos = videos;
		this.titles = titles;
	}

	// Property accessors

	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	public String getAName() {
		return this.AName;
	}

	public void setAName(String AName) {
		this.AName = AName;
	}

	public String getAPhone() {
		return this.APhone;
	}

	public void setAPhone(String APhone) {
		this.APhone = APhone;
	}

	public Integer getAGrade() {
		return this.AGrade;
	}

	public void setAGrade(Integer AGrade) {
		this.AGrade = AGrade;
	}

	public String getAPass() {
		return this.APass;
	}

	public void setAPass(String APass) {
		this.APass = APass;
	}

	public Set getImages() {
		return this.images;
	}

	public void setImages(Set images) {
		this.images = images;
	}

	public Set getVideos() {
		return this.videos;
	}

	public void setVideos(Set videos) {
		this.videos = videos;
	}

	public Set getTitles() {
		return this.titles;
	}

	public void setTitles(Set titles) {
		this.titles = titles;
	}

}