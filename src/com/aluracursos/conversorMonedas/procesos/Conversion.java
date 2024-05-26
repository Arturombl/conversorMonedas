package com.aluracursos.conversorMonedas.procesos;

import com.aluracursos.conversorMonedas.modelos.Moneda;

import java.util.HashMap;

public class Conversion {
    public double conversionMoneda (HashMap<String, String> map, String baseCode, String targetCode, double monto){
        ConsultaApi busqueda = new ConsultaApi();
        Moneda consulta = busqueda.buscarMoneda(baseCode);
        double baseCambio = consulta.filtrarMoneda(consulta.conversion_rates(),targetCode);
        double conversionFinal = monto * baseCambio;

       return conversionFinal;

    }
}
