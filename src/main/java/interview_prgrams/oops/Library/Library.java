package interview_prgrams.oops.Library;

import java.util.ArrayList;
import java.util.List;

class Library {
    public List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        for (LibraryItem item : items) {
            if (!item.isCheckedOut()) {
                System.out.println(item.getType() + ": " + item.getTitle() + " (ID: " + item.getId() + ")");
            }
        }
    }

    public void displayOverdueItems() {
        System.out.println("Overdue Items:");
        for (LibraryItem item : items) {
            if (item.isOverdue()) {
                System.out.println(item.getType() + ": " + item.getTitle() + " (ID: " + item.getId() + ")");
            }
        }
    }

    public boolean checkOutItem(String id, int days) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id) && !item.isCheckedOut()) {
                item.checkOut(days);
                System.out.println("Checked out: " + item.getTitle());
                return true;
            }
        }
        System.out.println("Item not available for checkout.");
        return false;
    }

    public boolean returnItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id) && item.isCheckedOut()) {
                item.returnItem();
                System.out.println("Returned: " + item.getTitle());
                return true;
            }
        }
        System.out.println("Item not checked out.");
        return false;
    }
}
