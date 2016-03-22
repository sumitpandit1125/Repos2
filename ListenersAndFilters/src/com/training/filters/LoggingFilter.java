package com.training.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.util.Date;
//import java.util.logging.*;

/**
 * Servlet Filter implementation class LoggingFilter
 */
public class LoggingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoggingFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("pre process by logging filter");
			
		// pass the request along the filter chain
		/*
		HttpServletRequest req = (HttpServletRequest)request;
		String reqHost = req.getRemoteHost();
		String url = req.getRequestURI();
		StringBuffer buffer = new StringBuffer("One Request");
		
		buffer.append("from" + reqHost + " for " + url + " at " + new Date() + "\n");
		System.out.println(buffer);
		
		*/
		
		
		chain.doFilter(request, response);
		System.out.println("post process by logging filter");
		
		
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
