package com.javateam.pet_project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.javateam.pet_project.entity.Pet;

@Mapper
public interface PetDao {
	@Select("select * from pet")
	List<Pet> getListPetShow();
	
	@Select("select * from pet where ownerId=#{loginedMemberId}")
	Pet getListByOwnerId(@Param("loginedMemberId") int loginedMemberId); 
	
	@Update("update pet set petName=#{petName}, petType=#{petType}, petAge=#{petAge}, petSex=#{petSex}, petBreed=#{petBreed}, petDiscription=#{petDiscription}, petImage=#{petImage} where ownerId=#{ownerId}")
	boolean petUpdate(Pet pet);
	
	@Insert("insert into Pet( petId, petName, petType, petAge, petSex, petBreed, petDiscription, petImage, ownerId) values (#{petId}, #{petName}, #{petType}, #{petAge}, #{petSex}, #{petBreed}, #{petDiscription}, #{petImage}, #{ownerId})")
	boolean petInsert(Pet pet);
}
