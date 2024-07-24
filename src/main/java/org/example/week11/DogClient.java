package org.example.week11;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DogClient {
    private static final String BASE_URL = "https://dog.ceo/api/breed/";

    public static String getDogImage(String breed) throws IOException, InterruptedException {
        String url = BASE_URL + breed + "/images/random";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    public static String parseDogImage(String jsonResponse) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);
        return jsonObject.get("message").getAsString();
    }
}
