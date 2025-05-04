import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();

		System.out.println("The name is " + name);
		int age;
		System.out.println("Enter your age");
		age = sc.nextInt();
		System.out.println("Age is " + age);

		double salary;
		System.out.println("Enter your salary");
		salary = sc.nextDouble();
		System.out.println("Salary is " + salary);

	}

}
