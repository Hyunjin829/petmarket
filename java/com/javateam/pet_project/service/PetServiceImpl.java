package com.javateam.pet_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javateam.pet_project.dao.PetDao;
import com.javateam.pet_project.entity.Pet;

@Service
public class PetServiceImpl implements PetService{
	
	@Autowired
	private PetDao petDao;

	@Override
	public List<Pet> getListPetShow() {
		
		List<Pet> pet = petDao.getListPetShow();
		
		return pet;
	}

	@Override
	public Pet getListByOwnerId(int loginedMemberId) {
		
		Pet pet = petDao.getListByOwnerId(loginedMemberId);
		
		return pet;
	}

	@Override
	public boolean petUpdate(Pet pet) {
		return petDao.petUpdate(pet);
	}

	@Override
	public boolean petInsert(Pet pet) {
		return petDao.petInsert(pet);
	}

	
}


