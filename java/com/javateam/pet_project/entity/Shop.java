package com.javateam.pet_project.entity;

import java.util.Date;

public class Shop {
	private int productNumber;             //상품번호 (등록할때 sequence 로 +1)
	private String productName;            //상품이름
	private int productPrice;              //상품가격
	private String productDescription;     //상품설명
	private String seller;                 //판매자 (글작성자)
	private Date writeDate;                //작성일자
	private String productImage;           //파일이미지
	private String petType;                //펫타입(dog,cat)
	private String productCategory;        //상품범주(사료,의류...)

	public Shop() {}

	public Shop(int productNumber, String productName, int productPrice, String productDescription, String seller,
			Date writeDate, String productImage, String petType, String productCategory) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.seller = seller;
		this.writeDate = writeDate;
		this.productImage = productImage;
		this.petType = petType;
		this.productCategory = productCategory;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	//productImage
	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Shop [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDescription=" + productDescription + ", seller=" + seller + ", writeDate="
				+ writeDate + ", productImage =" + productImage + ", petType=" + petType + ", productCategory=" + productCategory + "]";
	}
	
	
		
}
