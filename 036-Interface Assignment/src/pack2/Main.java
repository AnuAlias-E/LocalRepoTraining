package pack2;

import pack1.CollegeStudent;
import pack1.SchoolStudent;
import pack1.Student;
import pack1.UniversityStudent;

public class Main {
	public static void main(String[] args) {
		Student student;
		student = new SchoolStudent();
		student.enroll();
		student.takeExam();
		student.leave();
		System.out.println("-----------------------------------");
		student = new CollegeStudent();
		student.enroll();
		student.takeExam();
		student.leave();
		System.out.println("-----------------------------------");
		student = new UniversityStudent();
		student.enroll();
		student.takeExam();
		student.leave();
	}
}
