package Q1;

public class LibraryDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LibraryItem[] libItems = new LibraryItem[2];
		
		libItems[0] = new Book("LI01", "J.K.Rowling", "Harry Potter",457);
		libItems[1] = new CD("LI02", "Coldplay", "Music Of The Spheres",16);
		
		for (LibraryItem item : libItems) {//iterates through libItems
				System.out.println(item.toString());
				System.out.println("Price: " + ((LoanItem) item).calculatePrice());//item is cast as LoanItem to use each objects calculatePrice
				System.out.println();
			}
		
	}

}
