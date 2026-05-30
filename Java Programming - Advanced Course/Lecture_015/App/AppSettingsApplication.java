public class AppSettingsApplication {
    public static void main(String[] args) {

        AppSettings settings1 = AppSettings.getInstance();

        System.out.println("Исходые настройки: " + settings1);

        System.out.println("Текущий язык из экземпляра 1: " + settings1.getLanguage());

        settings1.setLanguage("ru");

        System.out.println("Язык изменен на 'ru' через settings1.");

        System.out.println("Текущий язык: " + settings1.getLanguage());

        AppSettings settings2 = AppSettings.getInstance();

        System.out.println("Получен второй экземпляр.");

        if (settings1 == settings2) {
            System.out.println("settings1 и settings2 указывают на один объект ✅");
        } else {
            System.out.println("Ошибка: settings1 и settings2 - разные объекты!");
        }

        System.out.println("Язык, полученный через settings2: " + settings2.getLanguage());


        settings2.setFeature2Enabled(true);

        System.out.println("Доступность фичи 2 изменена через settings2.");

        settings2.saveSettings();
    }
}
