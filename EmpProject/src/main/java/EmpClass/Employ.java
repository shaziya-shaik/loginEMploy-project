package EmpClass;

public class Employ {
	public	int Eid;
	public	String EName;
	public	String DOB;
	public	int YOJ;
	public	String Designation;
	public Employ() {
		super();
		Eid = Eid;
		EName = EName;
		DOB = DOB;
		YOJ = YOJ;
		Designation = Designation;
	}
	@Override
	public String toString() {
		return "Employ [Eid=" + Eid + ", EName=" + EName + ", DOB=" + DOB + ", YOJ=" + YOJ + ", Designation="
				+ Designation + "]";
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public int getYOJ() {
		return YOJ;
	}
	public void setYOJ(int yOJ) {
		YOJ = yOJ;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	

}
