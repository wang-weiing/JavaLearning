package dome;

public class Item {
	//private String title;//子类 继承 oeivate  不能用
	private String title;
	private int playTime;
	private boolean gotIt= false;
	private String comment;
	
	public Item(String  title, int playTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playTime = playTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public void print() {
		// TODO 自动生成的方法存根
		System.out.print(title);
	}

}
