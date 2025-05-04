package com.training.file.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.training.file.model.Employee;

public class EmployeeFileReaderClient {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("Employee.txt");
			ois = new ObjectInputStream(fis);

			Object object = ois.readObject();
			if (object instanceof Employee) {
				Employee emp = (Employee) object;

				System.out.println(emp);
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
