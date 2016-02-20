<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="true"%>

<html lang="en">
<head>


<style type="text/css">
.help-inline {
	color: #FF0000;
}
</style>

<meta charset="utf-8">

<%-- <script src="${pageContext.request.contextPath}/resources/js/vkboardc.js"></script> --%>
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.onScreenKeyboard.js"></script>

<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/gt_favicon.png">

<link rel="stylesheet" media="screen" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css">

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery-ui.css">

<!-- Custom styles for our template -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.css" media="screen">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/onScreenKeyboard.css">

	</head> 
	<body><div class="container">
    <h1>Knowledge OverFlowed</h1>
    <p>Enter your post</p>
    <form role="form">
        <div class="row">
            <div class="form-group">
                <label for="code">Name</label>
                <input type="text" class="form-control input-lg">
            </div>
        </div>

        <div class="row">
            <button type="submit" class="btn btn-default">   Look for   &nbsp</button>
             <button type="submit" class="btn btn-default">   Post   </button>
        </div>
       
    </form>
</div>
	</body>
</html>
