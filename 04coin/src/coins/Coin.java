package coins;
/* HashMap  迭代器 举例*/
import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer,String>  coinnames =new HashMap<Integer,String>(); 
	
	public Coin() {
		coinnames .put(1,"penny");
		coinnames .put(10,"dime");
		coinnames .put(25,"quarter");
		coinnames .put(50,"half-dolar");
	}
	
	public String getName(int amount) {
		return coinnames.get(amount);
	}
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int amount =in.nextInt();
	Coin coin =new Coin();
	String name=coin.getName(amount);
	System.out.println(name);		
 
}

}
