package com.training.file.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.training.file.model.Employee;

public class EmployeeFileWriterClient {
	
public static void main(String[] args)   {
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	try {
		
		Employee employee = new Employee(101, "Anu", "anu", "passanu@1121");
		 fos= new FileOutputStream("Employee.txt");
		 oos = new ObjectOutputStream(fos);
	employee.readExternal(null);
		 oos.writeObject(employee);
		 oos.flush();
		 
		 
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {

		
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
}
