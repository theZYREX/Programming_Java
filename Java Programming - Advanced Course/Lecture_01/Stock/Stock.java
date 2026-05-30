public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(){}

    public Stock(String _symbol, String _name, double _previousClosingPrice, double _currentPrice){
        symbol = _symbol;
        name = _name;
        previousClosingPrice = _previousClosingPrice;
        currentPrice = _currentPrice;
    }

    public double getChangePercent(){ return (currentPrice - previousClosingPrice)/previousClosingPrice * 100;}

    public String toString(){return String.format( " %s,%s,%.4f%%", symbol, name, getChangePercent());}
}
