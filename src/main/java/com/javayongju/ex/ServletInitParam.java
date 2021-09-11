package com.javayongju.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInitParam
 */
@WebServlet("/ServletInitParam")
public class ServletInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doget");
	      
	      String id = getInitParameter("id");
	      String pw = getInitParameter("pw");
	      String path = getInitParameter("path");
	      
	      response.setContentType("text/html; charset=EUC-KR");
	      
	      PrintWriter writer = response.getWriter();
	      
		
		//이 부분은 한글이 보여짐
	      writer.println("<html><head></head><body>");
	      writer.println("¾ÆÀÌµð:"+id+"</br>");
	      writer.println("ºñ¹Ð¹øÈ£:"+pw+"</br>");
	      writer.println("°æ·Î:"+path+"</br>");
	      writer.println("</body></html>");
	      
	      writer.close();
	      
	   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
