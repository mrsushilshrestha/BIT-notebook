//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileReadWriteExample {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "textFile.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter the text line( Enter to finish)");

            String line;

            while (!(line = reader.readLine).isEmpty) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Written has been successful");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
