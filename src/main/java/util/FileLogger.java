package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class FileLogger implements Logger{
    public void persist(String content) throws IOException{
        try {
            File file = new File("test.txt");

            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);

            fileWriter.close();
        } catch (IOException e) {
            throw e;
        }
    }
}
