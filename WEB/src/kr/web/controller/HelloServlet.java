package kr.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import kr.web.util.MyUtil;

@WebServlet("/hs.do")
public class HelloServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// 1~100까지의 합 구하기
		MyUtil myutil = new MyUtil();
		int result = myutil.sum(100);
		
		// 요청한 client에게 응답하기.
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + result + "</h1></body>");
		out.println("</html>");
		out.close();
	}
}
