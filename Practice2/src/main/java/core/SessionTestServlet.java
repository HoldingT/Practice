package core;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class SessionTestServlet
 */
public class SessionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String command = request.getParameter("comn");
		HttpSession session = request.getSession();
		String msg="";
		long time = session.getCreationTime();
		String id = session.getId();
		if(command.equals("view")) {
			if(session.isNew()) {
				msg="세션 객체 생성 : ";
			}else {
				msg = "세션 객체 추출 : ";
			}
			msg += "<br>id : " + id + "<br>time : " + new Date(time);
		}else if (command.equals("delete")) {
			session.invalidate();
			msg = id + "을 id로 갖는 객체 삭제";
		}else {
			msg = "요청시 query 문자열로 comn=view 또는 comn=delete를 " + "전달해주시오";
		}
		out.print("<h2>" + msg + "</h2>");
		out.close();
	}
}
