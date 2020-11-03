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
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");
      // to read files
      BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
      String editNote = request.getParameter("edit");
      Note newNote = new Note();
      String titleRead = reader.readLine();
      String contentRead = reader.readLine();
      newNote.setTitle(titleRead);
      newNote.setContent(contentRead);
      reader.close();
      request.setAttribute("title", newNote.getTitle());
      request.setAttribute("content", newNote.getContent());
      
      if(editNote != null) {
          getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
      }
      
      else {
          getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
      } 
        
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      Note newNote = new Note();
      String newPath = getServletContext().getRealPath("/WEB-INF/note.txt");
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(newPath, false)));
      String title = request.getParameter("titleEdit");
      String content = request.getParameter("contentEdit");
      newNote.setTitle(title);
      newNote.setContent(content);
      pw.println(newNote.getTitle());
      pw.println(newNote.getContent());
      pw.close();
      
      request.setAttribute("title", newNote.getTitle());
      request.setAttribute("content", newNote.getContent());
      
      getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
      
        
    }
   
   
    

}
