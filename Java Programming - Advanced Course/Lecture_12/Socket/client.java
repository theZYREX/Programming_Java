import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;

public class client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 8080;

        try (Socket socket = new Socket(hostname, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String fullPath = "/Users/ilaovsannikov/прог-е/JavaProg/src/text.txt";
            String fileContent = Files.readString(Path.of(fullPath));

            String englishOnly = fileContent.replaceAll("[^a-zA-Z\\s]", "");

            out.println(englishOnly);

            System.out.println("Данные успешно отправлены.");

        } catch (IOException e) {
            System.err.println("Ошибка клиента: " + e.getMessage());
        }
    }
}
