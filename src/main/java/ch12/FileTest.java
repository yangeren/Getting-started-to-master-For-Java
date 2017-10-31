package ch12;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();
            System.out.println("文件名称： " + name);
            System.out.println("文件长度是： " + length);
            System.out.println("文件是否为隐藏： " + hidden);
            file.delete();
            System.out.println("文件已经删除！");
        } else {
            try {
                file.createNewFile();
                System.out.println("文件已经创建");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
