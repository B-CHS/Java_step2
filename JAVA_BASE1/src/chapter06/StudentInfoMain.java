package chapter06;

import java.util.Scanner;

public class StudentInfoMain {

	public static void main(String[] args) {

		StudentInfo studentKim = new StudentInfo();
		Scanner scan = new Scanner(System.in);
		studentKim.setStudentName("홍길동");
		studentKim.StudentID = scan.nextInt();
		studentKim.grade = scan.nextInt();
		studentKim.address = scan.nextLine();
		studentKim.getStudentName();

	}

}
