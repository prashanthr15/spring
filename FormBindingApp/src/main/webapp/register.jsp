<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- to get bi diretional data use spring tags -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Employee Information Form</title>
<style>
    /* Add some basic styling */
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 50%;
        margin: 50px auto;
    }
    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 15px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 20px;
        border: none;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>

<div class="container">
    <h2>implementors Information</h2>
    <!--@ModelAttribute("impl")Implementers impl thisis prsent in ImplementorController java cls  ."impl" same name in html -->
    <form:form method="post" modelAttribute="impl">
      <table>
          <tr>
              <td>Id Name:</td>
              <td><form:input path="id" /></td>
          </tr>
          <tr>
              <td>Name:</td>
              <td><form:input path="iname" /></td>
          </tr>
          <tr>
              <td>City Name:</td>
              <td><form:input path="icity" /></td>
          </tr>
          <tr>
              <td>Salary:</td>
              <td><form:input path="isalary" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>
  </form:form>
</div>



</body>
</html>
