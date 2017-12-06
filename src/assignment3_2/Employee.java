package assignment3_2;

public class Employee extends ReusaxCorp implements Comparable<Employee> {

	private String ID;
	private String name;
	private double salary;

	public Employee() {
		this("Unknown", "Unknown", 0);
	}

	public Employee(String ID, String name, double salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}

	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		salary = newSalary;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double grossSalary() {
		return salary;
	}

	public double getNetSalary() {
		return getSalary() * 0.9;
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\nID: " + ID + "\nSalary: " + salary;
	}

	public boolean equals(Employee e2) {
		return ID.equals(e2.ID);
	}

	@Override
	public int compareTo(Employee e) {
		int cmp = name.compareTo(e.name);
		if (cmp == 0) {
			return Double.compare(grossSalary(), e.grossSalary());
		} else {
			return cmp;
		}
	}

}
