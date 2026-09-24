public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available){
        if(title.isEmpty()){
            this.title = "Title Error";
        }
        else{
            this.title = title;
        }
        if(author.isEmpty()){
            this.author = "Author Error";
        }
        else{
            this.author = author;
        }
        this.available = available;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getAvailableStatus(){
        return available;
    }

    public void borrow(){
        available = false;
    }
    public void returnBook(){
        available = true;
    }

    public String toString(){
        return "Title: " + title + " | Author: " + author + " | Is available: " + available;
    }



}
