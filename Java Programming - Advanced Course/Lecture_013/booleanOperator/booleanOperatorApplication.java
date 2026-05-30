import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class booleanOperatorApplication {
    public static void main(String[] args) {

        booleanOperator divisibleby13 = (number) -> number % 13 == 0 ? true : false;

        try {

            List<Integer> outputNumbers = new ArrayList<Integer>();

            String Fullpath = ...";

            String PathOut = "...";

            List<String> lines = Files.readAllLines(Paths.get(Fullpath));

            for (String line : lines) {

                int number = Integer.parseInt(line.trim());

                if(divisibleby13.check(number) == false) {
                    outputNumbers.add(number);
                }
            }

            try(BufferedWriter writer = new BufferedWriter(new FileWriter(PathOut))){
                for (Integer number : outputNumbers) {
                    writer.write(String.valueOf(number));
                    writer.newLine();
                }
            }

            System.out.println("Числа записаны в файл");

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
