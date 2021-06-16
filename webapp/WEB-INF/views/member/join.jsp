<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="로그인" />
<%@ include file="../part/header.jsp"%>
<head>
<link rel="stylesheet" href="/css/test.css">
</head>

<script>
	function submitJoinForm(form) {
		form.memberId.value = form.memberId.value.trim();
		if (form.memberId.value.length == 0) {
			alert('아이디를 입력해주세요.');
			form.memberId.focus();
			return false;
		}
		if (form.memberId.value.length < 4) {
			alert('아이디를 4자 이상 입력해주세요.');
			form.memberId.focus();
			return false;
		}
		if (isAlphaNumeric(form.memberId.value) == false) {
			alert('아이디는 영문자 소문자와 숫자만 사용할 수 있습니다.');
			form.memberId.focus();
			return false;
		}
		form.memberId.value = form.memberId.value.toLowerCase();

		form.memberPw.value = form.memberPw.value.trim();
		if (form.memberPw.value.length == 0) {
			alert('비밀번호를 입력해주세요.');
			form.memberPw.focus();
			return false;
		}
		form.memberPwConfirm.value = form.memberPwConfirm.value.trim();
		if (form.memberPwConfirm.value.length == 0) {
			alert('비밀번호를 확인해주세요.');
			form.memberPwConfirm.focus();
			return false;
		}
		if (form.memberPwConfirm.value != form.memberPwConfirm.value) {
			alert('비밀번호 확인이 일치하지 않습니다.');
			return false;
		}

		form.memberName.value = form.memberName.value.trim();
		if (form.memberName.value.length == 0) {
			alert('이름을 입력해주세요.');
			form.memberName.focus();
			return false;
		}
		if (form.memberName.value.length < 2) {
			alert('이름을 2자 이상 입력해주세요.');
			form.memberName.focus();
			return false;
		}
		
		form.memberNickname.value = form.memberNickname.value.trim();
		if (form.memberNickname.value.length == 0) {
			alert('닉네임을 입력해주세요.');
			form.memberNickname.focus();
			return false;
		}
		if (form.memberNickname.value.length < 2) {
			alert('이름을 2자 이상 입력해주세요.');
			form.memberNickname.focus();
			return false;
		}
		
		form.memberPhone.value = form.memberPhone.value.trim();
		if (form.memberPhone.value.length == 0) {
			alert('휴대폰 번호를 입력해주세요.');
			form.memberPhone.focus();
			return false;
		}
		if (form.memberPhone.value.length != 11) {
			alert('휴대폰 번호를 11자로 작성해주세요.');
			form.memberPhone.focus();
			return false;
		}
		
		form.memberAddress.value = form.memberAddress.value.trim();
		if (form.memberAddress.value.length == 0) {
			alert('주소를 입력해주세요.');
			form.memberAddress.focus();
			return false;
		}
		
		form.submit();
	}
</script>

<!-- Register Section Begin -->
<div class="register-login-section spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 offset-lg-3">
				<div class="register-form">
					<h2>Register</h2>
					<form onsubmit="submitJoinForm(this); return false;"
						action="/member/doJoin" method="POST"
						class="table-box form form-type-1">
						<div class="group-input">
							<label for="username">Username or email address *</label> <input
								name="memberId" autofocus="autofocus" placeholder="아이디를 입력해주세요."
								type="text" id="username">
						</div>
						<div class="group-input">
							<label for="pass">Password *</label> <input name="memberPw"
								placeholder="비밀번호를 입력해주세요." type="password" id="pass">
						</div>
						<div class="group-input">
							<label for="con-pass">Confirm Password *</label> <input
								autocomplete="off" name="memberPwConfirm"
								placeholder="비밀번호를 다시 입력해주세요." type="password" id="con-pass">
						</div>
						<div class="group-input">
							<label for="username">Name *</label> <input name="memberName"
								placeholder="이름을 입력해주세요." type="text" id="username">
						</div>
						<div class="group-input">
							<label for="con-pass">NickName *</label> <input
								name="memberNickname" placeholder="닉네임을 입력해주세요." type="text"
								id="con-pass">
						</div>
						<div class="group-input">
							<label for="con-pass">Phone *</label> <input name="memberPhone"
								placeholder="휴대폰 번호를 -없이 숫자만 입력해주세요." type="text" id="con-pass">
						</div>
						<div class="group-input">
							<label for="con-pass">Address *</label> <input
								name="memberAddress" placeholder="주소를 입력해주세요." type="text"
								id="con-pass">
						</div>



						<input type="submit" class="site-btn register-btn"
							value="REGISTER" />
					</form>
					<div class="switch-login">
						<a href="/member/login" class="or-login">Or Login</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Register Form Section End -->


<!-- Js Plugins -->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script src="js/jquery.countdown.min.js"></script>
<script src="js/jquery.nice-select.min.js"></script>
<script src="js/jquery.zoom.min.js"></script>
<script src="js/jquery.dd.min.js"></script>
<script src="js/jquery.slicknav.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/main.js"></script>
<script src="/js/test.js"></script>
</body>

<%@ include file="../part/footer.jsp"%>