package springProject.FirstProject;

public class Student {
  private int studentId;
  private String studentName;
  private String address;
  
  
public Student() {
	super();
}
public Student(int studentId, String name, String address) {
	super();
	this.studentId = studentId;
	this.studentName = name;
	this.address = address;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return studentName;
}
public void setName(String name) {
	this.studentName = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + studentName + ", address=" + address + "]";
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
  

  
}
