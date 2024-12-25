package net.engineeringdigest.journalApp.service;


import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {

    private static final String apiKey = "00cea7723665b359ac2dfebbe852170b";

    private static final String lethalCheetah = "sk_ba54b5ee0b11fb321c796eaab0299067e5cfa7e6848e1541";

    private static final String api = "https://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(String city) {
        String finalApi = api.replace("API_KEY", apiKey).replace("CITY", city);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.GET, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }

    public WeatherResponse postWeather(String city){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("key", "value");

        String body = "{\n" +
                "    \"title\": \"Afternoon\",\n" +
                "    \"content\": \"Went to shopping\"\n" +
                "}";

        HttpEntity<String> httpEntity = new HttpEntity<>(body);

//        User user = User.builder().userName("ram").password("ram").build();
//        HttpEntity<User> httpEntity = new HttpEntity<>(user,httpHeaders);

        String finalApi = api.replace("API_KEY", apiKey).replace("CITY", city);

        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.POST, httpEntity, WeatherResponse.class);
        return response.getBody();
    }
}
