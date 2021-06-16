package com.javateam.pet_project.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.javateam.pet_project.dao.PetDao;
import com.javateam.pet_project.entity.Pet;

public class MybatisPetDao implements PetDao{

	private PetDao mapper;
	
	@Autowired
	public MybatisPetDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(PetDao.class);
	}

	@Override
	public List<Pet> getListPetShow() {
		return null;
	}

	@Override
	public Pet getListByOwnerId(int loginedMemberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean petUpdate(Pet pet) {
		return false;
	}

	@Override
	public boolean petInsert(Pet pet) {
		return false;
	}


}
