<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script  src="./js/My97DatePicker/WdatePicker.js"></script> 
	
  	<script type="text/javascript" src="${pageContext.request.contextPath}/js/checkIndex.js" charset="gb2312"></script>
  	 <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css"  rel="stylesheet">
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
  </head>
  
  <body>
     <form action="HappyTimeServlet.do" method="post" onsubmit="return checkIndex();">
   <table border="2px" width="500px" height="400" class="table-hover">
   
   	<tr>
  	<!-- 	 <td> 日期:<input type="text" name="shoppingdate" class="Wdate" 
  		 
  		 onFocus="WdatePicker({lang:'zh-cn'})"></td> -->
   	<td>Date:<input class="Wdate" type="text"  name="shoppingdate" onclick="WdatePicker({maxDate:'%y-%M-%d'})"></td> 
   	
   	</tr>
   	<tr>
  		 <td>Purchasing Price:<input type="text" name="shoppingmoney" id="money" onblur="checkmoney()">
  		   <font id="one" color="red"></font>
  		 </td>
   	</tr>
   	<tr>
  		 <td> Total Number of Holdings:<input type="text" name="sumnumber" id="sumnum" onblur="checknum()">
  		   <font id="two" color="red"></font>
  		 </td>
   	</tr>
   	<tr>
  		 <td> Remark:<input type="text" name="remark"></td>
  		
   	</tr>	
   		
   </table>  
 	<input type="submit" value="submit" class="btn btn-success">
 	<input type="button" value="reset" onclick="resetform()"  class="btn btn-success">
    </form>
  </body>
</html>
