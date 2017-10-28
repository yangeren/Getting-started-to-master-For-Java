package ch7;

public class Book {
    //统计图书销量
    private static int counter = 0;
    public Book(String title) {
        System.out.println("售出图书：" + title);
        counter++;
    }

    public static int getCounter(){
        return counter;
    }
}
//public class Book {
//    private String title;
//    private String author;
//    private double price;
//
//    public Book(String title, String author, double price) {
//        this.title = title;
//        this.author = author;
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public static void main(String[] args){
//        Book book = new Book("the sea", "wanghan", 33.00);
//        System.out.println(book.author);
//
//    }
//}
//public class Book {
//
//    private int id;
//    private String name;
//    private String category;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        int id=0;
//        setName("Java");
//        return id+this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public Book getBook() {
//        return this;
//    }
//
//    public void doString(String name) {
//        int id=0;
//        for (int i = 0; i< 10; i++) {
//            System.out.println(name + String.valueOf(i));
//        }
//    }
//}
