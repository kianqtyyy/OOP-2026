package activity1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("M. C. Higgins, the Great", "Virginia Hamilton", "0027424804", "1974");
        Book book2 = new Book("Joy of Cooking", "Irma S. Rombauer", "0-02-604570-2", "1931");

        Book book3 = new Book("A Clockwork Orange", "Anthony Burgess", "978-0-434-09800-2", "March 17, 1962");
        Book book4 = new Book("Jurassic Park", "Michael Crichton", "9780345538987", "September 25, 2012");
   
        book1.printBookInfo();
        book2.printBookInfo();
        book3.printBookInfo();
        book4.printBookInfo();
    }
}
