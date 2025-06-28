package br.com.alura.modules;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConvercao {
    public Moeda buscaConvercao (String moedaBase) {

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.
                        newBuilder()
                        .uri(URI.create("https://v6.exchangerate-api.com/v6/7c8743c465ee911f52a795e6/latest/" + moedaBase))
                        .build();

                HttpResponse<String> response = HttpClient
                        .newHttpClient()
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Moeda.class);

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Não consegui realizar a conversão.");
            }
        }
    }
