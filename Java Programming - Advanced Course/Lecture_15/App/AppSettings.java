import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppSettings {

    private static AppSettings instance;

    public String fullpath = "...";

    private AppSettings() {
        loadSettings();
    }

    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    private String language;
    private String fileName;
    private boolean feature1Enabled;
    private boolean feature2Enabled;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean getFeature1Enabled() {
        return feature1Enabled;
    }

    public void setFeature1Enabled(boolean feature1Enabled) {
        this.feature1Enabled = feature1Enabled;
    }

    public boolean getFeature2Enabled() {
        return feature2Enabled;
    }

    public void setFeature2Enabled(boolean feature2Enabled) {
        this.feature2Enabled = feature2Enabled;
    }

    private void loadSettings() {
        System.out.println("Загрузка настроек...");

        this.language = "none";
        this.fileName = "none";
        this.feature1Enabled = true;
        this.feature2Enabled = false;

        try {

            List<String> lines = Files.readAllLines(Paths.get(fullpath));

            for (String line : lines) {

                String[] parts = line.split("=", 2);
                String key = parts[0].trim();
                String value = parts[1].trim();

                switch (key) {
                    case "language":
                        setLanguage(value);
                        break;
                    case "fileName":
                        setFileName(value);
                        break;
                    case "feature1Enabled":
                        setFeature1Enabled(Boolean.parseBoolean(value));
                        break;
                    case "feature2Enabled":
                        setFeature2Enabled(Boolean.parseBoolean(value));
                        break;
                    default:
                        System.out.println("Найден неизвестный ключ в настройках: " + key);
                        break;
                }
            }
            System.out.println("Настройки успешно загружены из файла.");

        } catch (IOException e) {
            System.err.println("Ошибка чтения файла настроек: " + e.getMessage());
            System.out.println("Используются настройки по умолчанию.");
        }
    }

    public void saveSettings() {

        Map<String, Object> settings = new HashMap<>(Map.of(
                "language", getLanguage(),
                "fileName", getFileName(),
                "feature1Enabled", getFeature1Enabled(),
                "feature2Enabled", getFeature2Enabled()
        ));
        try (PrintWriter writer = new PrintWriter(new FileWriter(fullpath))) {

            for (Map.Entry<String, Object> entry : settings.entrySet()) {
                writer.println(entry.getKey() + "=" + entry.getValue());
            }

            System.out.println("Данные успешно записаны в файл");

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        System.out.println("Сохранение настроек завершено");
    }

    @Override
    public String toString() {
        return "AppSettings{" +
                "language=" + language +
                ", fileName=" + fileName +
                ", feature1Enabled=" + feature1Enabled +
                ", feature2Enabled=" + feature2Enabled +
                '}';
    }
}
