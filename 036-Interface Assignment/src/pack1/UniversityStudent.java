package pack1;

public class UniversityStudent implements Student{

	@Override
	public void enroll() {
		System.out.println(" University student is enrolled");
	}

	@Override
	public void takeExam() {
		System.out.println(" University student Taken Exam");
		
	}

	@Override
	public void leave() {
		System.out.println(" University student Left");
		
	}

}
