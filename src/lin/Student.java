package lin;

public class Student {
	String studentName;
	int studentAge;
	String studentGrade;
	public Student(){
		
	}
	public Student(String name,int age,String grade){
		studentName=name;
		studentAge=age;
		studentGrade=grade;
	}
	public void print(){
		System.out.println("����:"+studentName+"    ����:"+studentAge+"    ѧ����"+studentGrade);
	}
	
	
	
	
	
	
	/*
	public static void main(String[] args){
		Student student=new Student();
		student.printName();
	}*/

}
