<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'DaoHang.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
    <frameset rows="10%,*" border="2">
	 <frame src="ShangBian.jsp" scrolling="no" noresize="noresize" name="top" />
		<frameset cols="10%,*" border="2">
		
			<frame src="Navigation.jsp"  name="left" />
			
			<frame src="KongBai.jsp" name="right" />
			
		</frameset>
		
		
	</frameset>
	<noframes></noframes>
</html>
