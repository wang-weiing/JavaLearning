package animal;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import cell.Cell;

public class Fox extends Animal implements Cell{
    public Fox(){
        super(20,4);     //最大年龄，生育年龄
    }
   
    @Override
    public void draw( Graphics g, int x, int y, int size ){
        int alpha = (int)((1-getAgePercent())*255);
        g.setColor(new Color(0,0,0,alpha));
        g.fillRect(x, y, size, size);
    }
   
    @Override
    public Animal breed() {
        Animal ret = null;
        if( isBreedable() && Math.random() < 0.05 ){   //5%的几率breed
            ret = new Fox();
        }
        return ret;
    }
   
    @Override
    public String toString(){
        return "Fox:"+super.toString();
    }
   
    @Override
    public Animal feed(ArrayList<Animal> neighbour){    //返回被吃的兔子
        Animal ret = null;
        if( Math.random() < 0.2 ){
            ret = neighbour.get((int)(Math.random()*neighbour.size()));
            longerlife(2);
        }
        return ret;
    }
}