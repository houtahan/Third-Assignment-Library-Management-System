import java.util.ArrayList;
import java.util.Scanner;

public class User {
    //User should have a list of books
    //User should have a username and a password
    //Book should contain name,author,year of publish and ISBN
    private String username;
    private String password;
    private ArrayList<Book> userBook = new ArrayList<Book>();
    Scanner sc = new Scanner(System.in);
    public User(){
        this.username = username;
        this.password = password;
        this.userBook = new ArrayList<Book>();
    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(String username) {
    }

    public String getUsername(){
        return username;
    }
    //
    public void setUsername(){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
    }
    public void rentBook(){
        Book book = null;
        userBook.add(book);
    }
    public void returnBook(){
        Book book = null;
        userBook.remove(book);
    }
}