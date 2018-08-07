package lin;

public class College extends Student{
	String Workexperence;
	public College(String name, int age, String grade,String work) {
		studentName=name;
		studentAge=age;
		studentGrade=grade;
		Workexperence=work;
	}
	public void printCollege(){
		System.out.println("    工作经历:"+Workexperence);
	}

}
