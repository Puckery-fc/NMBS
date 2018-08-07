package xueshenglei;

public class ArrayOfClass implements ListInfo{
  Student a[];
	public int deleteElement(Student obj) {
		int result=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
		    if(a[i].xuehao==obj.xuehao)
		    {
		    	result=i;
		    	for(int c=result+1;c<a.length ;c++){
					  a[c-1].xuehao=a[c].xuehao;
					  a[c-1].name=a[c].name;
					  a[c-1].grade=a[c].grade;
				  }
		    	
		    	
		    	
		    	for(int j=0;j<a.length-1;j++){
		    		System.out.print(a[j].xuehao+" "+a[j].name+" "+a[j].grade+" ");
				}
		    }
		    
	    	}
		
		return result;
	}

	public int indexOf(Student obj) {
		int result=Integer.MAX_VALUE;
	    int i;	    
		for (i=0;i<a.length;i++){
			if(a[i].xuehao==obj.xuehao){
				result=i;
				break;
			}
		}
		
		return result;
		// TODO Auto-generated method stub
		
	}

	public void initialList(Student[] listData) {
		a=new Student[13];
		a=listData;// TODO Auto-generated method stub
		
	}

	public int insertAt(Student b, Student obj) {
		int result=Integer.MAX_VALUE;//Î»ÖÃ
		for(int i=0;i<a.length;i++)
		{
		    if(a[i].xuehao ==b.xuehao)
		    {
		    	result=i;
		    	for(int d=a.length-1;d>result;d--){
		    		a[d].xuehao=a[d-1].xuehao;
			    	a[d].name=a[d-1].name;
			    	a[d].grade=a[d-1].grade;
		    	}
		    	a[i+1].xuehao=obj.xuehao;
		    	a[i+1].name=obj.name;
		    	a[i+1].grade=obj.grade;
		    	for(int n=0;n<a.length;n++){
		    		System.out.print(a[n].xuehao+" "+a[n].name+" "+a[n].grade+" ");
		    	}
		    }
		    
		   }
		
		return result+1;
		
	}	
}
