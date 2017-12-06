package assignment3_2;

public class Director extends Manager {

	private static double benefit;
	private String department;
	private final double LOW_TAX = 0.1;
	private final double MID_TAX = 0.2;
	private final double HIGH_TAX = 0.4;

	public Director(String ID, String name, double salary, String degree, String department) {
		super(ID, name, salary, degree);
		this.department = department;
	}

	@Override
	public double getNetSalary() {
		double salary1;
		if (getDegree() == "bsc") {
			salary1 = getSalary() * 1.1;
		} else if (getDegree() == "msc") {
			salary1 = getSalary() * 1.2;
		} else if (getDegree() == "phd") {
			salary1 = getSalary() * 1.35;
		} else
			salary1 = getSalary();

		if (salary1 < 30000) {
			return salary1 - (getSalary() * LOW_TAX);
		} else if (salary1 >= 30000) {
			return salary1 - (getSalary() * MID_TAX);
		} else if (salary1 > 50000) {
			return salary1 - (getSalary() * HIGH_TAX);
		} else
			return salary1;
	}

	public static double getBenefit() {
		return benefit;
	}

	public static void setBenefit(double benefit) {
		Director.benefit = benefit;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "\nName: " + getName() + "\nID: " + getID() + "\nSalary: " + getSalary() + "\nNet Salary:"
				+ getNetSalary() + "\nDegree: " + getDegree() + "\nDepartment: " + department;
	}

}