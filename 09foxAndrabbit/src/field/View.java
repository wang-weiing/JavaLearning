package field;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import cell.Cell;

public class View extends JPanel{
    private static final long serialVersionUID = -2417015700213488315L;
    private static final int GRID_SIZE = 16;
    private Field thefield;
   
    public View (Field field){
        thefield = field;
    }
   
    @Override
    public void paint( Graphics g ){
        super.paint(g);
        g.setColor(Color.gray);
        for( int row = 0; row < thefield.getHeight(); row++ ){
            g.drawLine(0, row*GRID_SIZE, thefield.getWidth()*GRID_SIZE, row*GRID_SIZE);
        }
        for( int col = 0; col < thefield.getHeight(); col++ ){
            g.drawLine(col*GRID_SIZE, 0, col*GRID_SIZE, thefield.getHeight()*GRID_SIZE);
        }
        for( int row = 0; row < thefield.getHeight(); row++){
            for( int col = 0; col < thefield.getWidth(); col++){
                Cell cell = thefield.get(row, col);
                if( cell != null ){
                    cell.draw( g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
                }
            }
        }
    }
   
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(thefield.getWidth()*GRID_SIZE+1, thefield.getHeight()*GRID_SIZE+1);
    }
}