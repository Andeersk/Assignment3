package assignment3_2;

public class Intern extends Employee {

	private double GPA;
	private double benefit;

	public Intern(String ID, String name, double salary, double GPA, double benefit) {
		super(ID, name, salary);
		this.GPA = GPA;
		this.benefit = benefit;

		if (GPA < 6) {
			salary = 0;
		} else if (GPA > 5) {
			salary = getSalary();
		} else {
			salary = getSalary() * benefit;
		}
	}

	@Override
	public double getNetSalary() {
		double salary = getNetSalary();
		return salary;

	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}
}
