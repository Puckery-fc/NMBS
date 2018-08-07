package xianxingbiao;

public class IntListArray implements ListInfo{
	int[] myList;
	public void initialList(int[] listData){
		myList =new int[11];
		myList =listData;
	}
	public int indexof(int obj){
		int result=Integer.MAX_VALUE;
		for(int i=0;i<myList.length-1;i++){
			if(obj==myList[i]){
				result=i;
				break;
			}
		}
		return result;
	}
	public int insertAt(int preObj, int insertObj) {
		int j;
		for(int s=0;s<myList.length-1;s++){
			if(preObj==myList[s]){
				j=s;
				for(int b=myList.length-1;b>j;b--){
					myList[b]=myList[b-1];
				}
				myList[j+1]=insertObj;
				for(int n=0;n<myList.length;n++){
					System.out.print(myList[n]+" ");
				}
			}			
		}		
		return 0;
	}
	public int deleteElement(int obj) {
		int y;
		for(int i=0;i<myList.length;i++){
			if(obj==myList[i]){
				y=i;
				for(int a=y+1;a<myList.length;a++){
					myList[a-1]=myList[a];
					}
				for(int b=0;b<myList.length-1;b++){
					System.out.print(myList[b]+" ");
				}
			}
		}
		return 0;
	}
}
