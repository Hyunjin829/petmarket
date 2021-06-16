package com.javateam.pet_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javateam.pet_project.dao.ShopDao;
import com.javateam.pet_project.entity.Comment;
import com.javateam.pet_project.entity.Shop;

@Service
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopDao shopDao;
	
	@Override
	public List<Shop> getList() {
		
		List<Shop> list = shopDao.getList();
		
		return list;
	}


	@Override
	public List<Shop> getListByCate(String petType, String productCategory) {
		List<Shop> list = shopDao.getListByCate(petType, productCategory);
		return list;
	}

	
	@Override
	public boolean productInsert(Shop shop) {
		return shopDao.productInsert(shop);
	}


	@Override
	public List<Shop> getListDetail(String productName) {
		List<Shop> list = shopDao.getListDetail(productName);
		
		return list;
	}


	@Override
	public boolean productUpdate(Shop shop) {
		return shopDao.productUpdate(shop);
	}


	@Override
	public boolean productDelete(String productName) {
		return shopDao.productDelete(productName);
	}


	@Override
	public List<Shop> getListBySeller(String loginedMemberName) {
		return shopDao.getListBySeller(loginedMemberName);
	}


	@Override
	public boolean commentInsert(Comment comment) {
		return shopDao.commentInsert(comment);
	}




}