package jiedianlei_touchafa;

public class LinkedListMain {
	public static void main(String[] args){
		LinkedList linkedlist1 = new LinkedList();
		LinkedList linkedlist2 = new LinkedList();
		LinkedList linkedlist3 = new LinkedList();
		
		linkedlist1.inserTail('1');
		linkedlist1.inserTail('3');
		linkedlist1.inserTail('5');
		linkedlist1.inserTail('7');
		linkedlist1.inserTail('9');
	

		
		linkedlist2.inserTail('2');
		linkedlist2.inserTail('4');
		linkedlist2.inserTail('6');
		linkedlist2.inserTail('8');
		
		
		
		linkedlist3.inserTail('1');	
		linkedlist3.inserTail('2');	
		linkedlist3.inserTail('3');	
		linkedlist3.inserTail('4');	
		linkedlist3.inserTail('5');	
		linkedlist3.inserTail('6');
		linkedlist3.inserTail('7');
		linkedlist3.inserTail('8');
		linkedlist3.inserTail('9');
		
		linkedlist1.PrintLinkedList();
		System.out.println();
		linkedlist2.PrintLinkedList();
		System.out.println();
		linkedlist3.PrintLinkedList();
	}

}
