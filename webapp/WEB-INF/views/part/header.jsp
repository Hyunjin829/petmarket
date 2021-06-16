<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="siteName" value="[${logoText}]" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${siteName}-${pageTitle}</title>

<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800"
	rel="stylesheet">
<link rel="stylesheet" href="/css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="/css/animate.css">
<link rel="stylesheet" href="/css/owl.carousel.min.css">
<link rel="stylesheet" href="/css/owl.theme.default.min.css">
<link rel="stylesheet" href="/css/magnific-popup.css">
<link rel="stylesheet" href="/css/aos.css">
<link rel="stylesheet" href="/css/ionicons.min.css">
<link rel="stylesheet" href="/css/bootstrap-datepicker.css">
<link rel="stylesheet" href="/css/jquery.timepicker.css">
<link rel="stylesheet" href="/css/flaticon.css">
<link rel="stylesheet" href="/css/icomoon.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<div class="py-1 bg-black">
	<div class="container">
		<div
			class="row no-gutters d-flex align-items-start align-items-center px-md-0">
			<div class="col-lg-12 d-block">
				<div class="row d-flex">
					<div class="col-md pr-4 d-flex topper align-items-center">
						<div
							class="icon mr-2 d-flex justify-content-center align-items-center">
							<span class="icon-phone2"></span>
						</div>
						<span class="text">+ 02 1234 5678</span>
					</div>
					<div class="col-md pr-4 d-flex topper align-items-center">
						<div
							class="icon mr-2 d-flex justify-content-center align-items-center">
							<span class="icon-paper-plane"></span>
						</div>
						<span class="text">petshop@goodee.com</span>
					</div>
					<div class="col-md-5 pr-4 d-flex topper align-items-center">
						<span class="text">goodee "F" javateam &amp; Pet shop
							project</span>
					</div>
					<span class="text"> <c:if test="${isLogined == false }">
							<div class=" align-items-center text-lg-right ">
								<a href="/member/login" class="login-panel">Login</a>
							</div>
						</c:if> <c:if test="${isLogined }">
							<div class=" align-items-center text-lg-right ">
								${loginedMember.memberNickname}님 환영합니다.</div>

						</c:if>
					</span>



				</div>
			</div>
		</div>
	</div>
</div>
<nav
	class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light"
	id="ftco-navbar">
	<div class="container">
		<a class="navbar-brand" href="../index">Petshop</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#ftco-nav" aria-controls="ftco-nav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="oi oi-menu"></span> Menu
		</button>

		<div class="collapse navbar-collapse" id="ftco-nav">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a href="../index" class="nav-link">Home</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="dropdown04"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Category</a>
					<div class="dropdown-menu" aria-labelledby="dropdown04">
						<a class="dropdown-item" href="shop">Shop</a>
						<!-- <a class="dropdown-item" href="product-single.html">Single Product</a> -->
						<a class="dropdown-item" href="cart">Cart</a>
						<!-- <a class="dropdown-item" href="checkout.html">Checkout</a> -->
					</div></li>
				<li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
				<li class="nav-item"><a href="blog.html" class="nav-link">Community</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="dropdown04"
					data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pages</a>
					<div class="dropdown-menu" aria-labelledby="dropdown04">
						<a class="dropdown-item" href="#">Blog Details</a> <a
							class="dropdown-item" href="#">Shopping Cart</a> <a
							class="dropdown-item" href="#">Checkout</a> <a
							class="dropdown-item" href="/member/join">Register</a> <a
							class="dropdown-item" href="/member/login">Login</a> <a
							class="dropdown-item" href="/member/doLogout">Logout</a>
					</div></li>
				<!-- <li class="nav-item"><a href="contact.html" class="nav-link">Community</a></li> -->
				<!--  <li class="nav-item cta cta-colored"><a href="cart.html" class="nav-link"><span class="icon-shopping_cart"></span>[0]</a></li> -->

			</ul>
		</div>
	</div>
</nav>
<!-- END nav -->