package homework.nine.rbt;

public class Student {
	private int studentID;
	private int yearOfEnrolment;
	private String studentName;
	private String DOB;
	private String universityName;
	private String departmentCode;
	private String departmentName;
		
	/*
	public Student(int studentID, int yearOfEnrolment, String studentName, String dob, String universityName,
			String departmentCode, String departmentName) {
		super();
		this.studentID = studentID;
		this.yearOfEnrolment = yearOfEnrolment;
		this.studentName = studentName;
		this.DOB = dob;
		this.universityName = universityName;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
	}*/
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getYearOfEnrolment() {
		return yearOfEnrolment;
	}
	public void setYearOfEnrolment(int yearOfEnrolment) {
		this.yearOfEnrolment = yearOfEnrolment;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dob) {
		this.DOB = dob;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		String printOut = ("\n" +
				"Student ID: " + this.getStudentID() + "\n" +
				"Name and Surname: " + this.getStudentName() + "\n" +
				"Date of Birth: " + this.getDOB() + "\n" +
				"University: " + this.getUniversityName()+ "\n" +
				"Department: " + this.getDepartmentName()+ "\n" +
				"Department Code: " + this.getDepartmentCode() + "\n" +
				"Year of Enrolment: " + this.getYearOfEnrolment());
		return printOut;
	}
}
