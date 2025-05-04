import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		String studentName;
		int mark1,mark2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name");
		studentName=sc.nextLine();
		System.out.println("Enter the mark1");
		mark1=sc.nextInt();
		System.out.println("Enter the mark2");
		mark2=sc.nextInt();
		
		int total=mark1+mark2;
		float average= total/2;
		System.out.printf("The student name is %s\nThe mark1 is %d\nThe mark2 is %d"
				+ "\nThe total is %d\nThe average is %3.2f",studentName,mark1,mark2,total,average);
	}

}
