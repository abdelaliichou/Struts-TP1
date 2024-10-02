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
<h1>ICHOU ABDELALI HOME PAGE</h1>
<h1><s:text name="home.h1"/></h1>
<h2><s:text name="home.h2"/></h2>
<h3><s:text name="home.h3"/></h3>
<br/>
<s:a action="menu">Go to Menu</s:a>
<br>
<s:a action="game">Go to the Pile/Face Game</s:a>
<br>
<s:a action="connection">Go to the Connection page</s:a>
<br>
<s:a action="all">Go to the all users page</s:a>
<br>
<br>
<h3><s:text name="Variable de session et d'application"/></h3>

<%--on cherche de recuperer le user qui a id = 1 --%>

<s:url var="monUrl" action="recupererUser">
    <s:param name="id" value="1"/>
</s:url>
<s:a href="%{#monUrl}">Recuperer user numero 1</s:a>

<br/>
<br/>

<%--on cherche de recuperer le user qui a id = 1 mais en tant que variable de session--%>

<s:a action="session">Recuperer user numero 1 comme varibale de session</s:a>

</body>
</html>
