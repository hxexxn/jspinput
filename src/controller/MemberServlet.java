package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;
import service.MemberDAO;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf8");
		
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.listMembers();
		
		
		PrintWriter out = response.getWriter();
	
		String data = "<html><body><center>";
		data += "<table broder=1><tr align='center' bgcolor='lightgreen'><b> "
				+ "<td>아이디</td> <td>비밀번호</td> <td>이름</td> <td>이메일</td> <td>가입일</td>"
				+ "<td></td>"
				+ "</b></tr>";
		
		for (int i = 0; i < list.size(); i++) {
			MemberVO vo = list.get(i);
			
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name = vo.getName();
			String email = vo.getEmail();
			Date joinDate = vo.getJoinDate();
			
			data += "<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name + "</td><td>" + email + "</td><td>" + joinDate + "</td>"
					+ "<td><a href=delete?abc=" + id + ">삭제하기</a></td></tr>";
		}
		
		data += ("</center></table></body></html>");
		
		out.print(data);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
