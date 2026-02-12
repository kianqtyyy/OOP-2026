package activity1;
public class Book {

    String title;
    String author;
    String publicationDate;
    String isbn;

    public  Book (String Booktitle,
            String Bookauthor,
            String Bookisbn,
            String BookpublicationDate){
                
                title = Booktitle;
                author = Bookauthor;
                isbn = Bookisbn;
                publicationDate = BookpublicationDate;
            }
        
            public  Book(){}
            
        

            void printBookInfo() {
                System.out.printf("""
                    Title: %s
                    Author: %s
                    Isbn: %s
                    Publication Date: %s
                """, title, author, isbn, publicationDate);
    }
}