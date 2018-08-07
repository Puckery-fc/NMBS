package xueshenglei;

public class StudentMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] firstData={new Student("14025201","³Â±ó±ó",80),new Student("14025202","³Â³ç×ê",75),new Student("14025203","³ÂÂ¶Â¶",82),new Student("14025204","³ÂÅï",90),
				new Student("14025205","·½³É",60),new Student("14025206","ºÎöÎÀÚ",86),new Student("14025207","ºØÓ¢¿¡",94),
				new Student("14025208","ºéÉÆÍş",78),new Student("14025209","ºúÉáÉĞ",68),new Student("14025210","»Æ³¿•N",70)};
		ArrayOfClass s=new ArrayOfClass();
		 s.initialList(firstData);
	 int x=s.indexOf(new Student("14025206","ºÎöÎÀÚ",86));
	 System.out.println("Î»ÖÃÎª£º"+x);
	 int q=s.deleteElement(new Student("14025208","ºéÉÆÍş",78));
		System.out.println("É¾³ıÎ»ÖÃÎª£º"+q);
	int z=s.insertAt(new Student("14025205","·½³É",60), new Student("14025214","À×Ë³¶«",100));
	System.out.println("²åÈëÎ»ÖÃÎª£º"+z);
	
	}

}
