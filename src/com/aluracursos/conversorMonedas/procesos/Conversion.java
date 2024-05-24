package com.aluracursos.conversorMonedas.procesos;

import com.aluracursos.conversorMonedas.modelos.Moneda;

import java.util.HashMap;

public class Conversion {
    public void conversionMoneda (HashMap<String, String> map, String baseCode, String targetCode, double monto){
        ConsultaApi busqueda = new ConsultaApi();
        Moneda consulta = busqueda.buscarMoneda(baseCode);
        double baseCambio = consulta.filtrarMoneda(consulta.conversion_rates(),targetCode);


        double conversionFinal = monto * baseCambio;
        System.out.println("Se realizo la conversion de la moneda: " + map.get(baseCode) + " a moneda: " + map.get(targetCode));
        System.out.println("por un monto: " + monto);
        System.out.println("dando como resultado: " + conversionFinal + " moneda " + map.get(targetCode));

    }
}
