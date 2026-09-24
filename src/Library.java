import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " | added to " + libraryName);
    }

    public ArrayList<Book> findAvailableBooks(){
        ArrayList<Book> availableBooks = new ArrayList<>();
        for(Book book : books){
            if(book != null){
                if(book.getAvailableStatus()){
                    availableBooks.add(book);
                }
            }
        }
        return availableBooks;
    }

    public Book findBookByTitle(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void printAllBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }


}
