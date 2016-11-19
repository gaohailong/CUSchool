package com.sxau.cyschool.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */

public class Category implements java.io.Serializable {

	// Fields

	private Integer CId;
	private String CContent;
	private Integer CNumber;
	private Set titles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(String CContent) {
		this.CContent = CContent;
	}

	/** full constructor */
	public Category(String CContent, Integer CNumber, Set titles) {
		this.CContent = CContent;
		this.CNumber = CNumber;
		this.titles = titles;
	}

	// Property accessors

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	public String getCContent() {
		return this.CContent;
	}

	public void setCContent(String CContent) {
		this.CContent = CContent;
	}

	public Integer getCNumber() {
		return this.CNumber;
	}

	public void setCNumber(Integer CNumber) {
		this.CNumber = CNumber;
	}

	public Set getTitles() {
		return this.titles;
	}

	public void setTitles(Set titles) {
		this.titles = titles;
	}

}