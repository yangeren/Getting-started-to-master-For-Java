package ch7;

import java.util.Random;

import static org.testng.Assert.*;

public class BookTest {
    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {
    }

    @org.testng.annotations.Test
    public void testGetTitle() throws Exception {
//        Book book = new Book("<<JAVA从入门到精通>>", "明日科技", 59.8);
//        System.out.println("书名：" + book.getTitle());
//        System.out.println("作者：" + book.getAuthor());
//        System.out.println("价格：" + book.getPrice());
//        assertEquals(book.getAuthor(), "明日科技");
    }

    @org.testng.annotations.Test
    public void testGetAuthor() throws Exception {
    }

    @org.testng.annotations.Test
    public void testGetPrice() throws Exception {
    }

    @org.testng.annotations.Test
    public void testMain() throws Exception {
    }

    @org.testng.annotations.Test
    public void testGetCounter() throws Exception {
        String[] titles = {"<<java从入门到精通>>", "<<java编程词典>>", "<<视频学java>>"};
        for (int i = 0; i < 5; i++) {
            new Book(titles[new Random().nextInt(3)]);
        }
        System.out.println("总计销售了" + Book.getCounter() + "本图书！");
    }

}