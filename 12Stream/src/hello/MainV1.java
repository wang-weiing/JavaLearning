package hello;


//  文件  
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainV1 {
	public static void main(String[] args)  {

		System.out.println("hello world");
		byte[]buf=new byte [10];
			for (int i=0;i<buf.length;i++) {
				buf[i]=(byte)i;
			}
			try {
				FileOutputStream out =new 	FileOutputStream("a.dat");
			    out.write(buf);			
			}catch(FileNotFoundException e ){
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	
	}
}