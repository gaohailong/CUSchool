package com.sxau.cyschool.pojo;

import java.util.Date;

/**
 * Title entity. @author MyEclipse Persistence Tools
 */

public class Title implements java.io.Serializable {

	// Fields

	private TitleId id;
	private Category category;
	private String TName;
	private String TContent;
	private Integer TRead;
	private Date TDate;
	private Integer TLike;
	private Integer TSort;
	private String TImage;
	private String TShortDes;

	// Constructors

	/** default constructor */
	public Title() {
	}

	/** minimal constructor */
	public Title(TitleId id, Category category, String TName, String TContent,
			Integer TRead, Date TDate) {
		this.id = id;
		this.category = category;
		this.TName = TName;
		this.TContent = TContent;
		this.TRead = TRead;
		this.TDate = TDate;
	}

	/** full constructor */
	public Title(TitleId id, Category category, String TName, String TContent,
			Integer TRead, Date TDate, Integer TLike, Integer TSort,
			String TImage, String TShortDes) {
		this.id = id;
		this.category = category;
		this.TName = TName;
		this.TContent = TContent;
		this.TRead = TRead;
		this.TDate = TDate;
		this.TLike = TLike;
		this.TSort = TSort;
		this.TImage = TImage;
		this.TShortDes = TShortDes;
	}

	// Property accessors

	public TitleId getId() {
		return this.id;
	}

	public void setId(TitleId id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTName() {
		return this.TName;
	}

	public void setTName(String TName) {
		this.TName = TName;
	}

	public String getTContent() {
		return this.TContent;
	}

	public void setTContent(String TContent) {
		this.TContent = TContent;
	}

	public Integer getTRead() {
		return this.TRead;
	}

	public void setTRead(Integer TRead) {
		this.TRead = TRead;
	}

	public Date getTDate() {
		return this.TDate;
	}

	public void setTDate(Date TDate) {
		this.TDate = TDate;
	}

	public Integer getTLike() {
		return this.TLike;
	}

	public void setTLike(Integer TLike) {
		this.TLike = TLike;
	}

	public Integer getTSort() {
		return this.TSort;
	}

	public void setTSort(Integer TSort) {
		this.TSort = TSort;
	}

	public String getTImage() {
		return this.TImage;
	}

	public void setTImage(String TImage) {
		this.TImage = TImage;
	}

	public String getTShortDes() {
		return this.TShortDes;
	}

	public void setTShortDes(String TShortDes) {
		this.TShortDes = TShortDes;
	}

}