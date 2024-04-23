package com.alura.desafioconversordemoneda.modelos;

import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConversion {
    private static final String API_KEY = "4aa3bb56caedd42a2824edb0"; // Reemplaza con tu clave de API
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public void convertir(int opcion, double cantidad) {
        String baseCurrency = "USD";
        String targetCurrency = "";

        switch (opcion) {
            case 1:
                targetCurrency = "ARS"; // USD a ARS
                break;
            case 2:
                baseCurrency = "ARS"; // ARS a USD
                targetCurrency = "USD";
                break;
            case 3:
                targetCurrency = "BRL"; // USD a BRL
                break;
            case 4:
                baseCurrency = "BRL"; // BRL a USD
                targetCurrency = "USD";
                break;
            case 5:
                targetCurrency = "BSD"; // USD a BSD
                break;
            case 6:
                baseCurrency = "BSD"; // BSD a USD
                targetCurrency = "USD";
                break;
            case 7:
                targetCurrency = "BOB"; // USD a BOB
                break;
            case 8:
                baseCurrency = "BOB"; // BOB a USD
                targetCurrency = "USD";
                break;
            case 9:
                targetCurrency = "CLP"; // USD a CLP
                break;
            case 10:
                baseCurrency = "CLP"; // CLP a USD
                targetCurrency = "USD";
                break;
            case 11:
                targetCurrency = "COP"; // USD a COP
                break;
            case 12:
                baseCurrency = "COP"; // COP a USD
                targetCurrency = "USD";
                break;
        }

        try {
            String url = BASE_URL + baseCurrency;
            String json = getExchangeRatesJson(url);
            ObjectMapper objectMapper = new ObjectMapper();
            ExchangeRates exchangeRates = objectMapper.readValue(json, ExchangeRates.class);

            Map<String, Double> rates = exchangeRates.getConversionRates();

            if (rates == null) {
                System.out.println("Error: El campo 'conversion_rates' es nulo.");
                return;
            }

            double rate = rates.get(targetCurrency);
            double convertedAmount = cantidad * rate;

            System.out.println("\u001B[35m" + baseCurrency + " a " + targetCurrency + ": " + rate);
            System.out.println("\u001B[33m" + "Resultado de la conversión: " + convertedAmount);

        } catch (Exception e) {
            System.out.println("Error al obtener las tasas de conversión.");
            e.printStackTrace();
        }
    }

    private String getExchangeRatesJson(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("HTTP error code: " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        StringBuilder response = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            response.append(output);
        }

        conn.disconnect();

        return response.toString();
    }
}