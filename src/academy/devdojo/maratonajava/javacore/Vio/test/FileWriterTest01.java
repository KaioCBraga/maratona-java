package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FIleWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("O java é complicadooooooo");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
