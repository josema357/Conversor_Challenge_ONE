package app.converters;

public class TemperatureConverter {
    public static double convertTo(String type1, String type2 , double inputAmount){
        double outputConverter = 0;
        switch (type1){
            case "7" -> {
                if (type2.equals("8")){
                    outputConverter=(inputAmount*9/5)+32;
                } else if (type2.equals("9")) {
                    outputConverter=inputAmount+273.15;
                }else{
                    outputConverter=inputAmount;
                }
            }
            case "8" -> {
                if (type2.equals("7")){
                    outputConverter=(inputAmount-32)*5/9;
                } else if (type2.equals("9")) {
                    outputConverter=(inputAmount-32)*5/9+273.15;
                }else{
                    outputConverter=inputAmount;
                }
            }
            case "9" -> {
                if (type2.equals("7")){
                    outputConverter=inputAmount-273.15;
                } else if (type2.equals("8")) {
                    outputConverter=(inputAmount-273.15)*9/5+32;
                }else{
                    outputConverter=inputAmount;
                }
            }
        }
        return outputConverter;
    }
}
