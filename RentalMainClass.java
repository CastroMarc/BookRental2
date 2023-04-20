package book;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class RentalMainClass {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
	    
		Book bookNum1 = new Book("System Analysis and Design", "Gary B. Shelly", 2 );
		
		Book bookNum2 = new Book("Android Application", "Corrine Hoisington", 3 );
		
		Book bookNum3 = new Book("Programming Concepts and Logic Formulation", "Rosauro E. Manuel", 4);
		

		books.add(bookNum2);
		books.add(bookNum3);
		
		
		System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
		System.out.println("*****************************");
		
		for (int x = 0; x < books.size(); x++) {
			System.out.print(x);
			System.out.println(" " + books.get(x).get_name() + ", " + books.get(x).get_author() + ", " + books.get(x).get_copy());
			System.out.println();
		}
		boolean end = false;
		
		while (end==false) 
		{
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("CHOOSE A NUMBER TO RENT A BOOK: ");
				int choice = scan.nextInt();
				
				Book book = books.get(choice);
				int copy = book.get_copy();
				if (copy > 0) {
				System.out.println("YOU RENTED: " + books.get(choice).get_name());
				book.set_copy(copy-=1);
				}
				else {
				System.out.println("NO COPIES LEFT");
				}
				
				System.out.println("RENT AGAIN? [Y/N]");
				String rentAgain = scan.next();
				if (rentAgain.equalsIgnoreCase("n")) {
					end = true;
				}
					
			} catch (IndexOutOfBoundsException e) {
				System.out.println("INVALID CHOICE");
			}
			catch (InputMismatchException e) {
				System.out.println("INVALID INPUT");
			}
			System.out.println("PROGRAM END");
		}
	}

}
