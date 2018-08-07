package jiedianlei_touchafa;

public class LinkedList {
	public Lnode h= new Lnode();
	Lnode t = h;
	public LinkedList(){
		h.next = null;
	}
	
	//β�巨
	public void inserTail(char x){
		Lnode p = new Lnode();
		p.data = x;
		p.next = null;
		t.next = p;
		t = p;
	}
	
	//ͷ�巨
	public void inserHead(char x){
	
		Lnode p = new Lnode();
		p.data = x;
		p.next = h.next;
		h.next = p;
		
		
		
	}
	
	//��ӡ����
	public void PrintLinkedList(){
		Lnode p = new Lnode();
		p = h.next;
		while (p!=null){
		
			System.out.print(p.data + ",");
			p = p.next;
		}
	}
	
	//������
	public void inserElementAfter(char x,char y){
		Lnode q = new Lnode();
		q=h.next;
		while(q!=null){
			if(q.data==x)
				break;
			else{
				q = q.next;
			}
		}
		Lnode p = new Lnode();
		p.data = y;
		p.next = q.next;
		q.next = p;
	}
	
	//���ҽ��
	public Lnode search(char x){
		Lnode p = new Lnode();
		p = h.next;
		while (p!=null){
			if(p.data==x)
				break;
			else
				p = p.next;
		}
		return  p;
	}
	
	//ɾ�����
	public void remove(char x){
		Lnode q = new Lnode();
		q = h.next;
		Lnode former = h;
		while (q!=null){
			if(q.data==x)
				break;
			else
			{
				former = q;
				q = q.next;
			}
		}
		former.next = q.next;
	}
	
	//����������
	public int size(){
		Lnode p;
		int i=0;
		p = h.next;
		while (p!=null){
			i++;
			p = p.next;
		}
		return i;
	}
}
