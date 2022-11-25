<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
div {
  border: 2px solid black;
  background-color: lightblue;
  padding-top: 50px;
  padding-right: 100px;
  padding-bottom: 50px;
  padding-left: 80px;
   margin-top: 10px;
  margin-bottom: 100px;
  margin-right: 80px;
  margin-left: 80px;
  background-color: lightyellow;
}
</style>
</head>
<body>
	<b><u><h1 align="center">EMPLOY DETAILS</h1></u></b>

	<div>

<form action="search" method="post">
	Enter Id:<input type="search" name="id" required placeholder="search"> 
	<button>submit</button>
	</form>

	<form action="Add.jsp" method="post">
	<p align="right" margin-right=5000px >
	<button style="height:100px;width:100px">Add</button>
	</p>
	</form>
	
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/project"  user="root" password="shaziya@oct2002"/>
	<sql:query  var="rs" dataSource="${db}">select * from employ_details;</sql:query>
	
	<table border="2" width="50%">  
<tr>  
<th> EID</th>  
<th> EName</th>  
<th>DOJ</th>  
<th>YOE</th>  
<th>Designation</th>  

</tr>  


<c:forEach items="${rs.rows}" var="details">
	<tr>
	<td><c:out value="${details.Eid}" /></td>
	<td><c:out value="${details.EName}" /></td>
	<td><c:out value="${details.DOJ}" /></td>
	<td><c:out value="${details.YOE}" /></td>
	<td><c:out value="${details.Designation}" /></td>
	</tr>
	</c:forEach>
</table>
<form action="remove.jsp" method="post">
	<p align="right" margin-right=5000px >
	<button style="height:50px;width:80px">remove</button>
	</p>
	</form>
</div>
</body>
</html>