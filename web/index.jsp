<%-- 
    Document   : index
    Created on : 30/06/2018, 09:56:18 PM
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="widt=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Te Busco</title>
        <script type="text/javascript" src="Scripts/scripts.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="CSS/styles.css">
        <link rel="icon" type="image/gif" href="img/favicon.gif" />
    </head>
    <body onload="load()">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="index.jsp">
                <img src="img/logo.png" width="30" height="30" class="d-inline-block align-top" alt="">
                TeBusco
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp#output">Buscados</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="EncontrarAAlguien.jsp">Encontrar a alguien</a>
                    </li>
                </ul>
            </div>
        </nav>
        <section class="background">
            <img src="img/logo.png" border="1" alt="logo" width="100" height="100">
            <h1 class="title">TeBusco.com</h1>
            <h3 class="title-a">Uniendo familias</h3>
            <a href="#output" class="badge badge-info">Busco a alguien</a>
        </section>
        <h3 class="center">Personas buscadas</h3>
        <p id="output"></p>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="Scripts/bootstrap.min.js"></script>
</html>
