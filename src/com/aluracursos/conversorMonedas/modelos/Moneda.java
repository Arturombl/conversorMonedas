package com.aluracursos.conversorMonedas.modelos;

import java.util.Map;
import java.util.stream.Collectors;

public record Moneda(String base_code,
                     String target_code,
                     Map<String, Double> conversion_rates,
                     double conversionRates) {

    public double filtrarMoneda (Map<String, Double> conversionRates, String targetCode){
            Map<String, Double> filteredRates = conversionRates.entrySet()
                    .stream()
                    .filter(entry -> entry.getKey().equals(targetCode))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            if (filteredRates.isEmpty()){
                System.out.println("tipo de moneda no encontrada");
            }
            double result = filteredRates.get(targetCode);
        System.out.println("Conversion Base: " + result);
        return result;
    }

}
