package field;

public class Location{
    private int row;
    private int col;
   
    public Location( int row, int col ){
        this.col = col;
        this.row = row;
    }
   
    public int getRow(){
        return row;
    }
    public int getCol() {
        return col;
    }
}