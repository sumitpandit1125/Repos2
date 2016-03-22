package com.training.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
public class MyContextListener implements ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
    	System.out.println("Context - Destroyed======");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent event)  { 
         System.out.println("Context - Intiatialized======");
         String url = event.getServletContext().getInitParameter("url");
         String className = event.getServletContext().getInitParameter("className");
         String userName = event.getServletContext().getInitParameter("userName");
         String passWord = event.getServletContext().getInitParameter("passWord");
         Connection con = null;
 		
 		try {
 			
 						
 			Class.forName(className);
 			
 			con = DriverManager.getConnection(url,userName,passWord);
 			
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 		
 		}
         event.getServletContext().setAttribute("Connection", con);
    }

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Attribute Added : " + event.getServletContext().getAttributeNames());
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Attribute Removed : " + event.getServletContext().getAttributeNames());
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("Attribute Replaced : " + event.getServletContext().getAttributeNames());
		
	}
	
}
