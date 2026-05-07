import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {

        int port = 8080;

        System.out.println("Сервер запущен, ожидает подключения на порту " + port);

        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            System.out.println("Клиент подключился");

            String receivedText = in.readLine();

            System.out.println("Получен текст от клиента: " + receivedText);

        } catch (IOException e) {
            System.err.println("Ошибка на сервере: " + e.getMessage());
        }
    }
}
