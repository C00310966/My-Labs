package Q1;

public class CD extends LibraryItem implements LoanItem {
	private String band;
	private String title;
	private int numTracks;
	
	public CD(String ID, String band, String title, int numTracks) {
		
		super("CD", ID);
		this.band = band;
		this.title = title;
		this.numTracks = numTracks;
	}

	
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return numTracks * 0.2;
	}



	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumTracks() {
		return numTracks;
	}

	public void setNumTracks(int numTracks) {
		this.numTracks = numTracks;
	}

	@Override
	public String toString() {
		return "CD [band=" + band + ", title=" + title + ", numTracks=" + numTracks + "]";
	}
	
	
	

}
