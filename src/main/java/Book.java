public class Book {
    //Book should contain name,author,year of publish and ISBN
    private String name;
    private String author;
    private int yearOfPublish;
    private String ISBN;

    public Book(String name, String author, int yearOfPublish, String ISBN){
        this.name = name;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearOfPublish(){
        return yearOfPublish;
    }
    public String getISBN(){
        return ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return "\nName: " + name + "\nAuthor: " + author + "\nYear Of Publish: " + yearOfPublish + "\nISBN: " + ISBN + "\n";
    }

}
