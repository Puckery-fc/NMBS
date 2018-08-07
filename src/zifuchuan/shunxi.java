package zifuchuan;

public class shunxi {

	public static void main(String[] args) {
	
	int[] s1 = {1,2,5,3,6,4,8,12,36};

	for(int i=0;i<=s1.length;i++)
	{  
		if(s1[i]%2==0){
		System.out.println("Å¼ÊýÎª£º");	
		System.out.println(+s1[i]);	
		}	
		else{
		System.out.println("ÆæÊý£º");	
		System.out.println(s1[i]);	
		}
	}
	
	
	}

		
}
   



