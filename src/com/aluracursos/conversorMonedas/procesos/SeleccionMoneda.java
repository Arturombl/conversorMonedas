package com.aluracursos.conversorMonedas.procesos;

import java.util.ArrayList;
import java.util.List;

public class SeleccionMoneda {

    public ArrayList listaCodigos (){
        List<String> currencyCode = new ArrayList<>();
        currencyCode.add("USD");
        currencyCode.add("MXN");
        currencyCode.add("ARS");
        currencyCode.add("BRL");
        currencyCode.add("CAD");
        currencyCode.add("COP");
        currencyCode.add("KRW");
        currencyCode.add("CNY");
        return (ArrayList) currencyCode;
    }


    public String seleccionarBaseCode(ArrayList<String> list, int opcion) {
        String baseCode;
        for (int i=0; i<= list.size(); i++) {
            if ((opcion - 1) == i) {
                return baseCode = String.valueOf(list.get(i));
            }
        }
        return "";
    }

    public String seleccionartarjetCode(ArrayList<String> list, int opcion) {
        String tarjetCode = "";
        for (int i = 0; i <= list.size(); i++) {
            if ((opcion -1) == i) {
                tarjetCode = String.valueOf(list.get(i));
            }
        }
        return tarjetCode;
    }
}
