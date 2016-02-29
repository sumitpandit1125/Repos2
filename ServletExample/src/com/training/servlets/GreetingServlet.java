package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restaurant.daos.UserDAO;
import com.restaurant.entity.Users;




/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	Logger log = Logger.getLogger(this.getClass().toString());
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        log.info("===Constructor Called===");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		log.info("Vendor -Request Object :" + request.getClass().toString());
		log.info("Vendor -Response Object :" + response.getClass().toString());
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		String role = request.getParameter("role");
		String email = request.getParameter("email");
		
		int userId = Integer.parseInt(user);
		
		UserDAO usrDAO = new UserDAO();
		Users usr = new Users(userId,passWord,role);
		
		out.println("<h1 style = 'text-align:center'>Welcome to servlet programing</h1>");
		
		
		
		if(usrDAO.validateUser(usr)){
			out.println("Welcome :"+user );
			
		}
		
		else
		out.println("Invalid user");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
