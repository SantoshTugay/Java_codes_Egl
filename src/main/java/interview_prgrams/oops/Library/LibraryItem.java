package interview_prgrams.oops.Library;

import java.util.Calendar;
import java.util.Date;

abstract class LibraryItem {
    private String id;
    private String title;
    private boolean checkedOut;
    public Date dueDate;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.checkedOut = false;
        this.dueDate = null;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void checkOut(int days) {
        checkedOut = true;
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, days);
        dueDate = cal.getTime();
    }

    public void returnItem() {
        checkedOut = false;
        dueDate = null;
    }

    public boolean isOverdue() {
        if (!checkedOut || dueDate == null) return false;
        return new Date().after(dueDate);
    }

    public abstract String getType();
}

class Book extends LibraryItem {
    public Book(String id, String title) {
        super(id, title);
    }

    public String getType() {
        return "Book";
    }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String title) {
        super(id, title);
    }

    public String getType() {
        return "Magazine";
    }
}

class DVD extends LibraryItem {
    public DVD(String id, String title) {
        super(id, title);
    }

    public String getType() {
        return "DVD";
    }
}
