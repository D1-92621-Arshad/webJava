package com.calculator.pages;

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
		
//		double n1 =  Double.parseDouble(request.getParameter("num1")) ;
//		double n2 =  Double.parseDouble(request.getParameter("num2")) ;
//		String op = request.getParameter("action");
//		
//		double result=0;
//		
//		switch (op) {
//		case "add":
//			result=n1+n2;
//			break;
//		case "subtract":
//			result=n1-n2;
//			break;
//		case "multiply":
//			result=n1*n2;
//			break;
//		case "divide":
//			result=n1/n2;
//			break;
//		default:
//			System.out.println("invalid input");
//			break;
//			
//			
//			
//		
		
//		1.set response content type 
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
			
			CalculatorPOJO c = new CalculatorPOJO(n1, n2, op, result);
			
			pw.print("from 1st page ....");
			
			pw.flush();
			
			request.setAttribute("CalcObj", c);
			
//			request.getRequestDispatcher("display").forward(request, response);
			request.getRequestDispatcher("display").include(request, response);
			
//			pw.print("<h1> result : "+result+"</h1>");
//			
//			pw.close();
			System.out.println("control come back");
		}
//		//pack the logic in carry bag with name and value 
//		request.setAttribute("result", result);
//		//give that bag to ecat man officially placing the order named result,jsp then forwording it 
//		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
