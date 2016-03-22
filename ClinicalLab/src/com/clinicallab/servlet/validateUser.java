package com.clinicallab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clinicallab.dao.UsersDAO;
import com.clinicallab.entity.Role;
import com.clinicallab.entity.Users;

/**
 * Servlet implementation class validateUser
 */
public class validateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String role = request.getParameter("role");
		String labCode = request.getParameter("labCode");
		
		Users usr = new Users(100, userName, passWord, Role.valueOf(role), "ACTIVE", labCode);
		
		UsersDAO usrDAO = new UsersDAO();
		if(usrDAO.validate(usr)){
			
			RequestDispatcher rd = request.getRequestDispatcher("Receptionist.jsp");
			rd.forward(request, response);
		}
		
		else{
			
			RequestDispatcher rd = request.getRequestDispatcher("Invalid.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
