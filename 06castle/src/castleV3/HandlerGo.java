package castleV3;

public class HandlerGo extends Handler  {
	   public HandlerGo(Game game ) {
			  super(game);
		   }

	@Override
	public void docmd(String word) {
		game.goRoom(word);
	}   
}
