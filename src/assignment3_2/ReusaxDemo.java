package assignment3_2;

public class ReusaxDemo extends ReusaxCorp {

    public static void main(String[] args) {
	Employee employee = new Employee("7579", "Anders Karlsson", 24000.0);
	Employee manager = new Manager("4596", "John Le", 32000.0, " bsc");
	Employee director = new Director("1236", "Adam Sturesson", 60000.0, "phd", "Technical");
	Employee intern = new Intern("2698", "Martin Karlsson", 10000.0, 9, 1000);
	Employee employee1 = new Employee("7079", "Anders Johansson", 26000);
	System.out.println(employee.toString());
//	System.out.println(manager.toString());
//	System.out.println(director.toString());
//	System.out.println(intern.toString());
	register(employee);
	register(employee1);
	register(manager);
	register(intern);
	register(director);
	System.out.println(registeredEmployees());
	System.out.println(calculateGrossSalaries());
	//System.out.println(calculateNetSalaries());
    }

}
