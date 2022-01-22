package Book_Author;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

    private String name;
    private Author author;
    private Date publishedDate ;
    private String publisher;

    public Book(String n, Author a) {
        this.name = n;
        this.author = a;
    }

    public Book(String n, Author a, String p) {
        this.name = n;
        this.author = a;
        this.publisher = p;
    }

    public void setPublisher(String p) {
        this.publisher = p;
    }

    public void setPublishedDate(Date d) {
        this.publishedDate = d;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName (){
        return this.author.getName();
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(publishedDate);
    }
}

