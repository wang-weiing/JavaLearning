package castleV3;

public class HandlerHelp extends Handler {
	
	   public HandlerHelp(Game game ) {
			  super(game);
		   }
	   
	@Override
	public void docmd(String word) {
			System.out.println("迷路了吗？ 你可以做的命令有 ：go  bye help");
			System.out.println("如 \t go east");
	}
}
