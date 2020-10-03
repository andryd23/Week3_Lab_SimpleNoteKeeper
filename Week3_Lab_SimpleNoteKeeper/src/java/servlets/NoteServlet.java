/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 832465
 */
@WebServlet(name = "NoteServlet", urlPatterns = {"/NoteServlet"})
public class NoteServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");
      // to read files
      BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
      
      String title = request.getParameter("title");
      request.setAttribute("titleEdit", title);
      String content = request.getParameter("content");
      request.setAttribute("contentEdit", content);
      Note noteMain = new Note();
      noteMain.setTitle(title);
      noteMain.setContent(content);
      request.setAttribute("title", noteMain.getTitle());
      request.setAttribute("content", noteMain.getContent());
      
      


              
        
        
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
      
        
    }
   
   
    

}
