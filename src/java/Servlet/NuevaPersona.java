/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.ControladorPersonas;
import include.Persona;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Cristian
 */
public class NuevaPersona extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        FileItemFactory file_factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(file_factory);

        ArrayList<String> campos = new ArrayList<>();
        ArrayList<String> imgs = new ArrayList<>();

        try {
            List items = sfu.parseRequest(request);
            for (int i = 0; i < items.size(); i++) {
                FileItem item = (FileItem) items.get(i);
                if (!item.isFormField()) {
                    File archivo = new File("C:\\Users\\Cristian\\Documents\\NetBeansProjects\\TeBusco2.0\\web\\img\\personas\\" + item.getName());
                    item.write(archivo);
                    imgs.add("img/personas/" + item.getName());
                } else {
                    campos.add(item.getString());
                }
            }
        } catch (Exception ex) {

        }
        String date_b = campos.get(2) + "/" + campos.get(3) + "/" + campos.get(4);
        String date_d = campos.get(5) + "/" + campos.get(6) + "/" + campos.get(7);
        Persona p = new Persona(0, campos.get(0), campos.get(1), campos.get(8), imgs.get(0), campos.get(9), campos.get(10), campos.get(11), date_b, date_d);
        ControladorPersonas cp = new ControladorPersonas();
        if (cp.crearPersona(p)) {
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
                out.println("<meta name='viewport' content='widt=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0'>");
                out.println("<title>Te Busco</title>");
                out.println("<script type='text/javascript' src='Scripts/scripts.js'></script>");
                out.println("<link rel='stylesheet' type='text/css' href='CSS/bootstrap.css'>");
                out.println("<link rel='stylesheet' type='text/css' href='CSS/styles.css'>");
                out.println("<link rel='icon' type='image/gif' href='img/favicon.gif' />");
                out.println("</head>");
                out.println("<body>");
                out.println("<nav class='navbar navbar-expand-lg navbar-light bg-light'>");
                out.println("<a class='navbar-brand' href='index.jsp'>");
                out.println("<img src='img/logo.png' width='30' height='30' class='d-inline-block align-top' alt=''>");
                out.println("TeBusco");
                out.println("</a>");
                out.println("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarSupportedContent' aria-controls='navbarSupportedContent' aria-expanded='false' aria-label='Toggle navigation'>");
                out.println("<span class='navbar-toggler-icon'></span>");
                out.println(" </button>");
                out.println("<div class='collapse navbar-collapse' id='navbarSupportedContent'>");
                out.println(" <ul class='navbar-nav mr-auto'>");
                out.println(" <li class='nav-item'>");
                out.println(" <a class='nav-link' href='index.jsp#output'>Buscados</a>");
                out.println("</li>");
                out.println("<li class='nav-item'>");
                out.println(" <a class='nav-link' href='EncontrarAAlguien.jsp'>Encontrar a alguien</a>");
                out.println(" </li>");
                out.println(" </ul>");
                out.println("</div>");
                out.println("</nav>");
                out.println("<section class='background'>");
                out.println("<img src='img/logo.png' border='1' alt='logo' width='100' height='100'>");
                out.println("<h1 class='title'>TeBusco.com</h1>");
                out.println("<h3 class='title-a'>Uniendo familias</h3>");
                out.println("</section>");
                out.println("<article class='persona bg-light'>");
                out.println("<h5 style='font-weight: 600;' class='center'>Persona creada exitosamente</h5>");
                out.println("<img src='img/createSuccessful.gif' class='gif'>");
                out.println("<a class='badge badge-info center button_des' href='index.jsp'>Regresar al inicio</a>");
                out.println("</article>");
                out.println("</body>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js'></script>");
                out.println("<script src='Scripts/bootstrap.min.js'></script>'");
                out.println("</html>");
            }
        } else {
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
                out.println("<meta name='viewport' content='widt=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0'>");
                out.println("<title>Te Busco</title>");
                out.println("<script type='text/javascript' src='Scripts/scripts.js'></script>");
                out.println("<link rel='stylesheet' type='text/css' href='CSS/bootstrap.css'>");
                out.println("<link rel='stylesheet' type='text/css' href='CSS/styles.css'>");
                out.println("<link rel='icon' type='image/gif' href='img/favicon.gif' />");
                out.println("</head>");
                out.println("<body>");
                out.println("<nav class='navbar navbar-expand-lg navbar-light bg-light'>");
                out.println("<a class='navbar-brand' href='index.jsp'>");
                out.println("<img src='img/logo.png' width='30' height='30' class='d-inline-block align-top' alt=''>");
                out.println("TeBusco");
                out.println("</a>");
                out.println("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarSupportedContent' aria-controls='navbarSupportedContent' aria-expanded='false' aria-label='Toggle navigation'>");
                out.println("<span class='navbar-toggler-icon'></span>");
                out.println(" </button>");
                out.println("<div class='collapse navbar-collapse' id='navbarSupportedContent'>");
                out.println(" <ul class='navbar-nav mr-auto'>");
                out.println(" <li class='nav-item'>");
                out.println(" <a class='nav-link' href='index.jsp#output'>Buscados</a>");
                out.println("</li>");
                out.println("<li class='nav-item'>");
                out.println(" <a class='nav-link' href='EncontrarAAlguien.jsp'>Encontrar a alguien</a>");
                out.println(" </li>");
                out.println(" </ul>");
                out.println("</div>");
                out.println("</nav>");
                out.println("<section class='background'>");
                out.println("<img src='img/logo.png' border='1' alt='logo' width='100' height='100'>");
                out.println("<h1 class='title'>TeBusco.com</h1>");
                out.println("<h3 class='title-a'>Uniendo familias</h3>");
                out.println("</section>");
                out.println("<article class='persona bg-light'>");
                out.println("<h5 style='font-weight: 600;' class='center'>Error al crear persona</h5>");
                out.println("<img src='img/noData.gif' class='gif'>");
                out.println("<a class='badge badge-info center button_des' href='EncontrarAAlguien.jsp'>Reintentar</a>");
                out.println("</article>");
                out.println("</body>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js'></script>");
                out.println("<script src='Scripts/bootstrap.min.js'></script>'");
                out.println("</html>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
