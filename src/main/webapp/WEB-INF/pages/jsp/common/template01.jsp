<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<head>    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
</head>  
<body style="text-align:center;">
	<h1>This is inserting from template 01</h1>
	
	<div ><tiles:insertAttribute name="header" /></div>     
        <div>    
        <tiles:insertAttribute name="body" /></div>    
        <div><tiles:insertAttribute name="footer" /></div>    
</body>
</html>