package Q1;

public  class LibraryItem {

	private String type;
	private String ID;
	
	public LibraryItem(String type, String ID) {
		
		this.type = type;
		this.ID = ID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "LibraryItem [type=" + type + ", ID=" + ID + "]";
	}

}
