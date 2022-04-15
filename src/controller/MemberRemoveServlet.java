package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberDAO;

@WebServlet("/removeUser")
public class MemberRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("user_ID");
		System.out.println(id);
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		
		MemberDAO dao = new MemberDAO();
		dao.userDelete(id);
		
		String result = "회원 정보가 성공적으로 삭제되었습니다.";
		out.print(result);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
