package ch12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MyMin {
    public int getBallot(String name) {
        File file = new File("count.txt");
        FileReader fileReader;
        int len = 0;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String str[] = new String[3];
            String size;
            int i = 0;
            while ((size = br.readLine()) != null) {
                str[i] = size.trim();
                if (str[i].startsWith(name)) {
                    int length = str[i].indexOf(":");
                    String sub = str[i].substring(length + 1, str[i].length());
                    length = Integer.parseInt(sub);
                    len += length;
                    continue;
                }
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return len;
    }
}
