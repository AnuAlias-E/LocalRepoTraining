package pack1;

public class CGradeEmployeeSalaryCalculation implements SalaryCalculation {

	@Override
	public double getAllowance(double basic) {

		return basic * 0.28;
	}

	@Override
	public double getDeduction(double basic) {

		return basic * 0.1;
	}

	@Override
	public double getNetSalary(double basic) {

		return basic + this.getAllowance(basic) - this.getDeduction(basic);
	}

}
