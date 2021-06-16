<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<section class="ftco-section bg-light">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-8 col-lg-10 order-md-last">
    				<div class="row">
    				
    				<c:forEach var="n" items="${list}">
    				<div class="col-lg-8 order-lg-last ftco-animate">
						<div class="row">
				<div class="col-md-12 d-flex ftco-animate">
		            <div class="blog-entry align-self-stretch d-md-flex">
		              <a class="block-20" style="background-image: url('images/${n.productImage}');">
		              </a>
		              <div class="text d-block pl-md-4">
		              	<div class="meta mb-3">
		                  <div>${n.writeDate}</div>
		                  <div>${n.seller}</div>
		                </div>
		                <h3 class="heading">${n.productName}</h3>
		                <p>${n.productDescription}</p>
		                <p><a href="/shopDetail?productName=${n.productName}" class="btn btn-primary py-2 px-3">상품상세</a>
		                <a href="/myPostUpdate?productName=${n.productName}" class="btn btn-primary py-2 px-3">상품수정</a>
		                <a href="/myPostDelete?productName=${n.productName}" class="btn btn-primary py-2 px-3">상품삭제</a></p>
		               
		              </div>
		            </div>
		          </div>
						</div>
						
          </div>
           <!-- .col-md-8 -->
           </c>
					</c:forEach>		
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