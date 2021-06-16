<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<section class="ftco-section ftco-degree-bg">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 order-lg-last ftco-animate">

				<section class="ftco-section ftco-degree-bg">
					<div class="container">
						<div class="row">
							<div class="col-lg-8 ftco-animate">
						<h3 class="mb-4 billing-heading">★내 펫 정보 등록★</h3>
								<form action="myPetInsertAction" method="post" enctype="multipart/form-data" class="billing-form">
									<div class="form-group">
										<label for="petImage"> 펫사진 </label> <input type="file"
											class="form-control" id="petImage" name="petImage">
									</div>
									<div class="form-group">
										<label for="petId"> 펫아이디(고유번호) </label> <input type="text"
											class="form-control" id="petId" placeholder="자동으로부여됩니다" readOnly>
									</div>
									<div class="form-group">
										<label for="petName"> 펫 이름 </label> <input type="text"
											class="form-control" id="petName" name="petName">
									</div>
									<div class="form-group">
										<label for="petType"> 펫 타입 </label> <input type="text"
											class="form-control" id="petType" name="petType">
									</div>
									<div class="form-group">
										<label for="petAge"> 펫 나이 </label> <input type="text"
											class="form-control" id="petAge" name="petAge">
									</div>
									<div class="form-group">
										<label for="petSex"> 펫 성별 </label> <input type="text"
											class="form-control" id="petSex" name="petSex">
									</div>
									<div class="form-group">
										<label for="petBreed"> 펫 종 </label> <input type="text"
											class="form-control" id="petBreed" name="petBreed">
									</div>
									<div class="form-group">
										<label for="petDiscription"> 펫 설명 </label>
										<textarea cols="30" rows="7" class="form-control"
											id="petDiscription" name="petDiscription"></textarea>
									</div>
									<div class="form-group" style="display:none">
										<label for="ownerId"> 펫주인 </label> <input type="text"
											class="form-control" id="ownerId" name="ownerId"
											value="${loginedMemberId}" >
									</div>
									<div class="form-group">
									<input type="submit" value="등록하기"
										class="btn btn-primary py-3 px-5">
								</div>
								</form>



							</div>
							<!-- .col-md-8 -->

						</div>
					</div>
				</section>
				<!-- .section -->


			</div>
			<!-- .col-md-8 -->
			<div class="col-lg-4 sidebar ftco-animate">
				<div class="sidebar-box ftco-animate">
					<h3 class="heading">Categories</h3>
					<ul class="categories">
						<li><a href="/myPet">내 펫 정보 </a></li>
						<li><a href="/myInfo">회원 정보 </a></li>
					</ul>
				</div>
			</div>

		</div>
	</div>
</section>
<!-- .section -->
