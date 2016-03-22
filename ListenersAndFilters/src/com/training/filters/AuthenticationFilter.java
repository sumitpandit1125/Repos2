package com.training.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("pre process by Authentication filter");
		
		HttpServletRequest request = (HttpServletRequest)req; 
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		RequestDispatcher dispatcher;
		
		System.out.println("post process by Authentication filter");
		String role = (String) request.getServletContext().getAttribute("role");	

		System.out.println("Inside Filter"+role);
		if(role.equals("admin")){
			
			dispatcher = request.getRequestDispatcher("admin.jsp");
		} 
		else{
			dispatcher = request.getRequestDispatcher("chef.jsp");
		}
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
