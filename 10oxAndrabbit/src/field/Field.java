package field;

import java.util.ArrayList;

import cell.Cell;

public class Field {
//  这段代码没用到过
//  private static final Location[] adjacent = {
//          new Location(-1,-1),new Location(-1,0),new Location(-1,1),
//          new Location(0,-1) ,new Location(0,0) ,new Location(0,-1),
//          new Location(1,-1) ,new Location(1,-1),new Location(1,-1),
//  };
    private int width;
    private int height;
    private Cell[][] field;
   
    public Field(int width, int height){
        this.height = height;
        this.width = width;
        field = new Cell[height][width];
    }
   
    public int getWidth(){ return width; }
    public int getHeight(){ return height; }
   
    public Cell get(int row, int col){
        return field[row][col];
    }
   
    public Cell[] getNeighbour(int row, int col) {
        ArrayList<Cell> list = new ArrayList<Cell>();
        for( int i = -1; i<2; i++ ) {
            for( int j = -1; j<2; j++ ) {
                int r = row+i;
                int c = col+j;
                if( r>-1 && r<height && c>-1 && c<width && !(r == row && c == col)) {
                    list.add(field[r][c]);
                }
            }
        }
        return list.toArray(new Cell[list.size()]);
    }
     //列出周围空cell的数组
    public Location[] getFreeNeighbour(int row, int col) {  
        ArrayList<Location> list = new ArrayList<Location>();
        for( int i = -1; i<2; i++ ) {
            for( int j = -1; j<2; j++ ) {
                int r = row+i;
                int c = col+j;
                if( r>-1 && r<height && c>-1 && c<width && field[r][c] == null ) {
                    list.add(new Location(r, c));
                }
            }
        }
        return list.toArray(new Location[list.size()]);
    }
   
    public boolean placeRandomAdj( int row, int col, Cell cell ){  
        boolean ret = false;
        Location[] FreeAdj = getFreeNeighbour(row, col);
        if( FreeAdj.length > 0 ){
            int idx = (int)(Math.random()*FreeAdj.length);
            field[FreeAdj[idx].getRow()][FreeAdj[idx].getCol()] = cell;
            ret = true;
        }
        return ret;
    }
   
    public Cell remove( int row, int col ){
        Cell ret = field[row][col];
        field[row][col] = null;
        return ret;
    }
   
    public void remove( Cell cell ){
        for( int row = 0; row < height; row++ ){
            for( int col = 0; col <width; col++ ){
                if( field[row][col] == cell ){
                    field[row][col] = null;
                    break;
                }
            }
        }
    }
   
    public void clear(){
        for( int i = 0; i < height; i++){
            for( int j = 0; j < width; j++){
                field[i][j] = null;
            }
        }
    }
   
    public void move(int row, int col, Location loc){
        field[loc.getRow()][loc.getCol()] = field[row][col];
        remove(row,col);
    }

    public Cell place(int row, int col, Cell c) {
        Cell ret = field[row][col];
        field[row][col] = c;
        return ret;
    }
}