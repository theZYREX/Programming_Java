import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TwoStringOperator findLongest = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;

        try {
            String fullpath = "...";

            List<String> allLines = Files.readAllLines(Paths.get(fullpath));

            String longestLine = "";

            for(String currentLine : allLines){
                longestLine = findLongest.apply(longestLine, currentLine);
            }

            System.out.println("Самая длинная строка в файле:");
            System.out.println(longestLine);

        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
