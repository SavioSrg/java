package br.com.savio.alura.desafios.conversorDeMoedas.consultarMoeda;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversaoMoeda {

    public double converter(String moedaOrigem, String moedaDestino, double valor) {

        String url = "https://v6.exchangerate-api.com/v6/ff7dc822d92cc935527cd781/pair/" +
                moedaOrigem + "/" + moedaDestino;

        URI endereco = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Moeda conversao =
                    new Gson().fromJson(response.body(), Moeda.class);

            return valor * conversao.getConversionRate();

        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel realizar a conversão!");
        }
    }
}
