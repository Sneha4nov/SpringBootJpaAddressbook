<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addA">
Name : <input type="text" name="name"> <br>
Language : <input type="text" name="language"> <br>
Organization <input type="text" name="organization"> <br>

<input type="submit"> <br>
</form>


<form action="getA">
Search by Name : <input type="text" name="name"> <br>

<input type="submit"> <br>
</form>


<form action="getOrg">
Serach By Organization : <input type="text" name="organization"> <br>

<input type="submit"> <br>
</form>

<form action="retrievedata">
Click the button to retreieve all data

<input type="submit"> <br>
</form>


 <form action="deleteContact">
Enter the name to delete data : <input type="text" name="name"> <br>

<input type="submit"> <br>
</form>

</body>
</html>