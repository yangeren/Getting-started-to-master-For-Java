package ch12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_01 {
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("work.txt");
            DataOutputStream ds = new DataOutputStream(fs);
            ds.writeUTF("使用writeUTF()方法写入数据；");
            ds.writeChars("使用writeChars()方法写入数据；");
            ds.writeBytes("使用writeBytes()方法写入数据");
            ds.close();
            FileInputStream fis = new FileInputStream("work.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
