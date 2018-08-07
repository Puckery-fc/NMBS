package jiedianlei_touchafa;

public class TestMain {
	public static void main(String[] args){
		Lnode h=new Lnode();
		
		Lnode p1=new Lnode();
		p1.data=' ';
		p1.next=h.next;
		h.next=p1;
		
		Lnode p2=new Lnode();
		p2.data='a';
		p2.next=h.next;
		h.next=p2;
		
		Lnode p3=new Lnode();
		p3.data='b';
		p3.next=h.next;
		h.next=p3;
		
		Lnode p4=new Lnode();
		p4.data='c';
		p4.next=h.next;
		h.next=p4;
		
		Lnode p5=new Lnode();
		p5.data='d';
		p5.next=h.next;
		h.next=p5;
		
		Lnode p6=new Lnode();
		p6.data='e';
		p6.next=h.next;
		h.next=p6;
		
		Lnode p7=new Lnode();
		p7.data='f';
		p7.next=h.next;
		h.next=p7;
		
		while(h.next!=null)
		{
			System.out.print(h.data+" ");
			h=h.next;
		}
	}
}
