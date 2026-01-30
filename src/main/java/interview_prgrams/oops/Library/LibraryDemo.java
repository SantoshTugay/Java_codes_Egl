package interview_prgrams.oops.Library;

import java.util.Calendar;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book("B001", "Java Programming"));
        library.addItem(new Magazine("M001", "Tech Monthly"));
        library.addItem(new DVD("D001", "Inception"));

        library.displayAvailableItems();

        library.checkOutItem("B001", 7);  // Checkout for 7 days
        library.checkOutItem("D001", 3);

        library.displayAvailableItems();

        // Simulate overdue by manually setting dueDate to past
        for (LibraryItem item : library.items) {
            if (item.getId().equals("B001")) {
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DAY_OF_MONTH, -10);
                item.checkOut(7);
                item.returnItem(); // To reset
                item.checkOut(7);
                item.dueDate = cal.getTime(); // Overdue
            }
        }

        library.displayOverdueItems();

        library.returnItem("B001");
        library.displayAvailableItems();
    }
}
