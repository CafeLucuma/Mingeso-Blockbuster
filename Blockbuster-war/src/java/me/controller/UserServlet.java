/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.controller;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import me.bean.UsuarioFacadeLocal;
import me.model.Usuario;

/**
 *
 * @author oscar
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/main"})
public class UserServlet extends HttpServlet {
    @EJB
    private UsuarioFacadeLocal usuarioFacade;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*String action = request.getParameter("action");
        String userIdStr = request.getParameter("userId");
        int userId = 0;
        if(userIdStr != null && !userIdStr.equals(""))
            userId = Integer.parseInt(userIdStr);
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        Usuario usuario = new Usuario(userId, userName, password);
        
        if("Add".equalsIgnoreCase(action))
        {
            usuarioFacade.create(usuario);
        }
        else
        {
            usuario = usuarioFacade.find(userId);
        }
        
        request.setAttribute("usuario", usuario);
        */
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        
        List<Usuario> user = usuarioFacade.login(username, password);
        if(user.isEmpty())
        {
            request.setAttribute("allUsuarios", usuarioFacade.findAll());
            request.getRequestDispatcher("userinfo.jsp").forward(request, response);
        }
        else
        {
            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("welcome", user.get(0));
            response.sendRedirect("productosIndex");
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
