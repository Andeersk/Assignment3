package assignment3_2;

public class Manager extends Employee {

	private String degree;

	public Manager(String ID, String name, double salary, String degree) {
		super(ID, name, salary);
		this.degree = degree;

	}

	@Override
	public double getNetSalary() {
		double salary1;
		if (degree == "bsc") {
			salary1 = getSalary() * 1.1;
		} else if (degree == "msc") {
			salary1 = getSalary() * 1.2;
		} else if (degree == "phd") {
			salary1 = getSalary() * 1.35;
		} else
			salary1 = getSalary();
		return salary1 - (salary1 * 0.1);
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNet Salary: " + getNetSalary() + "\nDegree:" + degree;
	}
}
