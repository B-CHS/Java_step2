package chapter06;

public class Student {
	// 필드
	int StudentID;
	String studentName;
	int grade;
	String address;
	
	
	//free compile
	//오버로딩 된 생성자가 있을 시 디폴트를 사용하기 위해서는 명시한다(생략불가능)
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 오버로딩
	public Student(String studentName, String address) {
		this.studentName=studentName;
		this.address=address;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
		
	}
	

}
