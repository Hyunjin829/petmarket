<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<section class="ftco-section ftco-degree-bg">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 order-lg-last ftco-animate">
			<h3 class="mb-4 billing-heading">★회원정보★</h3>
				<form action="#" method="get" class="billing-form">
					<div class="form-group">
						<label for="memberId"> 회원 아이디 </label> <input type="text"
							class="form-control" id="memberId" name="memberId" value="${member.memberId}" readOnly>
					</div>
					<div class="form-group">
						<label for="memberName"> 회원 이름 </label> <input type="text"
							class="form-control" id="memberName" name="memberName"
							value="${member.memberName}" readOnly>
					</div>
					<div class="form-group">
						<label for="memberNickName"> 회원 닉네임 </label> <input type="text"
							class="form-control" id="memberNickName" name="memberNickName"
							value="${member.memberNickname}" readOnly>
					</div>
					<div class="form-group">
						<label for="memberPhone"> 회원 전화번호 </label> <input type="text"
							class="form-control" id="memberPhone" name="memberPhone"
							value="${member.memberPhone}" readOnly>
					</div>
					<div class="form-group">
						<label for="memberAddress"> 회원 주소 </label> <input type="text"
							class="form-control" id="memberAddress" name="memberAddress" value="${member.memberAddress}" readOnly>
					</div>
					<a href="/myInfoUpate?memberId=${member.memberId}" class="btn btn-primary py-2 px-3">회원수정</a>
				</form>
				<!-- END -->






			</div>
			<!-- .col-md-8 -->
			<div class="col-lg-4 sidebar ftco-animate">
				<div class="sidebar-box ftco-animate">
					<h3 class="heading">Categories</h3>
					<ul class="categories">
						<li><a href="/myPet">내 펫 정보</a></li>
						<li><a href="/myInfo">회원 정보 </a></li>
					</ul>
				</div>
			</div>

		</div>
	</div>
</section>
<!-- .section -->





