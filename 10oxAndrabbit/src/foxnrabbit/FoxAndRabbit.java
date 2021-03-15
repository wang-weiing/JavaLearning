package foxnrabbit;
//   反转控制   swing  消息机制
//  主要思想：两层for循环，挨个cell执行移动、进食、生育；每次循环结束后repaint view；
/*
 * 狐狸、兔子都有年龄；
 * 到达一定年龄上限会自然死亡；
 * 狐狸随机吃掉周围一只兔子；
 * 狐狸、兔子可以随机生一只小的放在旁边格子；
 * 如果不吃不生，狐狸、兔子可以随机向旁边格子移一步会随机吃掉
 * */

/*接口
 * 接口是纯抽象类
 * 所有成员函数都是抽象函数
 * 所有成员变量都是 public
 * 接口规定了长什么样子  但是不管里面有什么
 * */

/*注入反转
 * 由按钮公布一个守听者接口   和  一堆  注册 注销 函数
 * 代码实现接口  守听者对象注册在按钮上   
 * 一旦按钮被按下  反过来调用  守听者对象的某个函数
 * */
import field.Field;
import field.View;
import field.Location;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import animal.Fox;
import animal.Rabbit;
import animal.Animal;
import cell.Cell;

//增加  图形
public class FoxAndRabbit{
    private Field thefield;
    private View theview;
    private    JFrame frame;
   
    public FoxAndRabbit( int size ){
        thefield = new Field(size, size);
        for( int row = 0; row <thefield.getHeight(); row++ ){
            for( int col = 0; col < thefield.getWidth(); col++ ){
                double probability = Math.random();
                if( probability <0.05 ){
                    thefield.place( row, col, new Fox());
                }else if( probability < 0.15 ){
                    thefield.place( row, col, new Rabbit());
                }
            }
        }
        theview = new View(thefield);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("FoxAndRabbit");
        frame.add(theview);
        //  显示按钮
       JButton btnStep= new JButton("单步");
       frame.add(btnStep,BorderLayout.NORTH);

       /*btnStep.addActionListener建立了一个内部类 实现  按钮功能    V1版本将内部类 单独拿出来构建
        * 这是一个  匿名类
        * new 对象的时候给出类的定义形成匿名类
        * 匿名类  可以继承某类  也可以实现某接口
        * Swing  的消息机制广泛使用匿名类
        * */
		   btnStep.addActionListener(new ActionListener() {
		 	@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("按下了");
					step();
					frame.repaint();
					}   
		       }); 
     
       frame.pack();
        frame.setVisible(true);
    }
   
    public void step(){
        for( int row = 0; row < thefield.getHeight(); row++ ){
            for( int col = 0; col < thefield.getWidth(); col++ ){
                Cell cell = thefield.get(row, col);
                if( cell != null ){
                    Animal animal = (Animal)cell;
                    animal.grow();
                    //  活着的 做三个行为  移动 吃  养育
                    if( animal.isAlive()){
                        //move
                        Location loc = animal.move(thefield.getFreeNeighbour(row, col));
                        if( loc != null ){
                            thefield.move(row, col, loc);
                        }
                        //eat   animal.eat(thefield);
                        if( animal instanceof Fox){
                            Cell[] neighbour = thefield.getNeighbour(row, col);
                            ArrayList<Animal> listRabbit = new ArrayList<Animal>();
                            for( Cell an : neighbour ){
                                if( an instanceof Rabbit ){
                                    listRabbit.add( (Rabbit)an );
                                }
                            }
                            if( !listRabbit.isEmpty() ){
                                Animal fed = animal.feed(listRabbit);
                                if( fed != null ){
                                    thefield.remove((Cell)fed);
                                }
                            }
                        }
                        //breed
                        Animal baby = animal.breed();
                        if( baby != null ){
                            thefield.placeRandomAdj(row, col, (Cell)baby);
                        }
                    }else{
                        thefield.remove(row, col);
                    }
                }
            }
        }  
    }
   
    public void start( int steps ){
        for( int i = 0; i < steps; i++){
            step();
            theview.repaint();
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
   
    public static void main(String[] args) {
        FoxAndRabbit fnr = new FoxAndRabbit(30);
     //   fnr.start(10);
    }
}