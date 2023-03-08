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
        User user;
        Scanner sc = new Scanner(System.in);
        Menu.runMenu();
    }



    public static class Menu {
        private Library library;
        private static User user;
        private Librarian librarian;
        private Scanner scanner;
        private int choice;

        public static void runMenu() {
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
//            if (!user.checkUserCredentials(username, password)) {
//
//                user.writeUserToFile(username, password);
//            } else {
//                userMenu();
//            }
            userMenu();
        }

        private static void userMenu() {
            userFunctions service = new User();
            System.out.println("You have logged in as a user!");
            System.out.println("Please select an option");
            System.out.println("1. Borrow books");
            System.out.println("2. Return books");
            System.out.println("3. Logout");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ((User) service).rentBook();
                    break;
                case 2:
                    ((User) service).returnBook();
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
//            if (!user.checkUserCredentials(username, password)) {
//
//                user.writeUserToFile(username, password);
//            } else {
//                librarianMenu();
//            }
            librarianMenu();
        }

        private static void librarianMenu() {
            librarianFunctions service = new Librarian();
            System.out.println("You have logged in as a librarian!");
            System.out.println("Please select an option");
            System.out.println("1. Add books");
            System.out.println("2. Delete books");
            System.out.println("3. Show all books");
            System.out.println("4. Show all available books");
            System.out.println("5. Logout");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ((Librarian) service).addBook();
                    break;
                case 2:
                    ((Librarian) service).deleteBooks();
                    break;
                case 3:
                    ((Librarian) service).showAllBooks();
                    break;
                case 4:
                    ((Librarian) service).showAllAvailableBooks();
                    break;
                case 5:
                    runMenu();
                    break;
                default:
                    System.out.println("This option is not available!");
                    break;
            }
        }


    }
}
