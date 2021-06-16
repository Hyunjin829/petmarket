package com.javateam.pet_project.entity;

import java.util.Date;

public class Pet {
	private int petId;               // 펫아이디
	private String petName;          // 펫이름
	private String petType;          // 펫타입
	private int petAge;              // 펫나이
	private String petSex;           // 펫성별
	private String petBreed;         // 펫종
	private String petDiscription;   // 펫설명
	private String petImage;         // 펫이미지
	private String ownerId;          // 펫주인아이디
	
	public Pet(int petId, String petName, String petType, int petAge, String petSex, String petBreed,
			String petDiscription, String petImage, String ownerId) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petType = petType;
		this.petAge = petAge;
		this.petSex = petSex;
		this.petBreed = petBreed;
		this.petDiscription = petDiscription;
		this.petImage = petImage;
		this.ownerId = ownerId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public String getPetSex() {
		return petSex;
	}

	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}

	public String getPetBreed() {
		return petBreed;
	}

	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	public String getPetDiscription() {
		return petDiscription;
	}

	public void setPetDiscription(String petDiscription) {
		this.petDiscription = petDiscription;
	}

	public String getPetImage() {
		return petImage;
	}

	public void setPetImage(String petImage) {
		this.petImage = petImage;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", petType=" + petType + ", petAge=" + petAge
				+ ", petSex=" + petSex + ", petBreed=" + petBreed + ", petDiscription=" + petDiscription + ", petImage="
				+ petImage + ", ownerId=" + ownerId + "]";
	}
	
	
	
	
}