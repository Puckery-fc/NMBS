package zhan;

public class stacklist {
	 int str []=new int[100];
	 int top;

	 public void initial(){
		top=0; 
		 
	 }
	  public void push(int munber){
		   str[top]=munber;	
			  top++;
	  }
	  public int pop(){
		  top--;
		  return  str[top];	
	  }
	  
	  public boolean  isEmpty(){
		  boolean result =false;
		  if(top==0)
			  result =true;
		  else
			  result =false;
		  
			  return  result;  
		  
	  
	  
	  }
}