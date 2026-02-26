public class StockApplication{

    public static void main(String[] args) {
        Stock Sber = new Stock("SBER", "ПАО Сбербанк", 281.50, 282.87);
        System.out.println(Sber);

        Stock[] stockArr = new Stock[2];
        stockArr[0] = new Stock("LKOH", "Лукойл", 5259, 5180);
        stockArr[1] = new Stock("X5", "Корпоративный центр Х5", 2417, 2517);

        for (int i = 0; i < stockArr.length; i++) {
            System.out.println(stockArr[i]);
        }
    }
}
