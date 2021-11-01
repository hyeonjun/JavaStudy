package com.encore;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logcheck")
public class LogCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogCheck() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		System.out.println("doPost()로부터 호출 당함");
		System.out.println("doGet() => "+request.getParameter("ID"));
		System.out.println("doGet() => "+request.getParameter("PWD"));
		
		String admin_id = "admin";
		String admin_pwd = "1234";
		String admin_name = "관리자";
		
		HttpSession session = request.getSession();
		
		if(admin_id.equals(request.getParameter("ID")) && admin_pwd.equals(request.getParameter("PWD"))){
			session.setAttribute("user", admin_name);
			response.sendRedirect("main.jsp");
		} else{
			response.sendRedirect("login.jsp");
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		System.out.println("doPost() 메서드 호출");
		System.out.println("doPost() => "+request.getParameter("ID"));
		System.out.println("doPost() => "+request.getParameter("PWD"));
		doGet(request, response);
	}

}
