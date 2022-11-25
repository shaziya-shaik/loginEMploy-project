<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
	<div>
	<table border="2" width="50%"> 
	
	<tr>  
<th> EID</th>  
<th> EName</th>  
<th>DOJ</th>  
<th>YOE</th>  
<th>Designation</th>  

</tr>  
	
	<tr>
	<td>${e.eid }</td>
	<td>${e.EName}</td>
	<td>${e.DOB}</td>
	<td>${e.YOJ}</td>
	<td>${e.designation}</td>
	
	</tr>
</table>

<form action="EmpDisplay.jsp" method="post">
	<p align="right" >
	<button style="height:50px;width:80px">Back</button>
	</p>
	</form>
	<form action="remove.jsp" method="post">
	<p align="right" margin-right=5000px >
	<button style="height:50px;width:80px">remove</button>
	</p>
	</form>
	</div>
</body>
</html>