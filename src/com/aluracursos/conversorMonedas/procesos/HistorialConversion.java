package com.aluracursos.conversorMonedas.procesos;

import com.aluracursos.conversorMonedas.modelos.RegistroConversion;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Date;
import java.util.HashMap;

public class HistorialConversion {
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public void historial (String nombre, String base, String targe, double monto, double montoconversion, HashMap<String, String> mapa){
        String monedaBase = mapa.get(base);
        String monedaCambio = mapa.get(targe);
        Date fecha = new Date();
        RegistroConversion registro = new RegistroConversion(nombre, monedaBase, monedaCambio, monto, montoconversion, fecha);


        try {
            File archivo = new File(registro.getNombreUsuario() + ".json");
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo.getAbsoluteFile(),true);
            BufferedWriter salida = new BufferedWriter(fw);
            salida.write(gson.toJson(registro));
            salida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
