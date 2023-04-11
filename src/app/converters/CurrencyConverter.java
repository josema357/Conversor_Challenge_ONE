package app.converters;

import utilities.CoinType;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter {
    protected static List<CoinType> createList(){
        List<CoinType> coinTypeList=new ArrayList<>();
        coinTypeList.add(new CoinType("Peruvian Sol",1.0));
        coinTypeList.add(new CoinType("American Dollars",0.2653));
        coinTypeList.add(new CoinType("Euros",0.2433));
        coinTypeList.add(new CoinType("Pounds Sterling",0.2129));
        coinTypeList.add(new CoinType("Japanese Yen",34.8401));
        coinTypeList.add(new CoinType("South Korean Won",348.8883));

        return coinTypeList;
    }
    public static double convertToPEN(String id, double inputAmount){
        List<CoinType> coinTypeList=createList();

        return switch (id) {
            case "2" -> inputAmount / coinTypeList.get(1).getCoinValue();
            case "3" -> inputAmount / coinTypeList.get(2).getCoinValue();
            case "4" -> inputAmount / coinTypeList.get(3).getCoinValue();
            case "5" -> inputAmount / coinTypeList.get(4).getCoinValue();
            case "6" -> inputAmount / coinTypeList.get(5).getCoinValue();
            default -> inputAmount;
        };
    }
    public static double convertToCoins(String outputID, double inputAmount){
        List<CoinType> coinTypeList=createList();

        return switch (outputID) {
            case "2" -> inputAmount * coinTypeList.get(1).getCoinValue();
            case "3" -> inputAmount * coinTypeList.get(2).getCoinValue();
            case "4" -> inputAmount * coinTypeList.get(3).getCoinValue();
            case "5" -> inputAmount * coinTypeList.get(4).getCoinValue();
            case "6" -> inputAmount * coinTypeList.get(5).getCoinValue();
            default -> inputAmount;
        };
    }
}