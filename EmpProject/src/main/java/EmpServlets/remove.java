package EmpServlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import projectDAO.EmpDao;

import java.io.IOException;
import java.io.PrintWriter;

import EmpClass.Employ;


@WebServlet("/remove")
public class remove extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		HttpSession session=request.getSession();
		session.setAttribute("id", id);
		
		EmpDao dao=new EmpDao();
		if(dao.remEmp(id)) {
			RequestDispatcher rd=request.getRequestDispatcher("EmpDisplay.jsp");
			rd.forward(request, response);
		}
		else {
			PrintWriter out=response.getWriter();
			out.println("Given EmployId is not in there");
		}
	}

}
