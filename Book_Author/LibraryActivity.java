package Book_Author;


import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LibraryActivity {

    public static void main (String[] args){

        String output = "";
        Author tolkien = new Author(1892, "J.R.R. Tolkien");
        tolkien.setPassYear(1973);

        Book fotr =
                new Book("Fellowship of the ring", tolkien, "George Allen & Unwin");

        String pDate = "29/07/1954";
        Date publishedDate;
      

        output += "\n Book Name : " + fotr.getName();
        output += "\n Author Name : " + fotr.getAuthorName();
        output += "\n Published Date : " + fotr.getPublishedDate();
        

        JOptionPane.showMessageDialog(null,output);



    }
}
