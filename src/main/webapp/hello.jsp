<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello JEE - JSP</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: #f5f5f5;
        }
        .container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }
        h1 {
            color: #333;
            text-align: center;
        }
        .info {
            background-color: #e8f4f8;
            padding: 15px;
            border-left: 4px solid #2196F3;
            margin: 20px 0;
        }
        .current-time {
            color: #666;
            font-size: 14px;
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Hello from Java EE with JSP!</h1>
        
        <div class="info">
            <p><strong>${message}</strong></p>
            <p>Cette page est générée par une JSP appelée depuis HelloServlet.</p>
            <p>Bonjour ${user} !</p>
        </div>
        
        <p>Paramètres de la requête :</p>
        <ul>
            <li>Méthode : ${pageContext.request.method}</li>
            <li>URI : ${pageContext.request.requestURI}</li>
            <li>Serveur : ${pageContext.request.serverName}:${pageContext.request.serverPort}</li>
        </ul>
        
        <div class="current-time">
            <fmt:formatDate value="${now}" pattern="dd/MM/yyyy HH:mm:ss" />
        </div>
        
        <%-- Déclaration d'une méthode --%>
        <%! 
            private String getBrowserInfo(String userAgent) {
                if (userAgent.contains("Firefox")) return "Firefox";
                if (userAgent.contains("Chrome")) return "Chrome";
                if (userAgent.contains("Safari")) return "Safari";
                return "Autre";
            }
        %>
        
        <div class="info">
            <h3>Informations supplémentaires :</h3>
            <ul>
                <li>Navigateur : <%= getBrowserInfo(request.getHeader("User-Agent")) %></li>
                <li>Session ID : ${pageContext.session.id}</li>
                <li>Contexte : ${pageContext.servletContext.contextPath}</li>
            </ul>
            
            <%-- Condition avec JSTL --%>
            <c:if test="${not empty param.name}">
                <p>Paramètre 'name' reçu : <strong>${param.name}</strong></p>
            </c:if>
            
            <%-- Boucle avec JSTL --%>
            <p>Compteur :</p>
            <c:forEach var="i" begin="1" end="5">
                <span style="color: #333;">★</span>
            </c:forEach>
        </div>
    </div>
</body>
</html>
