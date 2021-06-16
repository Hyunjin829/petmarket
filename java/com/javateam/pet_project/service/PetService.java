package com.javateam.pet_project.service;

import java.util.List;

import com.javateam.pet_project.entity.Pet;

public interface PetService {
	List<Pet> getListPetShow();
	
	Pet getListByOwnerId(int loginedMemberId);
	
	boolean petUpdate(Pet pet);
	
	boolean petInsert(Pet pet);

}
