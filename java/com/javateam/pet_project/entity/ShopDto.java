package com.javateam.pet_project.entity;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ShopDto {
	private int productNumber;             //상품번호 (등록할때 sequence 로 +1)
	private String productName;            //상품이름
	private int productPrice;              //상품가격
	private String productDescription;     //상품설명
	private String seller;                 //판매자 (글작성자)
	private Date writeDate;                //작성일자
	private MultipartFile productImage;           //파일이미지
	private String petType;                //펫타입(dog,cat)
	private String productCategory;        //상품범주(사료,의류...)
	
}
