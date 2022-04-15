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

@WebServlet("/delete")
public class MemberDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf8");
		request.setCharacterEncoding("utf-8");
		
		String delId = request.getParameter("abc");
		PrintWriter out = response.getWriter();
		
		MemberDAO dao = new MemberDAO();
		dao.userDelete(delId);
		
		String result = "회원 정보 삭제 완료";
		out.print(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf8");
//		request.setCharacterEncoding("utf-8");
//		
//		String delId = request.getParameter("user_ID");
//		PrintWriter out = response.getWriter();
//		
//		MemberDAO dao = new MemberDAO();
//		dao.userDelete(delId);
//		
//		String result = "회원 정보 삭제 완료";
//		out.print(result);
		
	}

}
