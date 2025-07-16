<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            <p><strong><%= request.getAttribute("message") %></strong></p>
            <p>Cette page est générée par une JSP appelée depuis HelloServlet.</p>
            <p>Bonjour <%= request.getAttribute("user") %> !</p>
        </div>
        
        <p>Paramètres de la requête :</p>
        <ul>
            <li>Méthode : <%= request.getMethod() %></li>
            <li>URI : <%= request.getRequestURI() %></li>
            <li>Serveur : <%= request.getServerName() %>:<%= request.getServerPort() %></li>
        </ul>
        
        <div class="current-time">
            Généré le : <%= new java.util.Date() %>
        </div>
    </div>
</body>
</html>
