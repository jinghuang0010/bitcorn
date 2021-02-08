<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  </head>
  
  <body>
    <form action="AddUserServlet.do" method="post" onsubmit="return ckeckform();">
   <table border="2px" width="400px" height="400">
   	<tr>
  		 <td>请输入用户名:<input type="text" name="username" id="username" onblur="checkname()" autocomplete="off">
  		  <font id="one" color="red"></font>
  		 </td>
   	</tr>
   	<tr>
  		 <td>请输入密码:<input type="password" name="pwd" id="pwd" onblur="checkpwd()" autocomplete="off">
  		 <font id="two" color="red"></font>
  		 </td>
   	</tr>
   		
   </table>   
 	<input type="submit" value="注册">
    </form>
  </body>
</html>
