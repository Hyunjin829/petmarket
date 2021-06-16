<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<section class="ftco-section bg-light">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-8 col-lg-10 order-md-last">
    				<div class="row">
    				<div class="col-xl-10 ftco-animate">
       					   <h3 class="mb-4 billing-heading">Detail product</h3>
    <section class="ftco-section">
    	<div class="container">
    		<div class="row">
    			<div class="col-lg-6 mb-5 ftco-animate">
    				<a href="images/${list[0].productImage}" class="image-popup prod-img-bg"><img src="images/${list[0].productImage}" class="img-fluid" alt="Colorlib Template"></a>
    			</div>
    			<div class="col-lg-6 product-details pl-md-5 ftco-animate">
    			
    				<h3 >${list[0].productName}</h3>
    				<h4><span>${list[0].productPrice}원</span></h4>
    				<div class="rating d-flex">
							<p class="text-left mr-4">
								판매자 : ${list[0].seller}
							</p>
					</div>
    				<p>${list[0].productDescription}</p>
    				
    			</div>
    		</div>
			<div class="pt-5 mt-5">
              <h3 class="mb-5">Comments</h3>
              <ul class="comment-list">
                <li class="comment">
                  <div class="vcard bio">
                    <img src="images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>가격흥정왕 네오집사</h3>
                    <div class="meta">June 27, 2018 at 2:21pm</div>
                    <p>조금만 깎아주세요 제발요 이것은 더미텍스트입니다. 댓글테스트중</p>
                  </div>
                </li>
                <li class="comment">
                  <div class="vcard bio">
                    <img src="images/person_1.jpg" alt="Image placeholder">
                  </div>
                  <div class="comment-body">
                    <h3>스트롱베이비</h3>
                    <div class="meta">June 27, 2018 at 2:21pm</div>
                    <p>새우밥 찾고있습니다 연락주세요</p>
                  </div>
                </li>
              </ul>
              <!-- END comment-list -->
              
              <div class="comment-form-wrap pt-5">
                <h3 class="mb-5">Leave a comment</h3>
                <form action="commentAction"  method="post" class="p-5 bg-light">
                 <div class="form-group" style="display:none">
                    <input type="text" class="form-control" id="memberId" name="memberId" value=${list[0].seller} >
                    <input type="text" class="form-control" id="productName" name="productName" value=${list[0].productName} >
                  </div>
                  <div class="form-group" >
                    <label for="name">NickName *</label>
                    <input type="text" class="form-control" id="memberNickname" name="memberNickname" value=${loginedMemberName} readOnly>
                  </div>
                  <div class="form-group">
                    <label for="message">Message *</label>
                    <textarea name="message" id="message" cols="30" rows="10" class="form-control" placeholder="Message"></textarea>
                  </div> 
                  <div class="form-group">
                    <input type="submit" value="Post Comment" class="btn py-3 px-4 btn-primary">
                  </div>

                </form>
              </div>
    	</div>
    </section>
	          <!-- END -->
          </div> <!-- .col-md-8 -->
		    		</div>
		    	</div>
		    	<div class="col-md-4 col-lg-2">
		    		<div class="sidebar">
							<div class="sidebar-box-2">
								<h2 class="heading"><a href="shop">Shop</a></h2>
								<div class="fancy-collapse-panel">
                  <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                     <div class="panel panel-default">
                         <div class="panel-heading" role="tab" id="headingOne">
                             <h4 class="panel-title">
                                 <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">Cat shop
                                 </a>
                             </h4>
                         </div>
                         <div id="collapseOne" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
                             <div class="panel-body">
                                 <ul>
                                 	<li><a href="/shopCatFeed?productCategory=사료&petType=cat">사료</a></li>
                                 	<li><a href="/shopCatSnack?productCategory=간식&petType=cat">간식</a></li>
                                 	<li><a href="/shopCatClothing?productCategory=의류&petType=cat">의류</a></li>
                                 	<li><a href="/shopCatGoods?productCategory=용품&petType=cat">용품</a></li>
                                 	<li><a href="/shopCatToy?productCategory=장난감&petType=cat">장난감</a></li>
                                 </ul>
                             </div>
                         </div>
                     </div>
                     <div class="panel panel-default">
                         <div class="panel-heading" role="tab" id="headingTwo">
                             <h4 class="panel-title">
                                 <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">Dog shop
                                 </a>
                             </h4>
                         </div>
                         <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                             <div class="panel-body">
                                <ul>
                                 	<li><a href="/shopDogFeed?productCategory=사료&petType=dog">사료</a></li>
                                 	<li><a href="/shopDogSnack?productCategory=간식&petType=dog">간식</a></li>
                                 	<li><a href="/shopDogClothing?productCategory=의류&petType=dog">의류</a></li>
                                 	<li><a href="/shopDogGoods?productCategory=용품&petType=dog">용품</a></li>
                                 	<li><a href="/shopDogToy?productCategory=장난감&petType=dog">장난감</a></li>
                                </ul>
                             </div>
                         </div>
                     </div>
                     <div class="panel panel-default">
                         <div class="panel-heading" role="tab" id="headingThree">
                             <h4 class="panel-title">
                                 <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">My posts
                                 </a>
                             </h4>
                         </div>
                         <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
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