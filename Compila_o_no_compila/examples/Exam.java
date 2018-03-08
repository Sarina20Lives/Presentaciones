public class Exam{
	private String title; 
	private boolean isEmpty;
	public static void main(String...args){
		firstQuestion();
		fourthQuestion();
	}
	public static void firstQuestion(){
		Exam exam = new Exam();
		System.out.println(exam.title + "," + exam.isEmpty);
	}
	public static void fourthQuestion(){
		int x1 = 50, x2 = 75;
		boolean b = x1 > x2;
		if(b = true) System.out.println("Success");
		else System.out.println("Failure");
	}
}