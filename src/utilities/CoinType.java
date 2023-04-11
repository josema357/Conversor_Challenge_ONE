package utilities;

public class CoinType {
    private final String coinName;
    private final double coinValue;

    public CoinType(String coinName, double coinValue) {
        this.coinName = coinName;
        this.coinValue = coinValue;
    }

    public double getCoinValue() {
        return coinValue;
    }

    @Override
    public String toString() {
        return coinName;
    }
}
