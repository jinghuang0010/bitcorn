<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Show.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/delinfo.js" charset="gb2312"></script>
	 <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css"  rel="stylesheet">
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>

<body>
	Hello: ${user.username }
	<table border="2px" width="1300px" class="table-hover">
		<tr bgcolor="#cef">
			<td>Number</td>
		    <td>Date</td> 
			<td>InvestmentPrice</td>
			<td>PurchingNumber</td>
			<td>Total</td>
			<td>SumOfInvetment</td>
			<td>MarketValue</td>
			<td>Increase</td>
			<td>Hostingcost</td>
			<td>Value</td>
			 <td>Note</td> 
		</tr>
		<c:forEach items="${list }" var="l" varStatus="i">
			<tr bgcolor="${i.index%2==1?'#cef':'' }">
				<td>${i.index+1 }</td>
				<td>${l.inverstDate }</td>
				<td>${l.inverstMoney }</td>
				<td>${l.shopingNumber }</td>
				<td>${l.sumNumber }</td>
				<td>${l.sumInvertMoney }</td>
				<td>${l.marketValue }</td>
				<td>${l.increase }</td>
				<td>${l.holdingcost }</td>
				<td>${l.value }</td>
				<td>${l.remark }</td>
				<td><input type="hidden" id="tabid" value="${l.id }"><input
					type="button" name="del" value="Delete" ondblclick="delinfo()" class="btn btn-success">
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
