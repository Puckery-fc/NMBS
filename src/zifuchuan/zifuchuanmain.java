package zifuchuan;

public class zifuchuanmain {
	public static void main(String[] args){
		String s3="I have a dog";
		String s4;
		s4 = s3.substring(0,6);
		
		
		char[] ArrayList = {'a','b','c','d','e','f','g'};
		System.out.println(ArrayList);
		
		
		char[] s1 = {'I',' ','h','a','v','e',' ','a',' ','d','o','g'};
		char[] s2= getSubString(s1,0,5);
		for(int i=0;i<=5;i++)
		{
			System.out.print(s2[i]);
		}
	}
	static char[] getSubString(char[] s1,int startChar,int endChar){
		char[] s2 = new char[255];
		for(int i=0;i<=endChar;i++)
		{
			s2[i]= s1[i+startChar];
		}
		return s2;
	}
}
