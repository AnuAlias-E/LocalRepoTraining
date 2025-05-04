package pack1;

public class AGradeEmployeeSalaryCalculation implements SalaryCalculation {

	@Override
	public double getAllowance(double basic) {

		return basic * 0.40;
	}

	@Override
	public double getDeduction(double basic) {

		return basic * 0.24;
	}

	@Override
	public double getNetSalary(double basic) {

		return basic + this.getAllowance(basic) - this.getDeduction(basic);
	}

}
