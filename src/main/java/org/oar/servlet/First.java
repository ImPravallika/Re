package org.oar.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.oar.app.Note;
import org.oar.app.helper.Factory;

public class First extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try
		{
		String title = req.getParameter("title");	
		String content =req.getParameter("content");
		Note note = new Note(title,new Date(), content);
		Session s = Factory.getFactory().openSession();
		Transaction t = s.beginTransaction();
		s.save(note);
		t.commit();
		PrintWriter out =resp.getWriter();
		out.println("<h1>Note added sucessfully</h1>");
		}
		catch(Exception e)
		{
			
		}
	}

}
