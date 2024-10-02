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
<h3>

<%--    ici on est en train d'utiliser getNom(), getPrenom(), getId() de la classe User pour les afficher--%>

    <s:actionerror/>

    User avec le nom <s:property value="user.nom"/> ,
    avec le prenom <s:property value="user.prenom"/> ,
    avec id <s:property value="user.id"/>

</h3>
<br/>
</body>
</html>
