package com.training.tags;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ForEachTag extends TagSupport {
	
	String name;
		
	public void setName(String name) {
		this.name = name;
	}

	public ForEachTag() {
		super();
		
	}

	@Override
	public int doStartTag() throws JspException {
		
		try{
			JspWriter out = pageContext.getOut();
			ArrayList<Object> list = (ArrayList<Object>) pageContext.getAttribute("name");
			if(list == null)
				out.println("Nothing to print");
			else{
				for(Object obj:list){
					out.println("<br>" + obj);
					
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return Tag.SKIP_PAGE;
	}
	 
	

}
