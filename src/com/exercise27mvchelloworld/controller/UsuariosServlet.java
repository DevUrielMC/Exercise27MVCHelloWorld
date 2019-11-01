package com.exercise27mvchelloworld.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.exercise27mvchelloworld.model.UserModel;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/UsuariosServlet")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel Juanito =new UserModel();
		
		Juanito.setEdad((byte) 15);
		Juanito.setId(1);
		Juanito.setNombre("El Juanito");
		
		System.out.println(Juanito.toString());
		
		
			//response.getWriter().append("HelloWorld");
		/*
		 * String sid="";
		String sname="";
		String sage="";
		
		sid=request.getParameter("txtId");
		sname=request.getParameter("txtName");
		sage=request.getParameter("txtAge");
		
		response.getWriter().append(" The id input is: "+sid);
		response.getWriter().append(" The name input is: "+sname);
		response.getWriter().append(" The age input is: "+sage);
		*/
		
		
	}

}
