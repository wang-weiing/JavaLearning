package hello;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
//  文件  
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

public class MianV3 {
	public static void main(String[] args)  {

		System.out.println("hello world");
		byte[]buf=new byte [10];
			for (int i=0;i<buf.length;i++) {
				buf[i]=(byte)i;
			}
			try {
				// 流上建立 文本处理
				PrintWriter out=new 	PrintWriter (
											new BufferedWriter (
													new OutputStreamWriter(
															new FileOutputStream("a.txt"))));
			   int i=123456;
			   out.println(i);
			    out.close();
			    
			    
			    BufferedReader in =new BufferedReader(
			    		new InputStreamReader(
			    				new FileInputStream("src/hello/Main.java")));
			    String line;
			    while((line=in.readLine())!=null) {
			    	System.out.println(line);
			    }
			    		
			}catch(FileNotFoundException e ){
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	
	}
}