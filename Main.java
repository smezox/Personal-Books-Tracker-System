import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookTracker tracker = new BookTracker();
        int choice;

        do {
            System.out.println("\n==== BOOK TRACKER ====");
            System.out.println("1 Add Books");
            System.out.println("2 Library");
            System.out.println("3 Start Reading");
            System.out.println("4 Finish Reading");
            System.out.println("5 Add Review");
            System.out.println("6 Exit");

            System.out.print("Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    String again;

                    do {

                        System.out.print("Title: ");
                        String t = sc.nextLine();

                        System.out.print("Author: ");
                        String a = sc.nextLine();

                        System.out.print("Category: ");
                        String c = sc.nextLine();

                        System.out.print("Rating: ");
                        double r = sc.nextDouble();
                        sc.nextLine();

                        tracker.addBook(new Book(t, a, c, r));

                        System.out.print("Add another? yes/no: ");
                        again = sc.nextLine();

                    } while (again.equalsIgnoreCase("yes"));

                    break;

                case 2:
                    tracker.showLibrary();
                    break;

                case 3:

                    System.out.print("Title: ");
                    String t1 = sc.nextLine();

                    System.out.print("Start date: ");
                    String d1 = sc.nextLine();

                    tracker.startReading(t1, d1);
                    break;

                case 4:

                    System.out.print("Title: ");
                    String t2 = sc.nextLine();

                    System.out.print("Finish date: ");
                    String d2 = sc.nextLine();

                    tracker.finishReading(t2, d2);
                    break;

                case 5:

                    System.out.print("Title: ");
                    String t3 = sc.nextLine();

                    System.out.print("Review: ");
                    String rev = sc.nextLine();

                    tracker.addReviews(t3, rev);
                    break;

            }

        } while (choice != 6);
        sc.close();
    }
}
