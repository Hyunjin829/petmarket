package com.javateam.pet_project.service;

import java.util.List;

import com.javateam.pet_project.entity.Comment;
import com.javateam.pet_project.entity.Shop;

public interface ShopService {
	List<Shop> getList();
	
	List<Shop> getListByCate(String petType, String productCategory);
 	
	boolean productInsert(Shop shop);
	
	boolean productUpdate(Shop shop);
	
	boolean productDelete(String productName);
	
	List<Shop> getListDetail(String productName);
	
	List<Shop> getListBySeller(String loginedMemberName); 
	
	boolean commentInsert(Comment comment);
	
}
