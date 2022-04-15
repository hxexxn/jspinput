package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;
import service.MemberDAO;

@WebServlet("/registUser")
public class MemberRegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("input_ID");
		String pwd = request.getParameter("input_PW");
		String name = request.getParameter("input_Name");
		String email = request.getParameter("input_Email");
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		
		MemberDAO dao = new MemberDAO();
		dao.userInsert(id, pwd, name, email);
		
		String good = "<h1><center>회원가입이 완료되었습니다.</center></h1>";
		out.print(good);
	
		
	}

}
