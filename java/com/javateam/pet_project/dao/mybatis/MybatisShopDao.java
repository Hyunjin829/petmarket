package com.javateam.pet_project.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javateam.pet_project.dao.ShopDao;
import com.javateam.pet_project.entity.Comment;
import com.javateam.pet_project.entity.Shop;

@Repository
public class MybatisShopDao implements ShopDao{

	private ShopDao mapper;
	
	@Autowired
	public MybatisShopDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(ShopDao.class);
	}
	
	@Override
	public List<Shop> getList() {
		//return mapper.getList();
		return null;
	}

	@Override
	public boolean productInsert(Shop shop) {
		return false;
	}

	@Override
	public List<Shop> getListByCate(String petType, String productCategory) {
		return mapper.getListByCate(petType, productCategory);
	}

	@Override
	public List<Shop> getListDetail(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean productUpdate(Shop shop) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean productDelete(String productName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Shop> getListBySeller(String loginedMemberName) {
		return null;
	}

	@Override
	public boolean commentInsert(Comment comment) {
		// TODO Auto-generated method stub
		return false;
	}

}
