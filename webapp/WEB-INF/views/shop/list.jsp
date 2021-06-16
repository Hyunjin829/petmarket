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
		    			<div class="col-sm-12 col-md-12 col-lg-4 ftco-animate d-flex">
		    				<div class="product d-flex flex-column">
		    					<a class="img-prod"><img class="img-fluid" src="images/${n.productImage}" alt="Colorlib Template" >
		    						<div class="overlay"></div>
		    					</a>
		    					<div class="text py-3 pb-4 px-3">
		    						<div class="d-flex">
		    							<div class="cat">
				    						<span>${n.productCategory}</span>
				    					</div>
				    					<div class="rating">
			    							<p class="text-right mb-0">
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    								<a href="#"><span class="ion-ios-star-outline"></span></a>
			    							</p>
			    						</div>
			    					</div>
		    						<h3><a href="#">${n.productName}</a></h3>
		    						<div class="pricing">
			    						<p class="price"><span>${n.productPrice}원</span></p>
			    					</div>
			    					<p class="bottom-area d-flex px-3">
		    							<a href="shopDetail?productName=${n.productName}" class="add-to-cart text-center py-2 mr-1"><span>상세보기<i class="ion-ios-add ml-1"></i></span></a>
		    							<!-- <a href="#" class="buy-now text-center py-2">Buy now<span><i class="ion-ios-cart ml-1"></i></span></a> -->
		    						</p>
		    					</div>
		    				</div>
		    			</div>
		    			
		    			
		    			</c:forEach>
		    		</div>
		    		<div class="row mt-5">
		          <div class="col text-center">
		            <div class="block-27">
		              <ul>
		                <li><a href="#">&lt;</a></li>
		                <li class="active"><span>1</span></li>
		                <li><a href="#">2</a></li>
		                <li><a href="#">3</a></li>
		                <li><a href="#">4</a></li>
		                <li><a href="#">5</a></li>
		                <li><a href="#">&gt;</a></li>
		              </ul>
		            </div>
		          </div>
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