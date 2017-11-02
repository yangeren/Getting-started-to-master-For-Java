package ch12;

import java.io.*;

public class Student {
    public static void main(String[] args) {
        String content[] = {"明日科技", "Java部", "快速入门"};
        File file = new File("work.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int k = 0; k < content.length; k++) {
                bufferedWriter.write(content[k]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            int i = 0;
            while ((s = bufferedReader.readLine()) != null) {
                i++;
                System.out.println("第" + i + "行： " + s);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
