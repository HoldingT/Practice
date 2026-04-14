package core;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LottoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int answer = (int)(Math.random() * 10) + 1;
		int input = Integer.parseInt(request.getParameter("guess"));
		String msg = "";
		if (answer == input) {
			msg = "<h3>축하합니다..당첨입니다!</h3>";
		} else {
			msg = "<h3>다음 기회를....</h3><a href='"+request.getHeader("referer") + "'>재도전</a>";
		}
		response.setContentType("text/html; charset=utf=8");
		PrintWriter out = response.getWriter();
		out.println();
		out.close();
	}

}
