package vendingmachine;

public class VendingMachine {
    int price=80;
    int blance;
    int total;

    //构造函数   建立对象主动调用 不能有返回类型
    /* 定义   如果有一个成员函数名字个类的名字完全相同
    则在创建这个类的每一个对象都自动调用这个函数
     */
    VendingMachine()
    {
        total=0;
    }
    //函数重载
    /* 一个类可以有多个构造函数 只要参数表不同
    创建对象的时候给出不同的参数值 会调用不同的构造函数
    可以用this 调用其他的构造函数
    一个类里的同名但参数表不同的函数构成重载

     */
    VendingMachine(int price)
    {
        this();//调用了无参的构造函数
        this.price=price;
    }


    void setPrice(int price)
    {
        this.price=price;

    }
    void showPrompt()
    {
        System.out.println("welcome");
    }
        void insertMoney(int amount)
        {
            blance=blance+amount;
        }

        void showBlance ()
        {
            //System.out.println(blance); 两个语句作用相同
            System.out.println(this.blance);
        }

        void getfood()
        {
            if (blance>=price)
            {
                System.out.println("here you are");
                blance=blance-price;
                total=total+price;
                showBlance();

            }
        }
    public static void main(String[] args) {
        VendingMachine vm=new VendingMachine();
        vm.showPrompt();
        vm.showBlance();;
        vm.insertMoney(100);
        vm.getfood();

        VendingMachine vm1=new VendingMachine();
        vm1.insertMoney(200);
        vm1.showBlance();
        vm.showBlance();

    }
}
//对象变量是对象的管理者 而非所有者
/*   运算符 .
 1、 可以调用某个对象的函
 2、在成员函数内部 直接调用自己的其他函数
 */

/*
*类定义了对象中所具有的变量 这些变量称作变量
*每个对象都有自己的变量 和同一个类的其他变量是分开的
 */


/*   this
*this 是成员函数的一个特殊固有的本地变量
*它表达了调用了这个函数的对象
*/

/* 本地变量
* 定义在 函数内部的变量即为本地变量
* 本地变量的生存期和作用域都是函数内部
* 成员变量的生存期是对象的生存期 作用域是类内部的成员函数
*/