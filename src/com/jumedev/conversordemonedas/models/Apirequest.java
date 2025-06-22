package com.jumedev.conversordemonedas.models;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Apirequest {

    public static double getExchangeRate(String from, String to) {

        String apiKey = "83ba584183bd4f45b3b2dd5e";
        String addressApi = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + from;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(addressApi))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
            JsonObject rates = obj.getAsJsonObject("conversion_rates");
            return rates.get(to).getAsDouble();

        } catch (NumberFormatException e) {
            System.out.println("Ocurrió un error:");
            System.out.println(e.getMessage());
            return -1;
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la URI. Verifica la dirección.");
            return -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
