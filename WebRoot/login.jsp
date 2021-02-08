<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>BITCORN INVESTMENT</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/checkLogIn.js" charset="gb2312"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css"  rel="stylesheet">
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  	<font color="red">${fail }</font>
     <form action="LoginServlet.do" method="post" onsubmit="return ckeckform();">
     ${error }
   <table border="0px" width="600px" height="400" class="table-hover">
   	<tr >
  		 <td> userName:<input type="text" name="username" id="username" onblur="checkname()" autocomplete="off">
  		  <font id="one" color="red"></font>
  		 </td>
   	</tr>
   	<tr>
  		 <td> passWord:<input type="password" name="pwd" id="pwd" onblur="checkpwd()" autocomplete="off">
  		 <font id="two" color="red"></font>
  		 </td>
   	</tr>
   	<tr>
   		<td>
   		Verification code：<input type="text" name="yanzheng" id="yzm" size="4" /><img id="img" src="ImgServlet.do"    ><a href="javascript:huan()">change</a><br/>
   		 <font id="three" color="red"></font>
   		</td>
   	</tr>
   </table>   
 	<input type="submit"  value="login" class="btn btn-success">
 	<input type="button"  onclick="resetform()" value="reset" class="btn btn-success">
 	<input type="button" value="registration" ondblclick="changeuserjsp()" class="btn btn-success">
    </form>
    
  </body>
</html>
