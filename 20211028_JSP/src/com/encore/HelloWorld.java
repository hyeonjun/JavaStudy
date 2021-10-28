package com.encore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "첫 서블릿", urlPatterns = { "/hello" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorld() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
/*		System.out.println(request.getParameter("n1")+"get");
		System.out.println(request.getParameter("n2")+"get");
		
		response.setContentType("text/html"); // 데이터 내보냄. setContentType : 환경설정
		PrintWriter writer = response.getWriter();
		writer.print("<!doctype html>");
		writer.print("<html><head><title>Get</title></head>");
		writer.print("<body>");
		writer.print(request.getParameter("n1")+" get <br />");
		writer.print(request.getParameter("n2")+" get");
		writer.print("</body></html>");
		writer.close(); */
		new ExcelMaker();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
/*		System.out.println(request.getParameter("n1")+"post");
		System.out.println(request.getParameter("n2")+"post"); */
	}

}
