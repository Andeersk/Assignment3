package assignment3_2;

import java.util.ArrayList;
import java.util.Collections;

public class ReusaxCorp {

	private static ArrayList<Employee> employees = null;

	public ReusaxCorp() {
		employees = new ArrayList<Employee>();
	}

	public static int registeredEmployees() {
		return employees.size();
	}

	protected static void register(Employee e) {
		for (Employee e1 : employees) {
			if (e.equals(e1)) {
				return;
			}

		}

		employees.add(e);
	}

	public void register(String ID, String name, double salary) {

		register(new Employee(ID, name, salary));

	}

	public void register(String ID, String name, double salary, String degree) {

		register(new Manager(ID, name, salary, degree));
	}

	public void register(String ID, String name, double salary, String degree, String department) {

		register(new Director(ID, name, salary, degree, department));
	}

	public void register(String ID, String name, double salary, double GPA, double benefit) {

		register(new Intern(ID, name, salary, GPA, benefit));
	}

	public void remove(String ID) {
		employees.remove(ID);
	}

	public Employee retrieve(String ID) {
		for (Employee e : employees) {
			if (e.getID().equals(ID)) {
				return e;
			}
		}

		System.out.println("An employee of ID " + ID + " is not registered in the system. ");
		return null;
	}

	public void update(String ID, double newSalary) {
		update(ID, retrieve(ID).getName(), newSalary);
	}

	public void update(String ID, String newName) {
		update(ID, newName, retrieve(ID).getSalary());
	}

	public void update(String ID, String newName, double newSalary) {
		for (Employee e : employees) {
			if (e.getID().equals(ID)) {
				e.setName(newName);
				e.setSalary(newSalary);
			}
		}
	}

	public static double calculateGrossSalaries() {
		double result = 0;
		for (Employee e : employees) {
			result += e.getSalary();
		}
		return result;
	}

	public static double calculateNetSalaries() {
		double result = 0;
		for (Employee e : employees) {
			result += e.getNetSalary();
		}
		return result;
	}

	public void updateDirectorBenefit(double newBenefit) {
		Director.setBenefit(newBenefit);
	}

	public void getSortedEmployees() {
		Collections.sort(employees);
	}

	private Employee get(String ID) {
		Employee e = retrieve(ID);
		remove(ID);
		return e;
	}

	public void promoteToManager(String ID, String degree) {
		Employee e = get(ID);
		register(ID, e.getName(), e.getSalary(), degree);
	}

	public void promoteToDirector(String ID, String degree, String department) {
		Employee e = get(ID);
		register(ID, e.getName(), e.getSalary(), degree, department);
	}

	public void promoteToIntern(String ID, double GPA, double benefit) {
		Employee e = get(ID);
		register(ID, e.getName(), e.getSalary(), GPA, benefit);
	}

	public void promoteToEmployee(String ID) {
		Employee e = get(ID);
		register(ID, e.getName(), e.getSalary());
	}

	public void sortReversed() {
		Collections.sort(employees, Collections.reverseOrder());
	}

}
