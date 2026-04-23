package core;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LottoServletLimit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("lottocnt") == null) {
			session.setAttribute("lottocnt", new int[1]);
		}
		int[] count = (int[]) session.getAttribute("lottocnt");
		String msg = "";
		if (++count[0] > 3) {
			msg = "<h3>더이상 응모할 수 없습니다.</h3>"
					+ "<h3>브라우저를 재시작하여 응모하세요.</h3>";
		} else {
			int answer = (int)(Math.random() * 10) + 1;
			int input = Integer.parseInt(request.getParameter("guess"));
			if (answer == input) {
				msg = "<h3>축하합니다..당첨입니다!</h3>";
				count[0] = 4;
			} else {
				msg = "<h3>다음 기회를....</h3><a href='"+request.getHeader("referer") + "'>재도전</a>";
			}
		}
		response.setContentType("text/html; charset=utf=8");
		PrintWriter out = response.getWriter();
		out.println();
		out.close();
	}
}
