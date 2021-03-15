package shapes;

import java.awt.Graphics;

public abstract class Shape {

	/*  抽象函数 ————表达概念而无法实现具体代码的函数
	 *  抽象类    ————表达概念而无法构成实体的类
	 *  
	 *   具有抽象函数的类一定是抽象类
	 *   抽象类产生不了对象  但是可以定义变量
	 *   任何继承了抽象类的非抽象类对象都可以付给这个变量
	 *   抽象函数 没有  { }
	 * */
	
	/* 实现  抽象函数
	 * 继承自  抽象类的 子类  必须覆盖 父类的抽象函数  否则自己成为  抽象类
	 * 
	 * 
	 * */
	public abstract void draw(Graphics g);
	
}
