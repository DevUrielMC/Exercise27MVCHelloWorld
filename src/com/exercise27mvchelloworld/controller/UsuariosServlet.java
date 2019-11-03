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
		
		//UserModel myUser =new UserModel(sid,sname,sage);
		/*
		myUser.setEdad((byte) 15);
		myUser.setId(1);
		myUser.setNombre("El Juanito");
		
		System.out.println(myUser.toString());
		*/
		
			//response.getWriter().append("HelloWorld");
		
		String sid="";
		int iid=0;
		String sname="";
		String sage="";
		short shage=0;

		sid = request.getParameter("txtId");
		iid = Integer.parseInt(sid);
		sname = request.getParameter("txtName");
		sage = request.getParameter("txtAge");
		shage = Short.parseShort(sage);

		response.getWriter().append(" The id input is: "+sid);
		response.getWriter().append(" The name input is: "+sname);
		response.getWriter().append(" The age input is: "+sage);
		UserModel myUser1 = new UserModel(iid, sname, shage);
		UserModel myUser2 = new UserModel();
		myUser2.setId(iid);
		myUser2.setName(sname);
		myUser2.setAge(shage);

		response.getWriter().append(" The id input myUser1 is: "+myUser1.getId());
		response.getWriter().append(" The name input myUser1 is: "+myUser1.getName());
		response.getWriter().append(" The age input myUser1 is: "+myUser1.getAge());
	


		
		
		
	}

}
