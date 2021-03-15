package castleV1;

public class Room {
    private  String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public  String getExitDesc() {
 //  例一  使用 	String  ret=""   但是 系统开销 会较大  不建议  常用 sring buffer
//    	String  ret="";
//      	if (northExit!=null)
//    		ret+="north";
//    	   if (eastExit!=null)
//    		ret+="east";
//       	if (westExit!=null)
//    		ret+="west";
//       	if (southExit!=null)
//    		ret+="south";
//      return ret;
    	
   //方法二   StringBuffer
    	StringBuffer sb=new  StringBuffer();
    	if (northExit!=null)
    		sb.append("north");
    	if (eastExit!=null)
    	sb.append("east");
    	if (westExit!=null)
    	sb.append("west");
    	if (southExit!=null)
    	sb.append("south");
    	return sb.toString();
    	}
    
    
    public Room  getExit(String direction) {
    	Room ret=null;
    	 if(direction.equals("north")) {
           ret=northExit;
         }
         if(direction.equals("east")) {
        	  ret=eastExit;
         }
         if(direction.equals("south")) {
        	  ret=southExit;
         }
         if(direction.equals("west")) {
        	  ret=westExit;
         }
    	
    	
    	
    	return ret;
    }
}
