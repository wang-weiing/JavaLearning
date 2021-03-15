package notebook;

//容器
import java.util.ArrayList;
public class NoteBook {
//用来存放 string 的ArrayList   泛型类
	// 容器类   ： 容器类有两个类型  容器的类型 和 元素的类型
	//eg  ArrayList<String>notes=new ArrayList<String>();
	private ArrayList<String>notes=new ArrayList<String>();
	private int size=0;
	public void add(String s)
	{
		notes.add(s);

	}
	public int getSize()
	{
		return notes.size();
	}
	public String getNote(int index)
	{
		return"";
	}
	public boolean removeNote(int index) {
		return true;
	}
//	设计一
//	public void list() {
//		System.out.println();
//	}
	
	//设计二
//	当数组的元素的类型是类的时候，数组的每一个元素其实只是对象的管理者而不是对象本身。
//	因此，仅仅创建数组并没有创建其中的每一个对象！
	public String[] list() {
		int[] ia=new int[10];
		String[]a=new String[notes.size()];
		notes.toArray(a);
		return a;
		
	}
	public static void main(String[] args) {
		
		int[] ia=new int[10];
		String[]a=new String[10];
		System.out.println(ia[0]);
	//	System.out.println(a[0]);//输出为null 
		System.out.println(a[0].length());
		
//		String s=null;
//		System.out.println(s.length());
//	       报错	NullPointerException
		
//		// TODO 自动生成的方法存根\
//		String[] a=new String[2];
//		a[0]="first";
//		a[1]="second";
//		
//		
//		NoteBook nb= new  NoteBook();
//		nb.add("first");
//		nb.add("second");
//		System.out.println(nb.getSize());
//		System.out.print(a[0]);

	}

}
