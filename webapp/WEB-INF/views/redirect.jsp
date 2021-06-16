<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	var jsAlertMsg = '${jsAlertMsg}';
	if (jsAlertMsg){
		alert(jsAlertMsg);
	}
	
	var jsHistoryBack = '${jsHistoryBack}' == 'true';
	if (jsHistoryBack) {
		history.back();
	}
	
	var jsLocationReplaceUrl = '${jsLocationReplaceUrl}';
	if (jsLocationReplaceUrl) {
		location.replace(jsLocationReplaceUrl);
	}

</script>