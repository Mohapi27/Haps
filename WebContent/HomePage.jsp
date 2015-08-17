<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
  <div class="page-header">
	<h1>Test Database Connection with <b><i>Haps</i></b></h1>
</div>

<s:form action="HomePage">
  
  <s:textfield name="name" label="Name"/>
  <s:textfield name="surname" label ="Surname"/>
  <s:textfield name="occupation" label ="Occupation"/>
  <s:submit value="Submit" align="center"/>
</s:form>
</body>
</html>