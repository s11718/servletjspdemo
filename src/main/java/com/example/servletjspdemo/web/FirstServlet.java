package com.example.servletjspdemo.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.servletjspdemo.domain.Person;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() {
        super();
    }


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ServletContext ctx = request.getServletContext();
		
		String imie = request.getParameter("imie");
		String nazwisko = request.getParameter("nazwisko");
		String email = request.getParameter("email");
		String Pemail = request.getParameter("Pemail");
		String pracodawca = request.getParameter("pracodawca");
		String skad = request.getParameter("skad");
		String skad2 = request.getParameter("skad2");
		String zajecie = request.getParameter("zajecie");
		int miejsca = 5;

		
		if ( miejsca <= 0){
			response.sendRedirect("brakMiejsc.jsp");
		}
		
		
		if(imie!=null && !imie.equals("") && nazwisko!=null && !nazwisko.equals("")&& email!=null && !email.equals("")&& Pemail!=null && !Pemail.equals("")&& pracodawca!=null && !pracodawca.equals("")&& skad!=null && !skad.equals("")&&  zajecie!=null && !zajecie.equals("") ){
		session.setAttribute("imie", imie);
		session.setAttribute("nazwisko", nazwisko);
		session.setAttribute("email", email);
		session.setAttribute("Pemail", Pemail);
		session.setAttribute("pracodawca", pracodawca);
		session.setAttribute("skad", skad);
		session.setAttribute("skad2", skad2);
		session.setAttribute("zajecie", zajecie);
		
		}
		
		if (email != Pemail)
		{
			response.sendRedirect("zlyMail.jsp");
			
		}
		
		if (session.getAttribute("imie") == null){
		response.sendRedirect("form.jsp");
		}
		
		
		
		
		miejsca--;
		response.sendRedirect("jestMiejsce.jsp");
		
		
		response.getWriter().println(miejsca);
		response.getWriter().println(session.getAttribute("imie"));
		response.getWriter().println(session.getAttribute("nazwisko"));
		response.getWriter().println(session.getAttribute("email"));
		response.getWriter().println(session.getAttribute("Pemail"));
		response.getWriter().println(session.getAttribute("pracodawca"));
		response.getWriter().println(session.getAttribute("skad"));
		response.getWriter().println(session.getAttribute("skad2"));
		response.getWriter().println(session.getAttribute("zajecie"));
		
	
	}
		


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
