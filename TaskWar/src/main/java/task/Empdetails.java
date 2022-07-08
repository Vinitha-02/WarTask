package task;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import taskwar.GetData;

public class Empdetails extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("application/json");
		PrintWriter out = res.getWriter();
		try {

			int EmpCode = Integer.parseInt(req.getParameter("EmpCode"));

			out.println(GetData.validate(EmpCode));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
