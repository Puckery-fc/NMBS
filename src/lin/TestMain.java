package lin;

public class TestMain {
	public static void main(String[] args){
		College sa=new College("小小明",20,"大学生", "文秘1年");
		sa.print();
		sa.printCollege();
		Middle sb=new Middle("小     伦",21,"中学生","三好学生");
		sb.print();
		sb.printMiddle();
		School sc=new School("小     厉",22,"小学生","打篮球");
		sc.print();
		sc.printSchool();
	}

}
