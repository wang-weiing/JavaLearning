package hello;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
//  文件  
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainV2 {
	public static void main(String[] args)  {

		System.out.println("hello world");
		byte[]buf=new byte [10];
			for (int i=0;i<buf.length;i++) {
				buf[i]=(byte)i;
			}
			try {
				DataOutputStream out =new DataOutputStream (
						new BufferedOutputStream(
						new FileOutputStream("b.dat")));
			//	int i=0xcafebabe;
			   int i=123456;
				out.writeInt(i);	
			    out.close();
				DataInputStream in=new DataInputStream (
						new BufferedInputStream(
						new FileInputStream("b.dat")));
				int j=in.readInt();
				System.out.println(j);
			}catch(FileNotFoundException e ){
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	
	}
}