import java.io.*;
import java.util.Scanner;


public class Main {
    /*
     * make a functional library app using oop
     * run the main program in Main.java and code the oop part in other classes
     * don't forget to add at least 1 librarian to the library to make it functionable.
     * *  *** don't limit yourself to our template ***
     */
    public static void main(String[] args) {
        Menu.runMenu();
    }
    static Library library = new Library();


    public static class Menu {
        private static Library library;
        private static User user;
        private Librarian librarian;
        private Scanner scanner;
        private int choice;

        public static void runMenu() {
            library.addLibrarian("Houtan Tahanha", "tahanha03");
            System.out.println("Welcome to the library!" + "\nPlease select an option: ");
            System.out.println("1. Login as user");
            System.out.println("2. Login as librarian");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    loginAsUser();
                    break;
                case 2:
                    loginAsLibrarian();
                    break;
                default:
                    System.out.println("This option is not available!");
                    break;
            }
        }


        private static void loginAsUser() {
            System.out.println("please enter your username : ");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            System.out.println("please enter your password : ");
            String password = sc.nextLine();
            if (!library.doesUserExist(username)){
                library.addUser(username, password);
                userMenu();
            }
            else{
                System.out.println("");
            }
        }

        private static void userMenu() {
            String name;
            String author;
            int yearOfPublish;
            String ISBN;
            System.out.println("You have logged in as a user!");
            System.out.println("Please select an option");
            System.out.println("1. Borrow books");
            System.out.println("2. Return books");
            System.out.println("3. Logout");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    if (!library.doesBookExist(name, author, yearOfPublish, ISBN)){
                        System.out.println("Book doesn't exist and can not be borrowed");
                    }
                    else{
                        library.removeBook(name, author, yearOfPublish, ISBN);
                    }
                    break;
                case 2:
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    if (!library.doesBookExist(name, author, yearOfPublish, ISBN)){
                        library.addBook(name, author, yearOfPublish, ISBN);
                    }
                    else{
                        library.increaseBook(library.searchBook(name), 1);
                    }
                    break;
                case 3:
                    runMenu();
                    break;
                default:
                    System.out.println("This option is not available!");
                    break;
            }
        }

        private static void loginAsLibrarian() {
            System.out.println("please enter your username : ");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            System.out.println("please enter your password : ");
            String password = sc.nextLine();
            if (!library.doesLibrarianExist(username)) {
                library.addLibrarian(username, password);
                librarianMenu();
            }
        }

        private static void librarianMenu() {
            Scanner sc = new Scanner(System.in);
            String name;
            String author;
            int yearOfPublish;
            String ISBN;
            int amount;
            String userUsernameAddLibrarian;
            String userPasswordAddLibrarian;
            String userUsernameRemoveLibrarian;
            String userPasswordRemoveLibrarian;
            String usernameSearch;
            String librarianUsernameAddLibrarian;
            String librarianPasswordAddLibrarian;
            String librarianUsernameRemoveLibrarian;
            String librarianPasswordRemoveLibrarian;
            System.out.println("You have logged in as a librarian!");
            System.out.println("Please select an option");
            System.out.println("1. Add books");
            System.out.println("2. Delete books");
            System.out.println("3. Search books");
            System.out.println("4. Book existence status");
            System.out.println("5. Increase a book's availability");
            System.out.println("6. Decrease a book's availability");
            System.out.println("7. Add a user");
            System.out.println("8. Remove a user");
            System.out.println("9. Search a user");
            System.out.println("10. User existence status");
            System.out.println("11. Add a librarian");
            System.out.println("12. Remove a librarian");
            System.out.println("13. Search a librarian");
            System.out.println("14. Librarian existence status");
            System.out.println("15. Logout");
            Scanner sc2 = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter name, author, publish year and ISBN of the book ");
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    if (library.doesBookExist(name, author, yearOfPublish, ISBN) == true){
                        library.increaseBook(library.searchBook(name), 1);
                    }
                    else{
                        library.addBook(name, author, yearOfPublish, ISBN);
                    }
                    break;
                case 2:
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    if (library.doesBookExist(name, author, yearOfPublish, ISBN) == true){
                        library.decreaseBook(library.searchBook(name), 1);
                        System.out.println("DONE");
                    }
                    else{
                        System.out.println("This book doesnt so it cant be deleted!");
                    }
                    break;
                case 3:
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    if (library.doesBookExist(name, author, yearOfPublish, ISBN)){
                        System.out.println(library.searchBook(name));
                    }
                    else{
                        System.out.println("That book does not exist!");
                    }
                    break;
                case 4:
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    library.doesBookExist(name, author, yearOfPublish, ISBN);
                    break;
                case 5:
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    amount = sc.nextInt();
                    if (library.doesBookExist(name, author, yearOfPublish, ISBN)){
                        library.increaseBook(library.searchBook(name), amount);
                    }
                    break;
                case 6:
                    name = sc.nextLine();
                    author = sc.nextLine();
                    yearOfPublish = sc.nextInt();
                    ISBN = sc.nextLine();
                    amount = sc.nextInt();
                    if (library.doesBookExist(name, author, yearOfPublish, ISBN)){
                        library.decreaseBook(library.searchBook(name), amount);
                    }
                case 7:
                    userUsernameAddLibrarian = sc.nextLine();
                    userPasswordAddLibrarian = sc.nextLine();
                    if (library.doesUserExist(userUsernameAddLibrarian)){
                        System.out.println("User already exists");
                    }
                    else{
                        library.addUser(userUsernameAddLibrarian, userPasswordAddLibrarian);
                        System.out.println("User added successfully");
                    }
                case 8:
                    userUsernameRemoveLibrarian = sc.nextLine();
                    userPasswordRemoveLibrarian = sc.nextLine();
                    if (library.doesUserExist(userUsernameRemoveLibrarian)){
                        library.removeUser(userUsernameRemoveLibrarian, userPasswordRemoveLibrarian);
                    }
                    else{
                        System.out.println("Username doesn't exist!");
                    }
                case 9:
                    usernameSearch = sc.nextLine();
                    if(library.doesUserExist(usernameSearch)){
                        System.out.println(library.searchUser(usernameSearch));
                    }
                    else{
                        System.out.println("Username doesnt exist!");
                    }
                case 10:
                    usernameSearch = sc.nextLine();
                    library.doesUserExist(usernameSearch);
                case 11:
                    librarianUsernameAddLibrarian = sc.nextLine();
                    librarianPasswordAddLibrarian = sc.nextLine();
                    if (library.doesLibrarianExist(librarianUsernameAddLibrarian)){
                        System.out.println("User already exists");
                    }
                    else{
                        library.addLibrarian(librarianUsernameAddLibrarian, librarianPasswordAddLibrarian);
                        System.out.println("User added successfully");
                    }
                case 12:
                    librarianUsernameRemoveLibrarian = sc.nextLine();
                    librarianPasswordRemoveLibrarian = sc.nextLine();
                    if (library.doesUserExist(librarianUsernameRemoveLibrarian)){
                        library.removeUser(librarianUsernameRemoveLibrarian, librarianPasswordRemoveLibrarian);
                    }
                    else{
                        System.out.println("Username doesn't exist!");
                    }
                case 13:
                    usernameSearch = sc.nextLine();
                    if(library.doesLibrarianExist(usernameSearch)){
                        System.out.println(library.searchLibrarian(usernameSearch));
                    }
                    else{
                        System.out.println("Username doesnt exist!");
                    }
                case 14:
                    usernameSearch = sc.nextLine();
                    library.doesLibrarianExist(usernameSearch);
                case 15:
                    Menu.runMenu();
                default:
                    System.out.println("This option is not available!");
                    break;
            }
        }


    }
}
