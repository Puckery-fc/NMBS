package lin;

public class xianxingbiao {
	public static void main(String ages[]){
		String a[]=new String[11];
		a[0]="11";
		a[1]="35";
		a[2]="9";
		a[3]="2";
		a[4]="34";
		a[5]="3";
		a[6]="18";
		a[7]="50";
		a[8]="78";
		a[9]="26";
		a[10]="0";    
		for(int i=10;i>3;i--){
			a[i]=a[i-1];
		}
		a[4]="3";
		for(int i=8;i<11;i++){
			a[i-1]=a[i];
		}
		for(int i=0;i<11;i++){
			System.out.println(a[i]);
		}
	}
}
