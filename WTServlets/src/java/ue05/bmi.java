/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gerrit
 */
@WebServlet(name = "bmi", urlPatterns = {"/bmi"})
public class bmi extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet bmi</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href=\"http://localhost:8080/WTServlets/index.html\">Back to mainpage</a><br>");
            out.println("<a href=\"http://localhost:8080/WTServlets/Ue05/bmi.html\">Back to BMI</a><br><br>");
            computeBMIAndPrint(request, out);
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private void computeBMIAndPrint(HttpServletRequest request, PrintWriter out){
        try{
            double size= Double.parseDouble(request.getParameter("sizeServlet"));
            double weight= Double.parseDouble(request.getParameter("weightServlet"));
            double bmi= weight / (size * size);
            out.println("<p>You are " + size + " m tall and " + weight + " kg heavy <br> Your BMI is: " + bmi + "</p>");
        }catch(Exception e){
            out.println("ERROR: Bad values");
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
