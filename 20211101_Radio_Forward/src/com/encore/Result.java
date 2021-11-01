package com.encore;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Result() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String name = request.getParameter("name");
		String bloodType = request.getParameter("bloodtype");
		if(name != null && bloodType != null) {
			session.setAttribute("name", name);
			session.setAttribute("bloodtype", bloodType);
			response.sendRedirect(bloodType+".jsp");
		} else {
			response.sendRedirect("bloodtype.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
