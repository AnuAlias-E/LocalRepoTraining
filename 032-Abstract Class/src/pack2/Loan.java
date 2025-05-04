package pack2;

public abstract class Loan {
private int loanAmount;
private int tenure;

public double getInterestAmount() {
	return this.loanAmount*this.tenure*this.getInterestRate();
}


abstract int getInterestRate();

public double computeTotalPayable() {
	return this.loanAmount+this.getInterestAmount();
}
public double getEMI() {
	return this.computeTotalPayable()/this.tenure;
	
}
}
