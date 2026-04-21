package core;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;
import java.util.Collection;

public class PartTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Collection<Part> parts = request.getParts();
		System.out.println("요청받음");
		for(Part part : parts) {
			System.out.print("name : ");
			System.out.println(part.getName());
			System.out.println("[헤더 정보]");
			for(String headerName : part.getHeaderNames()) {
				System.out.print(headerName + " : ");
				System.out.println(part.getHeader(headerName));
			}
			System.out.print("size :");
			System.out.println(part.getSize());
			System.out.println("------------------------------");
		}
	}
}
