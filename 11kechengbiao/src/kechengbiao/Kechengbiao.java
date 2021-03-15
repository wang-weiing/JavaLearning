package kechengbiao;


/*JTable    做到了  数据 与 表现分离    他只负责 数据的表现
 * JT able 对象 不存储数据
 * 
 * 
 * 
 * 
 * 
 * */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Kechengbiao {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		JTable table= new  JTable( new  Data());
		JScrollPane pane=new 	JScrollPane(table);
		frame.add(pane);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
