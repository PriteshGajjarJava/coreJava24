// java EmpDemo
class EmpDemo {
	public static void main(String[] args) {
		System.out.println("main");

		Emp e1 = new Emp();
		Emp e2 = new Emp();

		e1.name = "Fred";
		e1.salary = 20000;

		e2.name = "John";
		e2.salary = 50000;

		e1.showDetails();
		e2.showDetails();

		Emp.printCompany();
	}

	static {
		System.out.println("Emp Demo class loaded...");
	}
}

class Emp {
	String name;
	float salary;//yearly
	static String company = "Wipro";

	static {
		System.out.println("Emp class loaded - static block");
	}

	{
		System.out.println("Emp object created..");
	}

	static void printCompany() {
		System.out.println("Company name is: " + Emp.company);
	}
	void showDetails() {
		System.out.println(this.name + "," + this.salary + "," + Emp.company);
	}
	float getMonthlySalary() {
		return this.salary/12;
	}

}