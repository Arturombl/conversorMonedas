package com.aluracursos.conversorMonedas.procesos;

import com.aluracursos.conversorMonedas.modelos.Moneda;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Moneda buscarMoneda (String base_Code) {


        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/60616260722f67d5c11c2c7a/latest/" + base_Code);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
