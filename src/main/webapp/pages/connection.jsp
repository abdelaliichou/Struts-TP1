<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: abdelali
  Date: 13/02/2024
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ICHOU ABDELALI FACE PAGE</h1>
<br/>
<s:form action="connect">
    <s:textfield name="name" label="Saisir votre nom"/>
    <s:password name="mdps" label="Saisir votre mot de passe"/>
    <s:submit/>
</s:form>
</body>
</html>