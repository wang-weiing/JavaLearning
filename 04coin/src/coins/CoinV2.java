package coins;
/* HashMap  迭代器 举例*/
import java.util.HashMap;
import java.util.Scanner;

public class CoinV2 {
	private HashMap<Integer,String>  coinnames =new HashMap<Integer,String>(); 
	
	public CoinV2() {
		coinnames .put(1,"penny");
		coinnames .put(10,"dime");
		coinnames .put(25,"quarter");
		coinnames .put(50,"half-dolar");
		coinnames .put(50,"五毛");//  会替换half_dolar
	System.out.println(coinnames.keySet().size());
	System.out.println(coinnames);
	//增加遍历循环
	for (Integer K:coinnames.keySet()) {
		String s =coinnames.get(K);
		System.out.println(s);	
			}
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
	CoinV2 coin =new CoinV2();
	String name=coin.getName(amount);
	System.out.println(name);		
 
}

}
