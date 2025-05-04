package pack3;

import pack1.AGradeEmployeeSalaryCalculation;
import pack1.BGradeEmployeeSalaryCalculation;
import pack1.CGradeEmployeeSalaryCalculation;
import pack1.DGradeEmployeeSalaryCalculation;
import pack1.SalaryCalculation;

public class Main1 {
	public static void main(String[] args) {
		SalaryCalculation calculation;
		calculation = new AGradeEmployeeSalaryCalculation();
		System.out.println("AGrade Employee Salary Details");
		System.out.println(calculation.getAllowance(2000.00));
		System.out.println(calculation.getDeduction(2000.00));
		System.out.println(calculation.getNetSalary(2000.00));
		System.out.println("--------------------------------");
		System.out.println("BGrade Employee Salary Details");
		calculation = new BGradeEmployeeSalaryCalculation();
		System.out.println(calculation.getAllowance(2000.00));
		System.out.println(calculation.getDeduction(2000.00));
		System.out.println(calculation.getNetSalary(2000.00));
		System.out.println("--------------------------------");
		System.out.println("CGrade Employee Salary Details");
		calculation = new CGradeEmployeeSalaryCalculation();
		System.out.println(calculation.getAllowance(2000.00));
		System.out.println(calculation.getDeduction(2000.00));
		System.out.println(calculation.getNetSalary(2000.00));
		System.out.println("--------------------------------");
		System.out.println("DGrade Employee Salary Details");
		calculation = new DGradeEmployeeSalaryCalculation();
		System.out.println(calculation.getAllowance(2000.00));
		System.out.println(calculation.getDeduction(2000.00));
		System.out.println(calculation.getNetSalary(2000.00));
	}
}
