package clock;
// java 对象交互
public class Clock {
    private Display hour=new Display(24);
    private Display minute=new Display(60);

    public void start() {
        while (true) {
            minute.increase();
            if (minute.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }
    public static void main(String[] args) {
        Clock clock=new Clock();
        clock.start();
    }
}

//对象=属性+服务
//数据： 属性或状态   操作：函数
//封装 把数据和对数据的操作放在一起

// private
// 只有这个类可以访问
//类内部指 类的成员函数和定义初始化
//  强调   这个限制 针对类的而不是针对 对象

// public
//friendly 不加前缀 private public 就是friendly  同一个package可以访问
// 类变量  static   可以通过 （类.名称  对象.名称  ） 范围 修改值   同时  修改后的值在所有对象中都一样
//类函数  访问static函数 访问static变量