package ArrayListTest;
import java.util.ArrayList;

public class UserArrayList {
	public static void main(String[] args){
		
		ArrayList<Student>list=new ArrayList<Student>();
		
		Student student1=new Student("小张",20);
		list.add(student1);
		
		Student student2=new Student("小李",21);
		list.add(student2);
		
		System.out.println("学生人数为："+list.size());
		list.get(0).getName();
		
		System.out.println(((Student)list.get(0)).getName+","+(());
	}
}
