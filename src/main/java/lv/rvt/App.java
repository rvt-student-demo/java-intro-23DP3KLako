package lv.rvt;

import java.util.*;


public class App 
{
    public static void main( String[] args ){
        Scanner scanner =  new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("To Kill a Mockingbird", 281, 1960);
        Book book2 = new Book("A Brief History of Time", 256, 1988);
        Book book3 = new Book("Beautiful Code", 593, 2007);
        Book book4 = new Book("The Name of the Wind", 662, 2007);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicyear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publicyear));

        }

        System.out.println();
        System.out.print("What information will be printed ? ");
        String informationType = scanner.nextLine();
        if (informationType.equals("everything")) {
            for (Book book: books){
                System.out.println(book);
            }
        }   else if (informationType.equals("name")) {
            for (Book book: books){
                System.out.println(book.getName());
            }
        }
    }
}






