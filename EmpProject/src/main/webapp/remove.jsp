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
   margin-top: 50px;
  margin-bottom: 100px;
  margin-right: 600px;
  margin-left: 200px;
  background-color: lightyellow;
}


</style>
</head>
<body>
<div>
<b><h2 >REMOVE EMPLOY DETAILS</h2></u></b>
<form action="remove" method="post">
	Enter Id:<input type="search" name="id" required placeholder="Eg:108"> 
	<button>remove</button>
	</form>
	
	
	
	<form action="EmpDisplay.jsp" method="post">
	<p align="right" >
	<button style="height:50px;width:80px">Back</button>
	</p>
	</form>
</div>
</body>
</html>