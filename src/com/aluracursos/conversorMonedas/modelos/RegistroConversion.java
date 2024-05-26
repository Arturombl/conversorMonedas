package com.aluracursos.conversorMonedas.modelos;

import java.util.Date;
import java.util.HashMap;

public class RegistroConversion {
    private String nombreUsuario;
    private String monedaBase;
    private String monedaCambio;
    private double montoAConvertir;
    private double montoConvertido;
    private Date fechaHora;

    public RegistroConversion(String nombrUusuario, String monedaBase, String monedaCambio, double montoAConvertir, double montoConvertido, Date fechaHora) {
        this.nombreUsuario = nombrUusuario;
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        this.montoAConvertir = montoAConvertir;
        this.montoConvertido = montoConvertido;
        this.fechaHora = fechaHora;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    @Override
    public String toString() {
        return  "(nombreUsuario= " + nombreUsuario +
                ", mmonedaBase= " + monedaBase +
                ", monedaCambio= " + monedaCambio +
                ", montoAConvertir= " + montoAConvertir +
                ", montoConvertido= " + montoConvertido +
                ", fechaHora =" + fechaHora +
                ')';
    }
}
