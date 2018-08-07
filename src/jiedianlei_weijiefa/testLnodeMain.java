package jiedianlei_weijiefa;

public class testLnodeMain {
	public static void main(String[] args){
		Lnode p1=new Lnode();
		p1.data='a';
		p1.next=null;
		
		Lnode p2=new Lnode();
		p2.data='b';
		p2.next=null;
		p1.next=p2;
		
		Lnode p3=new Lnode();
		p3.data='c';
		p3.next=null;
		p2.next=p3;
		
		Lnode p4=new Lnode();
		p4.data='d';
		p4.next=null;
		p3.next=p4;
		
		Lnode p5=new Lnode();
		p5.data='e';
		p5.next=null;
		p4.next=p5;
		
		Lnode p6=new Lnode();
		p6.data='f';
		p6.next=null;
		p5.next=p6;
		
		Lnode p7=new Lnode();
		p7.data=' ';
		p7.next=null;
		p6.next=p7;
		
		Lnode h=p1;
		while(h.next!=null)
		{
			System.out.print(h.data+" ");
			h=h.next;
		}
	}
}
