package pack1;

public class SchoolStudent implements Student{

	@Override
	public void enroll() {
		System.out.println("School student is enrolled");
	}

	@Override
	public void takeExam() {
		System.out.println("School student taken exam");
		
	}

	@Override
	public void leave() {
		System.out.println("School student Left");
		
	}

}
