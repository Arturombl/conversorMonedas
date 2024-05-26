package com.aluracursos.conversorMonedas.modelos;

import java.util.Date;

public class RegistroConversion {
    private final String nombreUsuario;
    private final String monedaBase;
    private final String monedaCambio;
    private final double montoAConvertir;
    private final double montoConvertido;
    private final Date fechaHora;

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
