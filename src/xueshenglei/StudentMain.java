package xueshenglei;

public class StudentMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] firstData={new Student("14025201","�±��",80),new Student("14025202","�³���",75),new Student("14025203","��¶¶",82),new Student("14025204","����",90),
				new Student("14025205","����",60),new Student("14025206","������",86),new Student("14025207","��Ӣ��",94),
				new Student("14025208","������",78),new Student("14025209","������",68),new Student("14025210","�Ƴ��N",70)};
		ArrayOfClass s=new ArrayOfClass();
		 s.initialList(firstData);
	 int x=s.indexOf(new Student("14025206","������",86));
	 System.out.println("λ��Ϊ��"+x);
	 int q=s.deleteElement(new Student("14025208","������",78));
		System.out.println("ɾ��λ��Ϊ��"+q);
	int z=s.insertAt(new Student("14025205","����",60), new Student("14025214","��˳��",100));
	System.out.println("����λ��Ϊ��"+z);
	
	}

}
