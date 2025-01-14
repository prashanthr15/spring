<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!--  to iterate the data from collection in html use jstl tag-->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="wrapper">
<div id="header">
<h1>customer relationship management application</h1>
</div>
</div>

<div id="container">
<div id="content">
<input type="button" value ="Register Customer" onClick="window.location.href='/CRM/showForm';return false;" class="add-button">
<table border ="1">
<tr>
<th>First Name</th>
<th> Last Name</th>
<th>City</th>
<th>Update</th>
<th>Delete</th>


</tr>
<!-- same like  for(var varname:collection name)
 -->
 <c:forEach var="customer" items="${customers }">
 <c:url var="Deletelink" value="/deleteData">
 <c:param name="customerId" value="${customer.id}"></c:param>
 </c:url>
 
 <c:url var="Updatelink" value="/updateForm">
 <c:param name="customerId" value="${customer.id}"></c:param>
 </c:url>
 <tr>
 <!-- sameaas customerinfo var names -->
 <td>${customer.firstName}</td>
 <td>${customer.lastName}</td>
 <td>${customer.city}</td>
 <td><a href="${Deletelink}">delete</a></td>
 <td><a href="${Updatelink }">update</a></td>
 
 </tr>
 </c:forEach>
</table>
</div>
</div>


</body>
</html>