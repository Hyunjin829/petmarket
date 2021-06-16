<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="siteName" value="[${logoText}]" />
		<div class="py-1 bg-black">
    	<div class="container">
    		<div class="row no-gutters d-flex align-items-start align-items-center px-md-0">
	    		<div class="col-lg-12 d-block">
		    		<div class="row d-flex">
		    			<div class="col-md pr-4 d-flex topper align-items-center">
					    	<div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-phone2"></span></div>
						    <span class="text">+ 02 1234 5678</span>
					    </div>
					    <div class="col-md pr-4 d-flex topper align-items-center">
					    	<div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-paper-plane"></span></div>
						    <span class="text">petshop@goodee.com</span>
					    </div>
					    <div class="col-md-5 pr-4 d-flex topper align-items-center text-lg-right">
					   		<span class="text">goodee "F" javateam &amp; Pet shop project</span>
					    </div>
				    </div>
			    </div>
		    </div>
		  </div>
    </div>
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="index">Petshop</a>
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="oi oi-menu"></span> Menu
	      </button>

	      <div class="collapse navbar-collapse" id="ftco-nav">
	        <ul class="navbar-nav ml-auto">
	          
	          <li class="nav-item active"><a href="index" class="nav-link">Home</a></li>
	          <li class="nav-item active"><a href="shop" class="nav-link">Shop</a></li>
	          <li class="nav-item"><a href="petShow" class="nav-link">Community</a></li>
	          <c:if test="${isLogined == false}">
	          <li class="nav-item"><a href="/member/login" class="nav-link">Login</a></li>
	          </c:if>
	          <c:if test="${isLogined}">
	          <li class="nav-item dropdown">
            	<a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pages</a>
               <div class="dropdown-menu" aria-labelledby="dropdown04"> 
                  <a class="dropdown-item" href="/myPet">My page</a>
                  <a class="dropdown-item" href="/member/doLogout">Logout</a>
               </div>
              </li>
              <li class="nav-item active"><a href="index" class="nav-link">"${loginedMember.memberId}"님 환영합니다!</a></li>
	          </c:if>

	        </ul>
	      </div>
	    </div>
	  </nav>
    <!-- END nav -->