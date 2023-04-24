package utilities;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoinService {
    private static JSONObject rates;
    public static void initialize(){
        rates=getValueCoin();
    }
    public static JSONObject getRates(){
        return rates;
    }
    /**
     * This method sends an HTTP GET request to the APILayer API and retrieves the latest exchange rates
     * @return a JSONObject containing the latest exchange rates for the specified currencies.
     * */
    public static JSONObject getValueCoin(){
        JSONObject rates;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.apilayer.com/exchangerates_data/latest?symbols=USD%2CEUR%2CGBP%2CJPY%2CKRW&base=PEN"))
                .header("apikey", "zo86LkgyRee50k2kI8Jn9BgZW6qNhFO3")
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            JSONObject json= new JSONObject(response.body());
            rates= json.getJSONObject("rates");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return rates;
    }
}
