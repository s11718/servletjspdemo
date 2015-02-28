package com.example.servletjspdemo.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String imie = request.getParameter("imie");
		String nazwisko = request.getParameter("nazwisko");
		String email = request.getParameter("email");
		String Pemail = request.getParameter("Pemail");
		String pracodawca = request.getParameter("pracodawca");
		String skad = request.getParameter("skad");
		String zajecie = request.getParameter("zajecie");
		int miejsca = 5;
		Boolean Zemail;
		
		HttpSession session = request.getSession();
		ServletContext ctx = request.getServletContext();
		
		response.sendRedirect("form.jsp");
		
		
		session.setAttribute("imie", imie);
		session.setAttribute("nazwisko", nazwisko);
		session.setAttribute("email", email);
		session.setAttribute("Pemail", Pemail);
		session.setAttribute("pracodawca", pracodawca);
		session.setAttribute("skad", skad);
		session.setAttribute("zajecie", zajecie);
		
		if (session.getAttribute(email) == session.getAttribute(Pemail))
		{
			Zemail = true;
		}
		
		else
		{
			Zemail = false;
		}
		
		response.getWriter().println(imie);
		
		//if(name!=null && !name.equals(""))
		//{
		//	session.setAttribute("name", name);
		//	ctx.setAttribute("name", name);
		//}
		//response.getWriter().println("hello " + name + "!");
		//response.getWriter().println("hello from session" + session.getAttribute("name") + "!");
		//response.getWriter().println("hello from context" + ctx.getAttribute("name") + "!");
		//response.getWriter().println("Hello World!");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
