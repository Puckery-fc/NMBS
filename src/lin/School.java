package lin;

public class School extends Student{
	String studentHobby;
	public School(String name, int age, String grade,String hobby) {
		studentName=name;
		studentAge=age;
		studentGrade=grade;
		studentHobby=hobby;
	}
	public void printSchool(){
		System.out.println("    ÌØ³¤:"+studentHobby);
	}
}
