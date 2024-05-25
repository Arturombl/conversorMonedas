package com.aluracursos.conversorMonedas.principal;
import com.aluracursos.conversorMonedas.modelos.Mensajes;
import com.aluracursos.conversorMonedas.procesos.Conversion;
import com.aluracursos.conversorMonedas.procesos.SeleccionMoneda;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> currencyCode = new ArrayList<String>();
        ArrayList<String> currencyTarget = new ArrayList<>();
        HashMap<String, String> currency;

        String base_Code;
        String target_code;
        int opcion;
        boolean validar = true;
        double monto;

        Conversion conversion = new Conversion();
        Mensajes menu = new Mensajes();
        SeleccionMoneda seleccion = new SeleccionMoneda();

        while (validar) {


                try {
                    currency = menu.listaMonedas();
//                    System.out.println(currency);
                    System.out.println(menu.menuPrincipal());
                    currencyCode.addAll(seleccion.listaCodigos());

                    System.out.println("\n Selecciona la opcion deseada del menu de la moneda a convertir: ");
                    opcion = entrada.nextInt();

                    if (opcion == 9){
                        System.out.println("Gracias por su confianza");
                        System.out.println("Programa Finalizado");
                        validar = false;
                    } else if (opcion < 9) {
                        base_Code = seleccion.seleccionarBaseCode(currencyCode , opcion);

                        currencyTarget.addAll(menu.menuSecundario(currency,currencyCode, base_Code));

                        System.out.println("\n Selecciona la opcion deseada del menu de la moneda a final: ");
                        opcion = entrada.nextInt();
                        target_code = seleccion.seleccionartarjetCode(currencyTarget, opcion);

//                        System.out.println(target_code);

                        System.out.println("\n Ingresa el monto a convertir: ");
                        monto = entrada.nextDouble();

                        conversion.conversionMoneda(currency, base_Code, target_code, monto);
                        currencyCode.clear();
                        currencyTarget.clear();
                        currency.clear();
                    }else {
                        System.out.println("Error en seleccion intentelo de nuevo...");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error en seleccion intentelo de nuevo......");
                    entrada.nextLine();
                }





        }

    }
}