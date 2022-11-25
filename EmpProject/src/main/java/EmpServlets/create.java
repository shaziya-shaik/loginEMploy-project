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
import projectDAO.EmpDao;

@WebServlet("/create")
public class create extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("num1"));
		PrintWriter out=response.getWriter();
		System.out.println(id);
		String EName=request.getParameter("str1");
		String DOB=request.getParameter("str2");
		int YOE=Integer.parseInt(request.getParameter("num2"));
		String Designation=request.getParameter("str3");
		EmpDao Dao=new EmpDao();
		Employ e=new Employ();
		
		
		e.Eid=id;
		e.EName=EName;
		e.DOB=DOB;
		e.YOJ=YOE;
		e.Designation=Designation;
		Dao.AddEmp(e);
		RequestDispatcher rd=request.getRequestDispatcher("EmpDisplay.jsp");
		rd.forward(request, response);
		//RequestDispatcher rd=request.getRequestDispatcher("EmpDao.java");
		//rd.forward(request, response);
	}

}
