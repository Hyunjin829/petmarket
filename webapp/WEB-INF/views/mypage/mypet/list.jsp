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
								<h3 class="mb-4 billing-heading">★내 펫 정보★</h3>
								 <%-- <c:if test="${pet.petId eq null}">
									펫 정보를 등록해주세요.
									<a href="/myPetInsert" class="btn btn-primary py-2 px-3">펫 정보 등록</a>
								</c:if> 
								<c:if test="${pet.petId eq not null}"> --%>
								<form action="/myPetUpdateAction" method="post"
									class="billing-form">
									<div class="form-group">
											<a class="block-20" style="background-image: url('images/${pet.petImage}');"></a>
									</div>
									<div class="form-group">
										<label for="petId"> 펫아이디(고유번호) </label> <input type="text"
											class="form-control" id="petId" name="petId"
											value="${pet.petId}" readOnly>
									</div>
									<div class="form-group">
										<label for="petName"> 펫 이름 </label> <input type="text"
											class="form-control" id="petName" name="petName"
											value="${pet.petName}" readOnly>
									</div>
									<div class="form-group">
										<label for="petType"> 펫 타입 </label> <input type="text"
											class="form-control" id="petType" name="petType"
											value="${pet.petType}" readOnly>
									</div>
									<div class="form-group">
										<label for="petAge"> 펫 나이 </label> <input type="text"
											class="form-control" id="petAge" name="petAge"
											value="${pet.petAge}" readOnly>
									</div>
									<div class="form-group">
										<label for="petSex"> 펫 성별 </label> <input type="text"
											class="form-control" id="petSex" name="petSex"
											value="${pet.petSex}" readOnly>
									</div>
									<div class="form-group">
										<label for="petBreed"> 펫 종 </label> <input type="text"
											class="form-control" id="petBreed" name="petBreed"
											value="${pet.petBreed}" readOnly>
									</div>
									<div class="form-group">
										<label for="petDiscription"> 펫 설명 </label>
										<textarea cols="30" rows="7" class="form-control"
											id="petDiscription" name="petDiscription" readOnly>${pet.petDiscription}</textarea>
									</div>
									<a href="/myPetUpdate?ownerId=${pet.ownerId}"
										class="btn btn-primary py-2 px-3">펫 정보 수정</a>
								</form>
								<%-- </c:if> --%>
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
