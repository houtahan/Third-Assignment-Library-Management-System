import java.util.ArrayList;
import java.util.List;
public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */
    private List<Book>  bookCollection;
    private List<User>  userCollection;
    private List<Librarian> librarianCollection;
    public Library(){
        List<Book> bookCollection = new ArrayList<Book>();
        List<User> userCollection = new ArrayList<User>();
        List<Librarian> librarianCollection = new ArrayList<Librarian>();
    }

    // These functions were split into user and librarian functions and are coded in the user and librarian class


    public void addBook(Book book){
        bookCollection.add(book);
    }

    public void removeBook(Book book){
        bookCollection.remove(book);
    }

    public void searchBook(){
        //TODO
    }

    public void updateBook(){
        //TODO
    }

    public void doesBookExist(){
        //TODO
    }

    public void increaseBook(){
        //TODO
    }

    public void decreaseBook(){
        //TODO
    }

    //user related functions

    public void addUser(User user){
        userCollection.add(user);
    }

    public void removeUser(User user){
        userCollection.remove(user);
    }

    public void searchUser(){
        //TODO
    }

    public void updateUser(){
        //TODO
    }

    public void doesUserExist(){
        //TODO
    }

    //librarian related functions

    public void addLibrarian(Librarian librarian){
        librarianCollection.add(librarian);
    }

    public void removeLibrarian(Librarian librarian){
        librarianCollection.remove(librarian);
    }

    public void searchLibrarian(){
        //TODO
    }

    public void updateLibrarian(){
        //TODO
    }

    public void doesLibrarianExist(){
        //TODO
    }


}
