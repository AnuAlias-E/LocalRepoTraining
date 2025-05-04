package pack1;

public class CollegeStudent implements Student {

	@Override
	public void enroll() {
		System.out.println(" College student is enrolled");
		
	}

	@Override
	public void takeExam() {
		System.out.println(" College student Taken Exam");
	}

	@Override
	public void leave() {
		System.out.println(" College student Left");
	}

}
