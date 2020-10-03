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
        BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
        Note newNote = new Note();
        String editLink = request.getParameter("edit");
        
        newNote.setTitle(reader.readLine());
        newNote.setContent(reader.readLine());
        reader.close();
        
        request.setAttribute("title", newNote.getTitle());
        request.setAttribute("content", newNote.getContent());
        
        if(editLink == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
        }
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
//        
        
        
    }
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,false)));
        Note newNote = new Note();
        newNote.setTitle(request.getParameter("editT"));
        newNote.setContent(request.getParameter("editC"));
        pw.println(newNote.getTitle());
        pw.println(newNote.getContent());
        pw.close();
        request.setAttribute("title", newNote.getContent());
        request.setAttribute("content", newNote.getContent());
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
        
        
        
    }
   
   
    

}
