package coins;
/* HashMap  迭代器 举例*/
import java.util.HashMap;
import java.util.Scanner;

public class CoinV1 {
	private HashMap<Integer,String>  coinnames =new HashMap<Integer,String>(); 
	
	public CoinV1() {
		coinnames .put(1,"penny");
		coinnames .put(10,"dime");
		coinnames .put(25,"quarter");
		coinnames .put(50,"half-dolar");
		coinnames .put(50,"五毛");//  会替换half_dolar
	System.out.println(coinnames.keySet().size());
	System.out.println(coinnames);
	}
	public String getName(int amount) {
	if ( coinnames.containsKey(amount))
		return coinnames.get(amount);
	else 
		return"Not Found";
	}
//对比Coin  增加了 输入非正常数字 （1，10 25，50以外的的数字） 输出 Not Found
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int amount =in.nextInt();
	CoinV1 coin =new CoinV1();
	String name=coin.getName(amount);
	System.out.println(name);		
 
}

}
