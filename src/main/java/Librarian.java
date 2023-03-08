import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Librarian extends librarianFunctions {
    /*
    * The librarian should have a username and a password
    * The librarian should be able to search users, librarians and books
    * The librarian should be able to add\remove\\update user add\remove\\update_
    _ librarian and add\remove\\update book
     */
    private String username;
    private String password;
    public static final String RED="\u001B[31m";
    public static final String RESET="\u001B[0m";
    public static final String BLUE="\u001B[34m";
    public static final String GREEN="\u001B[32m";
    public static final String CYAN="\u001B[36m";
    public static final String BLACK="\u001B[30m";
    Scanner sc=new Scanner(System.in);
    Validator validator=new Validator();
    List<Book> books=new ArrayList<>();

    public void addBook() {

        String ISBN= validator.validateIsbn();
        String Author=validator.validateAuthorTitle("Author");
        String Title=validator.validateAuthorTitle("Title");
        String year=validator.validatePublishYear();
        Book book=new Book(ISBN,Author,Title,year,"Available");
        books.add(book);
        System.out.println(GREEN+"Book Added Successfully !!!"+RESET);

    }

    public void deleteBooks(){

    }

    public void showAllBooks(){
        boolean flag=false;
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.format(CYAN+"%s%15s%15s%15s%15s","ID","TITLE","AUTHOR","PUBLISH YEAR","STATUS"+RESET);
        System.out.println("\n----------------------------------------------------------------------------------------------");

        for (Book book:books){
            System.out.format("%s%15s%15s%15s%15s",book.getISBN(),book.getName(),book.getAuthor(),book.getYearOfPublish(),book.getStatus());
            System.out.println();
            flag=true;
        }
        System.out.println("\n----------------------------------------------------------------------------------------------");
        if(flag==false)
            System.out.println(RED+"There are no Books in Library"+RESET);
    }

    public void showAllAvailableBooks(){
        boolean flag=false;
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.format(CYAN+"%s%15s%15s%15s%15s","ID","TITLE","AUTHOR","PUBLISH YEAR","STATUS"+RESET);
        System.out.println("\n----------------------------------------------------------------------------------------------");

        if(books.size()>0){
            for (Book book:books){
                if(book.getStatus()=="Available"){
                    System.out.format("%s%15s%15s%15s%15s",book.getISBN(),book.getName(),book.getAuthor(),book.getYearOfPublish(),book.getStatus());
                    System.out.println();
                    flag=true;
                }
            }
        }
        else{
            System.out.println(RED+"No Books Available in the library"+RESET);
        }
        System.out.println("\n----------------------------------------------------------------------------------------------");
        if(flag==false)
            System.out.println(RED+"There are no books with status Available"+RESET);
    }
}
