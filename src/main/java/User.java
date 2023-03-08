import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class User extends userFunctions {
    //User should have a list of books
    //User should have a username and a password
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
    public void rentBook(){
        String bookid= validator.validateIsbn();
        boolean flag=false;
        for(Book book:books){
            if(book.getISBN().equals(bookid) && book.getStatus().equals("Available")){
                flag=true;
                System.out.println(GREEN+"Book Borrowed Successfully !!!"+RESET);
                book.setStatus("Not Available");
                System.out.println("Borrowed Book Details: "+book);
            }
        }
        if(flag==false)
            System.out.println(RED+"This book is not available to borrow"+RESET);


    }

    public void returnBook(){
        boolean flag=false;
        String bookid= validator.validateIsbn();
        for(Book book:books){
            if(book.getISBN().equals(bookid) && book.getStatus().equals("Not Available")){
                flag=true;
                System.out.println(GREEN+"Book Returned Successfully !!!"+RESET);
                book.setStatus("Available");
                System.out.println("Returned Book Details: "+book);
            }

        }
        if(flag==false)
            System.out.println(RED+"We can not return this book"+RESET);

    }


    public void writeUserToFile(String username, String password) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true));
            writer.write(username + "," + password);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkUserCredentials(String username, String password) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] credentials = line.split(",");
                if (credentials[0].equals(username) && credentials[1].equals(password)) {
                    reader.close();
                    return true;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
