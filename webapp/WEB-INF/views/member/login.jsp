<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="로그인" />
<%@ include file="../part/header.jsp"%>
<head>
<link rel="stylesheet" href="/css/test.css">
</head>

<script>
   function submitLoginForm(form) {
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

      form.submit();
   }
</script>

<!-- Register Section Begin -->
<div class="register-login-section spad">
   <div class="container">
      <div class="row">
         <div class="col-lg-6 offset-lg-3">
            <div class="login-form">
               <h2>Login</h2>
               <form onsubmit="submitLoginForm(this); return false;"
                  action="/member/doLogin" method="POST"
                  class="table-box form form-type-1">
                  <div class="group-input">
                     <label>Username *</label> <input type="text"
                        autofocus="autofocus" name="memberId" placeholder="아이디를 입력해주세요." />
                  </div>
                  <div class="group-input">
                     <label>Password *</label> <input type="password" name="memberPw"
                        placeholder="비밀번호를 입력해주세요." />
                  </div>
                  <div class="group-input gi-check">
                     <div class="gi-more">
                        <label for="save-pass"> Save Password <input
                           type="checkbox" id="save-pass"> <span class="checkmark"></span>
                        </label> <a href="#" class="forget-pass">Forget your Password</a>
                     </div>
                  </div>
                  <input type="submit" class="site-btn login-btn" value="Sign In" />
               </form>
               <div class="switch-login">
                  <a href="/member/join" class="or-login">Or Create An Account</a>
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