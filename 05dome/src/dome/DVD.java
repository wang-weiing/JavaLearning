package dome;

public class DVD  extends Item {
	private String direror;

	public DVD(String title, String direror, int playTime, String comment) {
		super(title,playTime,false ,comment);
		this.direror = direror;
	}



	public void print() {
		  System.out.print("DVD:");
		  super.print();
		  System.out.print(direror);
	}
}
