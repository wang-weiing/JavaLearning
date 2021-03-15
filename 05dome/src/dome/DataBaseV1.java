package dome;

import java.util.ArrayList;
//增加内容 DVD
public class DataBaseV1 {
	private ArrayList<CD>listCD= new  ArrayList<CD>();
	private ArrayList<DVD>listDVD= new  ArrayList<DVD>();
	
	
	public void add(CD cd) {
		listCD.add(cd);
	}
	public void add(DVD dvd) {
		listDVD.add(dvd);
	}
	
	public void list() {
		for (CD cd:listCD) {
			cd.print();
		}
			for (DVD dvd:listDVD) {
				dvd.print();
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
