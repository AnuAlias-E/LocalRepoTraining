package pack3;

import pack2.Employee;

public class Main2 {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Kiran");
		emp.setBasicSalary(1000.00);
		emp.setGrade('C');
		
		System.out.println(emp.computeAllowance());
		System.out.println(emp.computeTax());
		System.out.println(emp.computeNetSalary());				
		System.out.println("-------------------------");
		
		Employee emp1 = new Employee(102, "Nirmala", 2000, 'C');
		System.out.println(emp1.computeAllowance());
		System.out.println(emp1.computeTax());
		System.out.println(emp1.computeNetSalary());				
		System.out.println("-------------------------");
		
		
	}
}
