package com.javateam.pet_project.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class PetDto {
	private int petId;               // 펫아이디
	private String petName;          // 펫이름
	private String petType;          // 펫타입
	private int petAge;              // 펫나이
	private String petSex;           // 펫성별
	private String petBreed;         // 펫종
	private String petDiscription;   // 펫설명
	private MultipartFile petImage;         // 펫이미지
	private String ownerId;          // 펫주인아이디

}
