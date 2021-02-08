<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/adduser.js" charset="gb2312"></script>
	 <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css"  rel="stylesheet">
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <form action="UpdUserPwdServlet.do" method="post" onsubmit="return ckeckform();">
 	<input type="hidden" name="userid" value="${ubak.userid }">
   <table border="2px" width="400px" height="400">
   	<tr>
  		 <td>userName:<input type="text" name="username" id="username" onblur="checkname()" autocomplete="off" value="${ubak.username }" disabled="disabled">
  		  <font id="one" color="red"></font>
  		 </td>
   	</tr>
   	<tr>																								
  		 <td>newPassword:<input type="password" name="pwd" id="pwd" onblur="checkpwd()" autocomplete="off" value="${ubak.pwd }">
  		 <font id="two" color="red"></font>
  		 </td>
   	</tr>
   		
   </table>   
 	<input type="submit" value="submit" class="btn btn-success">
    </form>
  </body>
</html>
