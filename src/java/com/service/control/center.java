/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Desarrollo1
 */
public class center extends HttpServlet{
   
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)throws IOException{
        
        
        System.out.println("processRequest center header origen: ");// + req.getHeader("origen"));
        
        System.out.println("processRequest center header: " + req.getHeader("Authorization"));
        
        
        resp.setHeader("Access-Control-Allow-Origin","*");
        resp.setHeader("Access-Control-Allow-Methods","GET");
        resp.setHeader("Access-Control-Allow-Headers","Cache-Control, Pragma, Origin, Authorization, Content-Type, X-Requested-With");
        resp.setContentType("text/html");
        resp.setHeader("Cache-control", "no-cache, no-store");
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Expires", "-1" );
//        resp.setHeader("Accept","application/json");
//        resp.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        resp.setContentType("application/json");
        
        PrintWriter out = resp.getWriter();
        try {
            
         
        if (req.getHeader("Authorization").equals("12345")){
            
            out.write("{"
             + "\"id\": 270,"
                + "\"name\": \"Carlos Villegas\","
                + "\"username\": \"gole\","
                + "\"email\": \"gole@hotmail.com\","
                + "\"value\": \""+req.getParameter("data")+" response"+"\""
                + "}"
            );
            
            out.flush();
            out.close();               
        }else{
            out.write("{"+
                      "\"value\":\"error\""+
                      "}");
           
            
            out.flush();
            out.close();
        }
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            out.close();               
        }
    } 
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        processRequest(req,resp);
    }

   
    
     @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
