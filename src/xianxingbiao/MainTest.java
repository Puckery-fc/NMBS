package xianxingbiao;

public class MainTest {
	public static void main(String[] args){                                                                                                                                                                                                                                                                                                                                
		int[] firstData={11,35,9,2,34,3,18,50,78,28,0};
		IntListArray ila=new IntListArray();
		ila.initialList(firstData);
		int temp =ila.indexof(2);	
		System.out.println(temp);	
		
		ila.insertAt(2,3);
		System.out.println();
		
		ila.deleteElement(18);
		System.out.println();
	}
}
