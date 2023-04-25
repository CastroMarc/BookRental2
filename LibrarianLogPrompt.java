import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.util.ArrayList;

public class LibrarianLogPrompt {

	public JFrame LibPrompt;
	private JTextField BookNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
		
				
				try {
					LibrarianLogPrompt window = new LibrarianLogPrompt();
					window.LibPrompt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLogPrompt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		LibPrompt = new JFrame();
		LibPrompt.setBounds(100, 100, 576, 341);
		LibPrompt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibPrompt.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK LIST");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblNewLabel.setBounds(203, 25, 139, 39);
		LibPrompt.getContentPane().add(lblNewLabel);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblAuthor.setBounds(65, 84, 61, 16);
		LibPrompt.getContentPane().add(lblAuthor);
		
		JLabel lblTitle = new JLabel("BOOK TITLE");
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTitle.setBounds(247, 84, 86, 16);
		LibPrompt.getContentPane().add(lblTitle);
		
		JLabel lblCopies = new JLabel("No. of Copies");
		lblCopies.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblCopies.setBounds(455, 84, 100, 16);
		LibPrompt.getContentPane().add(lblCopies);
		
		//Book 1
		JLabel lblBook1 = new JLabel("George Orwell");
		lblBook1.setBounds(65, 112, 94, 16);
		LibPrompt.getContentPane().add(lblBook1);
		
		JLabel lblBook1Title = new JLabel("1984");
		lblBook1Title.setBounds(247, 112, 94, 16);
		LibPrompt.getContentPane().add(lblBook1Title);
		
		JLabel lblBook1Copies = new JLabel("3");
		lblBook1Copies.setBounds(461, 112, 94, 16);
		LibPrompt.getContentPane().add(lblBook1Copies);
		
		
		//Book 2
		JLabel lblBook2 = new JLabel("J.R.R Tolkien");
		lblBook2.setBounds(65, 140, 94, 16);
		LibPrompt.getContentPane().add(lblBook2);
		
		JLabel lblBook2Title = new JLabel("The Lord of the Rings");
		lblBook2Title.setBounds(247, 140, 139, 16);
		LibPrompt.getContentPane().add(lblBook2Title);
		
		JLabel lblBook2Copies = new JLabel("7");
		lblBook2Copies.setBounds(461, 140, 94, 16);
		LibPrompt.getContentPane().add(lblBook2Copies);
		
		
		//Book 3
		JLabel lblBook3 = new JLabel("Khaled Hosseini");
		lblBook3.setBounds(65, 168, 108, 16);
		LibPrompt.getContentPane().add(lblBook3);
		
		JLabel lblBook3Title = new JLabel("The Kite Runner");
		lblBook3Title.setBounds(247, 168, 139, 16);
		LibPrompt.getContentPane().add(lblBook3Title);
		
		JLabel lblBook3Copies = new JLabel("4");
		lblBook3Copies.setBounds(461, 168, 94, 16);
		LibPrompt.getContentPane().add(lblBook3Copies);
		
		
		//Book 4
		JLabel lblBook4 = new JLabel("Harper Lee");
		lblBook4.setBounds(65, 196, 94, 16);
		LibPrompt.getContentPane().add(lblBook4);
		
		JLabel lblBook4Title = new JLabel("To Kill a Mockingbird");
		lblBook4Title.setBounds(247, 196, 139, 16);
		LibPrompt.getContentPane().add(lblBook4Title);
		
		
		JLabel lblBook4Copies = new JLabel("1");
		lblBook4Copies.setBounds(461, 196, 94, 16);
		LibPrompt.getContentPane().add(lblBook4Copies);
		
		//Enter book number
		
		JLabel lblEnterBook = new JLabel("ENTER BOOK NUMBER TO BORROW");
		lblEnterBook.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblEnterBook.setBounds(185, 234, 167, 16);
		LibPrompt.getContentPane().add(lblEnterBook);
		
		BookNum = new JTextField();
		BookNum.setBounds(203, 250, 130, 26);
		LibPrompt.getContentPane().add(BookNum);
		BookNum.setColumns(10);
		
		JButton btnBorrow = new JButton("Borrow");
		btnBorrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			ArrayList<BookList> books = new ArrayList<>();
			    
				BookList bookNum1 = new BookList("1984", "George Orwell", 3 );
				
				BookList bookNum2 = new BookList("The Lord of the rings", "J.R.R Tolkien", 7 );
				
				BookList bookNum3 = new BookList("The Kite Runner", "Khaled Hosseini", 4);
				
				BookList bookNum4 = new BookList("To Kill a Mockingbird", "Harper Lee", 1);
				
				books.add(bookNum1);
				books.add(bookNum2);
				books.add(bookNum3);
				books.add(bookNum4);
				
				for (int x = 1; x < books.size(); x++) {
					
					
				}
				boolean end = false;
				
				while (end==false) 
					
		try {
				Serializable book = BookNum.getText();
				
				BookList booknum = books.get((int) book);
				int copy = ((BookList) book).get_copy();
				
	
				if (copy > 1)
				{
					((BookList) book).set_copy(copy-=1);
				}
				else {
					JOptionPane.showMessageDialog(null,"No more copies");
				}
						
			} 
			catch (IndexOutOfBoundsException ex) {
				JOptionPane.showMessageDialog(null,"INVALID CHOICE");
		}
			
			}
			
		});
		btnBorrow.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnBorrow.setBounds(226, 281, 86, 26);
		LibPrompt.getContentPane().add(btnBorrow);
		
		//Book numbers
		JLabel lbl1 = new JLabel("1");
		lbl1.setBounds(33, 112, 20, 16);
		LibPrompt.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("2");
		lbl2.setBounds(33, 140, 20, 16);
		LibPrompt.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("3");
		lbl3.setBounds(33, 168, 20, 16);
		LibPrompt.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("4");
		lbl4.setBounds(33, 196, 20, 16);
		LibPrompt.getContentPane().add(lbl4);
		
		JButton btnBorrow1 = new JButton("Borrow");
		btnBorrow1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnBorrow1.setBounds(226, 281, 86, 26);
		LibPrompt.getContentPane().add(btnBorrow1);
		
	
		
		
	}
}
