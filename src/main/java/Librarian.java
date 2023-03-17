import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Librarian {
    /*
        * The librarian should have a username and a password
        * The librarian should be able to search users, librarians and books
        * The librarian should be able to add\removeupdate user add\removeupdate_
        _ librarian and add\removeupdate book
         */
    private String username;
    private String password;
    public Librarian (String username, String password){
        this.username = username;
        this.password = password;
    }
    public Librarian(String username){

    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(){
        this.username = username;
    }
    public void setPassword(){
        this.password = password;
    }
}