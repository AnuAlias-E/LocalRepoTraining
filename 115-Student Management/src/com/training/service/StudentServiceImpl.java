package com.training.service;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Student;

public class StudentServiceImpl implements StudentService {
	List<Student> allStudents;

	private StudentServiceImpl() {
		super();
		this.allStudents = new LinkedList<Student>();
	}

	static StudentServiceImpl instance = null;

	@Override
	public void addStudent(Student student) throws Exception {

		if (student.getRollNumber() < 0) {
			throw new Exception("Roll Number must be positive");
		}
		if (student.getName() == null || student.getName().length() == 0) {
			throw new Exception("Name must not be empty");
		}
		if (student.getGender() != 'F' && student.getGender() != 'M') {
			throw new Exception("Gender must be  M or F");
		}
		if (student.getMark1() < 0 || student.getMark1() >= 100) {
			throw new Exception("Mark1 between 0 and 100");
		}
		if (student.getMark2() < 0 || student.getMark2() >= 100) {
			throw new Exception("Mark2 between 0 and 100");
		}
		this.allStudents.add(student);

	}

	@Override
	public Student searchStudent(int rollNumber) {
		Student student = new Student();
		student.setRollNumber(rollNumber);
		int r = allStudents.indexOf(student);
		if (r >= 0) {
			Student result = allStudents.get(r);
			return result;
		} else {
			return null;
		}
	}

	@Override
	public void updateStudent(Student student) throws Exception {
		if (student.getRollNumber() < 0) {
			throw new Exception("Roll Number must be positive");
		}
		if (student.getName() == null || student.getName().length() == 0) {
			throw new Exception("Name must not be empty");
		}
		if (student.getGender() != 'F' && student.getGender() != 'M') {
			throw new Exception("Gender must be  M or F");
		}
		if (student.getMark1() < 0 || student.getMark1() >= 100) {
			throw new Exception("Mark1 between 0 and 100");
		}
		if (student.getMark2() < 0 || student.getMark2() >= 100) {
			throw new Exception("Mark2 between 0 and 100");
		}
		int r = allStudents.indexOf(student);
		if (r >= 0) {
			allStudents.set(r, student);
		} else {
			System.out.println("\t\t Student Not Found !!!");
		}
	}

	@Override
	public List<Student> getAllStudents() {

		return allStudents;
	}

	@Override
	public void deleteStudent(int rollNumber) {
		Student student = new Student();
		student.setRollNumber(rollNumber);
		// allStudents.remove(student);
		int r = allStudents.indexOf(student);
		if (r >= 0) {
			allStudents.remove(student);
		} else {
			System.out.println("\t\t Student Not Found !!!");
		}

	}

	public static StudentService getInstance() {
		if (instance == null) {
			instance = new StudentServiceImpl();
		}
		return instance;
	}

}
