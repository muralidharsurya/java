package QspModule2;

public class Book {      // conctructor overloading
    String name,author;
    double price;
    int pages;

    Book( String name, String author) {
        this.name = name;
        this.author = author;

    }
    Book(String name, String author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    Book(String name, String author,double price,int pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }
    void display ( ){
        System.out.println(this.name+" "+this.author);
    }
    void display1 ( ){
        System.out.println(this.name+" "+ this.author+" "+this.price);
    }
        void display2(){
            System.out.println(this.name+" "+this.price+" "+this.author+" "+this.pages);

        }

    public static void main(String[] args) {

        Book b=new Book("Vivekanada","Ramchandra");
        Book b1=new Book("Vivekanada","Ramchandra",250.00);
        Book b2=new Book("Vivekanada","Ramchandra",250.00,500);
        b.display ();
        b1.display1();
        b2.display2();

    }
    }

