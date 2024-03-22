<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- to get bi diretional data use spring tags -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM Registration form</title>
</head>
<body>
<div id="wrapper">
<div id="header">
<h1>customer relationship management Registration form</h1>
</div>
</div>

<!--model.put("customer", customer); taken this as  modelAttribute="customer" -->
<form:form action="registerCustomer" modelAttribute="customer">
      <table>
         <form:hidden path="id"/>
         <tr>
         <th>Customer First name</th>
         <td><form:input path="firstName" /></td>
         </tr>
         <tr>
         <th>Customer Last name</th>
         <td><form:input path="lastName" /></td>
         </tr>
         <tr>
         <th>Customer city</th>
         <td><form:input path="city" /></td>
         </tr>
         
          <tr>
         
         <td><input type="submit" value="signup"></td>
         </tr>
      </table>
  </form:form>
</body>
</html>