package com.aluracursos.conversorMonedas.modelos;

import java.util.*;
import java.util.ArrayList;

public class Mensajes {

    public HashMap<String, String> listaMonedas(){
        Map<String, String> currency = new HashMap<>();
        currency.put("USD", "United States Dollar");
        currency.put("MXN", "Mexican Peso");
        currency.put("ARS", "Argentine Peso");
        currency.put("BRL", "Brazilian Real");
        currency.put("CAD", "Canadian Dollar");
        currency.put("COP", "Colombian Peso");
        currency.put("KRW", "South Korean Won");
        currency.put("CNY", "Chinese Renminbi");
        return (HashMap<String, String>) currency;
    }

    public String menuPrincipal(){
        String menu = """
                ************************************
                CONVERSOR DE MONEDA
                ************************************
                
                1=> United States Dollar
                2=> Mexican Peso
                3=> Argentine Peso
                4=> Brazilian Real
                5=> Canadian Dollar
                6=> Colombian Peso
                7=> South Korean Won
                8=> Chinese Renminbi
                9=> Revisar Historial
                10=> Salir
                
                ************************************
                """;
        return menu;
    }

    public List<String> menuSecundario(HashMap<String, String> map, ArrayList<String> list, String code){
        List <String> currencyTarget = new ArrayList<String>();
        System.out.println("************************************");
        int i = 1;
        for (String moneda : list ){
            if (moneda != code){
                System.out.println(i + " => " + map.get(moneda));
                currencyTarget.add(moneda);
                i++;
            }

        }
        System.out.println("************************************");
        return currencyTarget;
    }
    public void mensajeConversion(HashMap<String, String> map, String baseCode, String targetCode, double monto, double conversionFinal){
        System.out.println("Se realizo la conversion de la moneda: " + map.get(baseCode) + " a moneda: " + map.get(targetCode));
        System.out.println("por un monto: " + monto);
        System.out.println("dando como resultado: " + conversionFinal + " moneda " + map.get(targetCode));
    }

    public void imprimirHistorial(){

    }
}
