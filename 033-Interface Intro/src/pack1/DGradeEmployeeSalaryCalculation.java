package pack1;

public class DGradeEmployeeSalaryCalculation implements SalaryCalculation {

	@Override
	public double getAllowance(double basic) {

		return basic * 0.33;
	}

	@Override
	public double getDeduction(double basic) {

		return basic * 0.23;
	}

	@Override
	public double getNetSalary(double basic) {

		return basic + this.getAllowance(basic) - this.getDeduction(basic);
	}

}
