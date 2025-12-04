package com.Calulator.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void destroy() {
		System.out.println("destroy called");
	}
	
	@Override
	public void init() throws ServletException{
		System.out.println("init called");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.set response content type 
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){
			double n1 =  Double.parseDouble(request.getParameter("num1")) ;
			double n2 =  Double.parseDouble(request.getParameter("num2")) ;
			String op = request.getParameter("action");
			
			double result=0;
			
			switch (op) {
			case "add":
				result=n1+n2;
				break;
			case "subtract":
				result=n1-n2;
				break;
			case "multiply":
				result=n1*n2;
				break;
			case "divide":
				result=n1/n2;
				break;
			default:
				System.out.println("invalid input");
				break;
			}
			
			pw.print("<h1> result : "+result+"</h1>");
			
			pw.close();
		}
	}

}
