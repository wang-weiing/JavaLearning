package hello;
// 流   文件输入与输出
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		System.out.println("hello world");
		byte[]buffer=new byte [1024];
	    try {
	    	int len =System.in.read(buffer);
	    	String s=new String (buffer,0,len);
	    	System.out.println("读到了"+len+"字节");
	    	System.out.println(s);
	       	System.out.println("s的长度"+s.length());	    	
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
	}
}