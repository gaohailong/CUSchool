package com.sxau.cyschool.pojo;

/**
 * Sort entity. @author MyEclipse Persistence Tools
 */

public class Sort implements java.io.Serializable {

	// Fields

	private Integer SId;
	private Integer SGrade;

	// Constructors

	/** default constructor */
	public Sort() {
	}

	/** full constructor */
	public Sort(Integer SGrade) {
		this.SGrade = SGrade;
	}

	// Property accessors

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public Integer getSGrade() {
		return this.SGrade;
	}

	public void setSGrade(Integer SGrade) {
		this.SGrade = SGrade;
	}

}