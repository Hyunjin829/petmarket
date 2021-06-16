<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<section class="ftco-section bg-light">
	<div class="container">
		<div class="row">
			<div class="col-md-8 col-lg-10 order-md-last">
				<div class="row">
					<div class="col-xl-10 ftco-animate">

						<h3 class="mb-4 billing-heading">post update</h3>

						<!-- <h5>Image Upload ↓</h5>
				<form action="post/fileinsert" method="post" enctype="multipart/form-data">
					<input type="file" name="files"> 
					여기서 files는 controller에 @RequestPart MultipartFile files
					<button type="submit" class="btn btn-dark">Upload</button>
				</form>		 -->

						<c:forEach var="n" items="${list}">
							<form action="postUpdateAction" method="post"
								enctype="multipart/form-data" class="billing-form">
								<div class="form-group">
									<label for="productImage"> 상품사진 </label> <input type="file"
										class="form-control" id="productImage" name="productImage">
								</div>
								<div class="form-group">
									<label for="productName"> 상품명 </label> <input type="text"
										class="form-control" id="productName" name="productName"
										value="${n.productName }">
								</div>
								<div class="form-group">
									<label for="productPrice"> 상품가격 </label> <input type="text"
										class="form-control" id="productPrice" name="productPrice"
										value="${n.productPrice}">
								</div>
								<div class="form-group">
									<label for="petType"> 펫타입(dog/cat) </label> <input type="text"
										class="form-control" id="petType" name="petType"
										value="${n.petType}">
								</div>
								<div class="form-group">
									<label for="productCategory"> 카테고리(사료/간식/의류/용품/장난감) </label> <input
										type="text" class="form-control" id="productCategory"
										name="productCategory" value="${n.productCategory}">
								</div>
								<div class="form-group">
									<label for="productDescription"> 상품설명 </label>
									<textarea cols="30" rows="7" class="form-control"
										id="productDescription" name="productDescription">${n.productDescription}</textarea>
								</div>

								<div class="form-group">
									<input type="submit" value="수정하기"
										class="btn btn-primary py-3 px-5">
								</div>

							</form>
							<!-- END -->
						</c:forEach>


					</div>
					<!-- .col-md-8 -->


				</div>

			</div>

			<div class="col-md-4 col-lg-2">
				<div class="sidebar">
					<div class="sidebar-box-2">
						<h2 class="heading">
							<a href="shop">Shop</a>
						</h2>
						<div class="fancy-collapse-panel">
							<div class="panel-group" id="accordion" role="tablist"
								aria-multiselectable="true">
								<div class="panel panel-default">
									<div class="panel-heading" role="tab" id="headingOne">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#accordion"
												href="#collapseOne" aria-expanded="true"
												aria-controls="collapseOne">Cat shop </a>
										</h4>
									</div>
									<div id="collapseOne" class="panel-collapse collapse"
										role="tabpanel" aria-labelledby="headingOne">
										<div class="panel-body">
											<ul>
												<li><a
													href="/shopCatFeed?productCategory=사료&petType=cat">사료</a></li>
												<li><a
													href="/shopCatSnack?productCategory=간식&petType=cat">간식</a></li>
												<li><a
													href="/shopCatClothing?productCategory=의류&petType=cat">의류</a></li>
												<li><a
													href="/shopCatGoods?productCategory=용품&petType=cat">용품</a></li>
												<li><a
													href="/shopCatToy?productCategory=장난감&petType=cat">장난감</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading" role="tab" id="headingTwo">
										<h4 class="panel-title">
											<a class="collapsed" data-toggle="collapse"
												data-parent="#accordion" href="#collapseTwo"
												aria-expanded="false" aria-controls="collapseTwo">Dog
												shop </a>
										</h4>
									</div>
									<div id="collapseTwo" class="panel-collapse collapse"
										role="tabpanel" aria-labelledby="headingTwo">
										<div class="panel-body">
											<ul>
												<li><a
													href="/shopDogFeed?productCategory=사료&petType=dog">사료</a></li>
												<li><a
													href="/shopDogSnack?productCategory=간식&petType=dog">간식</a></li>
												<li><a
													href="/shopDogClothing?productCategory=의류&petType=dog">의류</a></li>
												<li><a
													href="/shopDogGoods?productCategory=용품&petType=dog">용품</a></li>
												<li><a
													href="/shopDogToy?productCategory=장난감&petType=dog">장난감</a></li>
											</ul>
										</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading" role="tab" id="headingThree">
										<h4 class="panel-title">
											<a class="collapsed" data-toggle="collapse"
												data-parent="#accordion" href="#collapseThree"
												aria-expanded="false" aria-controls="collapseThree">My
												posts </a>
										</h4>
									</div>
									<div id="collapseThree" class="panel-collapse collapse"
										role="tabpanel" aria-labelledby="headingThree">
										<div class="panel-body">
											<ul>
												<li><a href="post">글쓰기</a></li>
												<li><a href="myPostView">내글목록</a></li>
											</ul>
										</div>
									</div>
								</div>

							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
</section>