package xueshenglei;

public interface ListInfo {
	public void initialList(Student[] listData);
	public int indexOf(Student obj );
	public int insertAt(Student preObj,Student insertObj );
	public int deleteElement(Student obj);
}
