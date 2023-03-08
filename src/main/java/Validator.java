import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static final String RED="\u001B[31m";
    public static final String RESET="\u001B[0m";
    private static Pattern ISBN_PATTERN = Pattern.compile("^\\d{10}$");
    private static Pattern AuthorTitle_Pattern=Pattern.compile("^[a-zA-Z ]+$");
    private static Pattern PublishYear_Pattern=Pattern.compile("^\\d{4}$");
    Scanner sc = new Scanner(System.in);

//    public String validateIsbn() {
//        String bookid;
//        while (true) {
//            System.out.println("Enter Book ID ");
//            bookid = sc.nextLine();
//            if (!ISBN_PATTERN.matcher(bookid).matches()) {
//                System.out.println(RED+"SORRY ! PLEASE ENTER VALID BOOK ID "+RESET);
//            } else {
//                break;
//            }
//        }
//        return bookid;
//    }
    public String validateIsbn(){
        String bookid;
        bookid = sc.nextLine();
        return bookid;
    }
    public String validateAuthorTitle(String input){
        String result;
        while (true){
            if(input=="Title"){
                System.out.println("Enter Title");
            }else{
                System.out.println("Enter Author");
            }
            result=sc.nextLine();
            if(!AuthorTitle_Pattern.matcher(result).matches()){
                System.out.println(RED+"Please Enter Valid "+input+RESET);
            }
            else{
                break;
            }

        }
        return result;
    }
    public String validatePublishYear(){
        String year;
        while(true){
            System.out.println("Enter Publish Year of Book ");
            year=sc.nextLine();
            if(!PublishYear_Pattern.matcher(year).matches()){
                System.out.println(RED+"Enter valid Publish Year"+RESET);
            }
            else{
                break;
            }
        }
        return year;
    }

}



