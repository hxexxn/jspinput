package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;
import service.MemberDAO;


@WebServlet("/search")
public class MemberSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("user_id");
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		
		MemberDAO dao = new MemberDAO();
		MemberVO info = dao.userSearch(id);
		
		
		if (info != null) {
			
			String resultId = info.getId();
			String resultPwd = info.getPwd();
			String resultName = info.getName();
			String resultEmail = info.getEmail();
			Date resultJoinDate = info.getJoinDate();
			
			String data = "<html><body><center>";
			data += "<b>" + resultName + "의 정보 </b><br><br>" + resultId + "　　" + resultPwd
					+ "　　" + resultName + "　　" + resultEmail + "　　" + resultJoinDate
					+ "</center></body></html>";			
			out.print(data);
		}else{
			
		} 
		
	}
		

}
