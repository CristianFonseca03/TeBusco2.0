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
        <link rel="stylesheet" type="text/css" href="CSS/bootstrap.css">
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
            <article class='persona'>
                <h3 class="center" style="font-weight: 600;">Datos de la persona desaparecida</h3>
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Nombre</label>
                        <input type="text" class="form-control" name="nombre" id="validationCustom01" required>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Genero</label>
                        <select name="size" id="gender" class="custom-select" required>
                            <option value="Hombre">Hombre</option>
                            <option value="Hombre">Mujer</option>
                            <option value="Otro">Otro</option>
                        </select>
                    </div>
                </div>
                <label for="validationCustom01" style="font-weight: 600;">Fecha de nacimiento</label>
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Dia</label>
                        <select name="size" id="dia" class="custom-select">
                            <%for (int i = 1; i <= 31; i++) {%>
                            <option value='<%= i%>'><%= i%></option>
                            <%}%>
                        </select>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Mes</label>
                        <select name="size" id="mes" class="custom-select">
                            <option value='1'>Enero</option>
                            <option value='2'>Febero</option>
                            <option value='3'>Marzo</option>
                            <option value='4'>Abril</option>
                            <option value='5'>Mayo</option>
                            <option value='6'>Junio</option>
                            <option value='7'>Julio</option>
                            <option value='8'>Agosto</option>
                            <option value='9'>Septiembre</option>
                            <option value='10'>Octubre</option>
                            <option value='11'>Noviembre</option>
                            <option value='12'>Diciembre</option>
                        </select>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Año</label>
                        <select name="size" id="mes" class="custom-select">
                            <%for (int i = 1930; i <= 2018; i++) {%>
                            <option value='<%= i%>'><%= i%></option>
                            <%}%>
                        </select>
                    </div>
                </div>
                <label for="validationCustom01" style="font-weight: 600;">Visto por ultima vez el día ....</label>
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Dia</label>
                        <select name="size" id="dia" class="custom-select">
                            <%for (int i = 1; i <= 31; i++) {%>
                            <option value='<%= i%>'><%= i%></option>
                            <%}%>
                        </select>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Mes</label>
                        <select name="size" id="mes" class="custom-select">
                            <option value='1'>Enero</option>
                            <option value='2'>Febero</option>
                            <option value='3'>Marzo</option>
                            <option value='4'>Abril</option>
                            <option value='5'>Mayo</option>
                            <option value='6'>Junio</option>
                            <option value='7'>Julio</option>
                            <option value='8'>Agosto</option>
                            <option value='9'>Septiembre</option>
                            <option value='10'>Octubre</option>
                            <option value='11'>Noviembre</option>
                            <option value='12'>Diciembre</option>
                        </select>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Año</label>
                        <select name="size" id="mes" class="custom-select">
                            <%for (int i = 1930; i <= 2018; i++) {%>
                            <option value='<%= i%>'><%= i%></option>
                            <%}%>
                        </select>
                    </div>
                </div>
                <div class="form-row">
                    <label for="validationCustom01">Descripción</label>
                    <textarea cols="30" rows="6" class="form-control" name="descripcion" id="descripcion"></textarea>
                </div>
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="">Imagen:</label>
                        <input type="file" name="file[]" id="archivos" multiple>
                    </div>
                </div>
            </article>
            <article class='persona'>
                <h3 class="center" style="font-weight: 600;">Tus datos</h3>
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Nombre</label>
                        <input type="text" class="form-control" name="nombre" id="validationCustom01" required>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Telefono</label>
                        <input type="text" class="form-control" name="nombre" id="validationCustom01" required>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationCustom01">Cedula</label>
                        <input type="text" class="form-control" name="nombre" id="validationCustom01" required>
                    </div>
                </div>
            </article>
            <button class="badge badge-info center button_des" type="submit">Enviar</button>
        </form>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="Scripts/bootstrap.min.js"></script>
</html>
