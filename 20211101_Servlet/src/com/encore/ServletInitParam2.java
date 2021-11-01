package com.encore;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "/initParam2" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "홍길동"), 
				@WebInitParam(name = "phone", value = "01012341234")
		})
public class ServletInitParam2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletInitParam2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = getInitParameter("name");
		String phone = getInitParameter("phone");
		
		System.out.println(name + " " + phone);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
