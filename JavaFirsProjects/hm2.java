package mainpackage;

import java.util.Scanner;

 class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book() {
    }

    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void inputBook(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void outputBook() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
        System.out.println("Издательство: " + publisher);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + pageCount);
    }
}
public class hm2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
		             
		                              /*Задание 5. Реализовать класс Книга*/
		 Book book1 = new Book();
	        book1.inputBook("Java: A Beginner's Guide", "Herbert Schildt", 2014, "McGraw-Hill Education", "Programming", 728);
	        book1.outputBook();

	        System.out.println();

	        Book book2 = new Book("Java Concurrency in Practice", "Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, Doug Lea", 2006, "Addison-Wesley Professional", "Software Development", 384);
	        book2.outputBook();

	}

}
