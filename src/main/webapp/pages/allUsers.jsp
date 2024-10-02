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
<h2>All the users that exist</h2>
<h3>

<%--  ici on est en train d'utiliser la fonction users ( nom exacte c'est getUsers ) qui nous donne tous les utilisateurs  --%>
<%--    le mot get c'est obligatoire dans la classe java   --%>

    <ul>
        <s:iterator value="%{users}" var="user">
            <s:url var="url" action="recupererUser">
                <s:param name="id" value="#user.id"/>
            </s:url>
            <li>
                <s:a href="%{url}">
                    <s:property value="#user.nom"/>, <s:property value="#user.prenom"/>
                </s:a>
            </li>
        </s:iterator>
    </ul>

</h3>
<br/>
</body>
</html>
