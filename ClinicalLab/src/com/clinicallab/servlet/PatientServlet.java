package com.clinicallab.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import com.clinicallab.dao.PatientDAO;
import com.clinicallab.entity.Patient;



/**
 * Servlet implementation class PatientServlet
 */
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = 0;
		try {
			id = Integer.parseInt(request.getParameter("patCode"));
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		PatientDAO patDAO = new PatientDAO();
		Patient pat = patDAO.find(id);
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		JSONObject obj = new JSONObject();
		if(pat!=null){
			obj.put("name", pat.getName());
		    obj.put("mobile", pat.getMobile().toString());
		    obj.put("dOB", pat.getDOB().toString());
		}
		else{
			obj.put("name", "");
		    obj.put("mobile", "");
		    obj.put("dOB", "");
		}
	      
	      String output = obj.toString();

		
		out.println(output);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
