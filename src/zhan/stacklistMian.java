package zhan;

public class stacklistMian {
	public static void main(String[] args) {
	stacklist s1= new stacklist();
       s1.initial();
       
       int n=35;
       while(n!=0){
    	   
    	  s1.push(n%2);
    	  n/=2;
    	
       }
       while(!s1.isEmpty()){
       System.out.print(s1.pop()); 	
	}
       
       System.out.println();
      System.out.print(s1.equals(s1)); 
     

      
	}
}
