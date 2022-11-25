package projectDAO;

import java.sql.*;

import EmpClass.Employ;
public class EmpDao {

		
		String url="jdbc:mysql://localhost:3306/project";
		String username="root";
		String password="shaziya@oct2002";
		
		public Employ AddEmp(Employ e) {
			String Query="insert into employ_details(Eid,EName,DOJ,YOE,Designation) values(?,?,?,?,?)";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,password);
				PreparedStatement st=con.prepareStatement(Query);
				st.setInt(1,e.Eid);
				st.setString(2,e.EName);
				st.setString(3,e.DOB);
				st.setInt(4,e.YOJ);
				st.setString(5,e.Designation);
				int count=st.executeUpdate();
				System.out.println(count+"effected");
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return e;
		}
		
		public Employ getEmp(int id) {
			
			
			String Query="Select * from employ_details where Eid="+id+";";
			Employ e=new Employ();
			e.Eid=id;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,password);
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(Query);
				if(rs.next()) {
				 int Eid=rs.getInt(1);
				String EName=rs.getString(2);
				String DOJ=rs.getString(3);
				int YOE=rs.getInt(4);
				String Designation=rs.getString(5);
				e.Eid=Eid;
				e.EName=EName;
				e.DOB=DOJ;
				e.YOJ=YOE;
				e.Designation=Designation;
				return  e;
				}
				else {
					System.out.println("not found");
					
				}
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return null;
			
			
		}
		
		public boolean remEmp(int id) {
			Employ e1= new Employ();
			e1.Eid=id;
			String Query="Delete  from employ_details where Eid="+id;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,password);
				PreparedStatement st=con.prepareStatement(Query);
				int count=st.executeUpdate();
				System.out.println(count+"row/s are effected");
				return true;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
		}

}
