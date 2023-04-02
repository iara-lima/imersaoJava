package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello world!");

        String url = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";

        HttpClient cliente = HttpClient.newHttpClient();
        //requisição
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(url)).GET().build();
        HttpResponse<String> resposta = cliente.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        String json = resposta.body();
        System.out.println(json);

    }

}