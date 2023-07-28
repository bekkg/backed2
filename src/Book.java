public class Book implements Printable{
    private  String name ;
    private  int year ;


    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    static   void printBook (Printable [] printables ){




//        Book[] book = (Book[]) printables;
//        for (int i = 0; i < book.length; i++) {
//            System.out.println(book[i].getYear());
//        }



        for ( Printable printable : printables){
            if ( printable instanceof  Book){
                System.out.println(((Book) printable).getName());
            }
        }

    }
    @Override
    public void print() {
        System.out.println(" Book is good .");

    }



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
