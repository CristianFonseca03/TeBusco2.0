<%-- 
    Document   : EncontrarAAlguien
    Created on : 1/07/2018, 06:32:11 PM
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="widt=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Te Busco: Encontrar a alguien</title>
        <script type="text/javascript" src="Scripts/scripts.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="CSS/styles.css">
        <link rel="icon" type="image/gif" href="img/favicon.gif" />
    </head>
    <body>
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
            <h1 class="title">TeBusco.com</h1>
            <h3 class="title-a">Uniendo familias</h3>
            <a href="#output" class="badge badge-info">Busco a alguien</a>
        </section>
        <form action="crearpersona" name="frmnuevo" method="POST" enctype="multipart/form-data" id="frm_nuevo">
            <h3 class="center">Datos de la persona desaparecida</h3>
            <table>
                <tr>
                    <td><label for="">Nombre:</label></td>
                    <td><input type="text" name="nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">Genero:</label></td>
                    <td><input type="text" name="nombre" id="genero"></td>
                </tr>
                <tr>
                    <td><label for="">Descripcion:</label></td>
                    <td><textarea cols="30" rows="6" name="descripcion" id="descripcion"></textarea></td>
                </tr>
                <tr>
                    <td><label for="">Imagenes:</label></td>
                    <td><input type="file" name="file[]" id="archivos" multiple></td>
                </tr>
                <tr>
                    <td><label for="">Nombre PB:</label></td>
                    <td><input type="text" name="nombrePB" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">tel PB:</label></td>
                    <td><input type="text" name="telPB" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">ced PB:</label></td>
                    <td><input type="text" name="cedPB" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">fecha cum:</label></td>
                    <td><input type="text" name="cedPB" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="">fecha dis:</label></td>
                    <td><input type="text" name="cedPB" id="nombre"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Crear Persona" id="btncrearproducto"></td>
                </tr>
            </table>
        </form>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="Scripts/bootstrap.min.js"></script>
</html>
