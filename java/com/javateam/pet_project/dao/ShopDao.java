package com.javateam.pet_project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.javateam.pet_project.entity.Comment;
import com.javateam.pet_project.entity.Shop;

@Mapper 
public interface ShopDao {
	@Select("select * from shop")
	List<Shop> getList();
	
	@Select("select * from shop where petType=#{petType} and productCategory=#{productCategory}")
	List<Shop> getListByCate(@Param("petType") String petType, @Param("productCategory") String productCategory);
	
	@Insert("insert into Shop( productNumber, productName, productPrice, productDescription, seller, writeDate, productImage, petType, productCategory ) "
			+ "values ( #{productNumber}, #{productName}, #{productPrice}, #{productDescription}, #{seller}, #{writeDate}, #{productImage}, #{petType}, #{productCategory})")
	boolean productInsert(Shop shop);
	
	@Update("update shop set productName=#{productName}, productPrice=#{productPrice}, productDescription=#{productDescription}, writeDate=#{writeDate}, productImage=#{productImage}, petType=#{petType}, productCategory=#{productCategory} where productName=#{productName}")
	boolean productUpdate(Shop shop);
	
	@Delete("delete from shop where productName=#{productName}")
	boolean productDelete(@Param("productName") String productName);
	
	@Select("select * from shop where productName=#{productName}")
	List<Shop> getListDetail(@Param("productName") String productName);
	
	@Select("select * from shop where seller=#{loginedMemberName}")
	List<Shop> getListBySeller(@Param("loginedMemberName") String loginedMemberName);
	
	@Insert("insert into Comment( commentNumber, memberId, memberNickname, message, writeDate, productName ) values ( #{commentNumber}, #{memberId}, #{memberNickname}, #{message}, #{writeDate}, #{productName} )")
	boolean commentInsert(Comment comment);
}
