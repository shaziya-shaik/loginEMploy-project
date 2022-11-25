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

button{
background-color:grey;

}
</style>
</head>
<body>
	
<div>
	<form action="create" method="post">
	<b><u><h2>ADD EMPLOY DETAILS</h2></u></b>
	Enter id 		 :<input type="text" name="num1" required placeholder="eg.108"><br><br>
	Enter Name		 :<input type="text" name="str1" required placeholder="eg.ABC"><br><br>
	Enter DOJ 		 :<input type="date" name="str2" required><br><br>
	Enter YOE	     :<input type="text" name="num2" required placeholder="eg.3"><br><br>
	Enter Designation:<input type="text" name="str3" required placeholder="eg.java_developer"><br><br>
	<input type="submit" value="submit"> 
	</form><br>
	
	
	
	<form action="EmpDisplay.jsp">
	
	<input type="submit" value="cancel" ><br><br>
	</form>
	</div>
</body>
</html>