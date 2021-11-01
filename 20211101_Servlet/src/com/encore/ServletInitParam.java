package com.encore;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/***
 * 
 * 이 클래스는 web.xml 문서에서 등록되는 Servlet 클래스
 * 만약 이 서블릿 요청 시, 오류가 발새하면 web.xm 문서 확인
 *
 */
public class ServletInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletInitParam() {
        super();
    }
    
    // get 방식 요청 시, 자동 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = getInitParameter("id");
		String pwd = getInitParameter("pwd");
		System.out.println(id + " " + pwd);
	}

	// post 방식 요청 시, 자동 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
