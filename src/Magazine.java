

public class Magazine implements Printable{
    private  String name ;

    private  int year ;




    public Magazine(String name, int year) {
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





    static     void printMgazines (Printable [] printables){




//        Magazine [] magazine = (Magazine[]) printables;
//
//        for (int i = 0; i < magazine.length; i++) {
//            System.out.println(magazine[i].getName());
//            }


        


        for ( Printable printable : printables) {
            if (printable instanceof  Magazine){
                System.out.println(((Magazine) printable).getName());
            }
        }


        }


    @Override
    public void print() {
        System.out.println( " Magazine is fine .");


    }


    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
