package lin;

public class TestMain {
	public static void main(String[] args){
		College sa=new College("СС��",20,"��ѧ��", "����1��");
		sa.print();
		sa.printCollege();
		Middle sb=new Middle("С     ��",21,"��ѧ��","����ѧ��");
		sb.print();
		sb.printMiddle();
		School sc=new School("С     ��",22,"Сѧ��","������");
		sc.print();
		sc.printSchool();
	}

}
