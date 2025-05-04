package pack1;

public class BGradeEmployeeSalaryCalculation implements SalaryCalculation {

	@Override
	public double getAllowance(double basic) {

		return basic * 0.25;
	}

	@Override
	public double getDeduction(double basic) {
		return basic * 0.16;
	}

	@Override
	public double getNetSalary(double basic) {

		return basic + this.getAllowance(basic) - this.getDeduction(basic);
	}

}
