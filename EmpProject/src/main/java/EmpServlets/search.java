package EmpServlets;

import java.io.IOException;
import java.io.PrintWriter;

import EmpClass.Employ;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import projectDAO.EmpDao;

@WebServlet("/search")
public class search extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		HttpSession session=request.getSession();
		session.setAttribute("id", id);
		
		EmpDao dao=new EmpDao();
		Employ e=dao.getEmp(id);
		if(dao.getEmp(id)!=null) {
			request.setAttribute("e",e);
			RequestDispatcher rd=request.getRequestDispatcher("EmpSearch.jsp");
			rd.forward(request, response);
		}
		else {
			PrintWriter out=response.getWriter();
			out.println("Given EmployId is not in there");
		}
	}

}
