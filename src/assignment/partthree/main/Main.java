package assignment.partthree.main;

import assignment.partthree.classes.Librarian;
import assignment.partthree.interfaces.ManageBooks;
import assignment.partthree.interfaces.ManageTransactions;
import assignment.partthree.interfaces.NotificationService;
import assignment.partthree.interfaces.Work;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();

        transaction(librarian);
        books(librarian);
        notify(librarian);
        working(librarian);
    }

    public static void transaction(ManageTransactions transactions){
        transactions.transactionThroughCredit();
    }

    public static void books(ManageBooks books){
        books.addBook();
    }

    public static void notify(NotificationService service){
        service.emailNotification();
    }

    public static void working(Work work){
        work.issuePass();
    }
}
