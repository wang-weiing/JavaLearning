package dome;

public class CD  extends Item {


	private String artist;
	private int numofTracks;
	private int playTime;
	private boolean gotIt= false;
	private String comment;
	
	public CD(String title, String artist, int numofTracks, int playTime, String comment) {
		super(title,playTime ,false,comment);
		this.artist = artist;
		this.numofTracks = numofTracks;

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public void print() {
    System.out.println("CD:"+"title+"+"artist");
	}

}
