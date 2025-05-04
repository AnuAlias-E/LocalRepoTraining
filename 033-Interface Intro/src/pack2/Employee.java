package pack2;

import pack1.AGradeEmployeeSalaryCalculation;
import pack1.BGradeEmployeeSalaryCalculation;
import pack1.CGradeEmployeeSalaryCalculation;
import pack1.DGradeEmployeeSalaryCalculation;
import pack1.SalaryCalculation;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private char grade;// A,B,C,D
	private SalaryCalculation sc;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double basicSalary, char grade) {
		super();
		setId(id);
		setName(name);
		setBasicSalary(basicSalary);
		setGrade(grade);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {

		this.grade = grade;
		if (this.grade == 'A') {
			sc = new AGradeEmployeeSalaryCalculation();
		}
		if (this.grade == 'B') {
			sc = new BGradeEmployeeSalaryCalculation();
		}
		if (this.grade == 'C') {
			sc = new CGradeEmployeeSalaryCalculation();
		}
		if (this.grade == 'D') {
			sc = new DGradeEmployeeSalaryCalculation();
		}
	}

	public double computeAllowance() {
		return sc.getAllowance(this.basicSalary);
	}

	public double computeTax() {
		return sc.getDeduction(this.basicSalary);
	}

	public double computeNetSalary() {
		return sc.getNetSalary(this.basicSalary);
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getName()=" + getName() + ", getBasicSalary()=" + getBasicSalary()
				+ ", getGrade()=" + getGrade() + ", computeAllowance()=" + computeAllowance() + ", computeTax()="
				+ computeTax() + ", computeNetSalary()=" + computeNetSalary() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
