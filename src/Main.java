public class Main {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter",1900);

        Book book1 = new  Book("jek",1987);
        book.print();
        book1.print();
        Book [] books = {book, book1};

        Book.printBook(books);


        System.out.println();
        Magazine magazine1 = new Magazine("azbuka",1955);
        Magazine magazine2 = new Magazine("azbuka2",1888);
        magazine1.print();
        magazine2.print();
        Magazine [] magazines = {magazine1, magazine2};

        Magazine.printMgazines(magazines);




    }
}