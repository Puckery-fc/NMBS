package lin;

public class Middle extends Student{
	String studentAwards;
	public Middle(String name, int age, String grade,String awards) {
		studentName=name;
		studentAge=age;
		studentGrade=grade;
		studentAwards=awards;
	}
	public void printMiddle(){
		System.out.println("    ½±Ïî:"+studentAwards);
	}
}
