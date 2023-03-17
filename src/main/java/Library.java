import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Librarian> librarians = new ArrayList<>();

    // These functions were split into user and librarian functions and are coded in the user and librarian class

    private HashMap<String, Integer> bookAmount = new HashMap<String, Integer>(){};

    public HashMap<String, Integer> getBooksNumbers() {
        return bookAmount;
    }

    public void setBooksNumbers(HashMap<String, Integer> booksNumbers) {
        this.bookAmount = bookAmount;
    }
    public void addBook(String name, String author, int yearOfPublish, String ISBN){
        Book newBook = new Book(name, author, yearOfPublish, ISBN);
        books.add(newBook);
        System.out.println("Book " + name + " was successfully added");
    }

    public void removeBook(String name, String author, int yearOfPublish, String ISBN){
        Book removeBook = new Book(name, author, yearOfPublish, ISBN);
        for (Book book : books){
            if (book.getName().equals(name) && book.getAuthor().equals(author) && book.getISBN().equals(ISBN)){
                books.remove(removeBook);
                System.out.println("Book " + name + " was successfully removed");
            }
            else{
                System.out.println("Book doesn't exist or is already removed!");
            }
        }
    }

    public Book searchBook(String name){
        for (Book book : books){
            if (book.getName().equals(name)){
                return book;
            }
            else{
                System.out.println("Book doesn't exist or is removed!");
            }
        }
        return null;
    }

    public void updateBook(){

    }

    public boolean doesBookExist(String name, String author, int yearOfPublish, String ISBN){
        Book searchBook = new Book(name, author, yearOfPublish, ISBN);
        for (Book DBE : books){
            if (DBE.getName().equals(searchBook.getName())){
                return true;
            }
        }
        return false;
    }

    public void increaseBook(Book increase_book, int amount){
        bookAmount.replace(increase_book.getName(), bookAmount.get(increase_book.getName()) + amount);
        System.out.println("Book amount increased successfully!");
    }

    public void decreaseBook(Book decrease_book, int amount){
        bookAmount.replace(decrease_book.getName(), bookAmount.get(decrease_book.getName()) - amount);
        System.out.println("Book amount decreased successfully!");
    }

    //user related functions

    public void addUser(String username, String password){
        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("User " + username + " was successfully added");
    }

    public void removeUser(String username, String password){
        User removeUser = new User(username, password);
        users.remove(removeUser);
        System.out.println("User " + username + " was successfully removed");
    }

    public User searchUser(String username){
        for (User user : users){
            if (user.getUsername().equals(username)){
                return user;
            }
            else{
                System.out.println("User doesn't exist or is removed!");
            }
        }
        return null;
    }

    public void updateUser(){
        //TODO
    }

    public boolean doesUserExist(String username){
        User searchUser = new User(username);
        for (User DUE : users){
            if (DUE.getUsername().equals(searchUser.getUsername())){
                return true;
            }
        }
        return false;
    }

    //librarian related functions

    public void addLibrarian(String username, String password){
        Librarian newLibrarian = new Librarian(username, password);
        librarians.add(newLibrarian);
        System.out.println("Librarian " + username + " was successfully added");
    }

    public void removeLibrarian(String username, String password){
        Librarian removeLibrarian = new Librarian(username, password);
        librarians.remove(removeLibrarian);
        System.out.println("Librarian " + username + " was successfully removed");
    }

    public Librarian searchLibrarian(String username){
        for (Librarian librarian : librarians){
            if (librarian.getUsername().equals(username)){
                return librarian;
            }
            else{
                System.out.println("Librarian doesn't exist or is removed!");
            }
        }
        return null;
    }

    public void updateLibrarian(){
        //TODO
    }

    public boolean doesLibrarianExist(String username){
        Librarian searchLibrarian = new Librarian(username);
        for (Librarian DLE : librarians){
            if (DLE.getUsername().equals(searchLibrarian.getUsername())){
                return true;
            }
        }
        return false;
    }


}
