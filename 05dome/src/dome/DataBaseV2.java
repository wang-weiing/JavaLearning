package dome;
// 继承与多态
import java.util.ArrayList;
//增加内容 DVD
public class DataBaseV2 {
	
	private ArrayList<Item>listItem= new  ArrayList<Item>();

	public void add(Item item) {
	listItem.add(item);
}
	
	public void list() {

		for (Item item:listItem) {
			item.print();
		}
	}
	public static void main(String[] args) {
	DataBaseV1 db=new DataBaseV1() ;
	db.add(new CD("abc","abc",4,60,"..."));
	db.add(new CD("def","def",2,4,"qaq"));
	db.add(new DVD("xxx","aaa",60,",,,"));
	db.list();
	}


}
