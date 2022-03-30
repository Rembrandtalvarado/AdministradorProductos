/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author dsanchez
 */
public class AdministradorProductos {

    /**
     * @param args the command line arguments
     */
    //MAIN
    public static void main(String[] args) {
        //create products (cafe, azucar, pastel, te)
        Producto p1 = new Producto(101, "Café", 1500);
        Producto p2 = new Producto(102, "Azucar", 2500);
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        Producto p4 = new Bebida(104, "Té", 1800);
        //price p1
        System.out.println(p1.getPrecio());
        //price p2
        System.out.println(p2.getPrecio());
        //information of p3
        System.out.println("Fecha: "+ p3.getFechaVencimiento() +  ", Precio: "+ p3.getPrecio() + ", Dcto: " + p3.getDescuento());
        //information of p4
        System.out.println("Precio: "+ p4.getPrecio() + ", Dcto: " + p4.getDescuento());

        //create p5 agua
        Producto p5 = new Producto(105, "Agua", 1800);
        //verifies the object P5
        if (p5 == null) {
            System.out.println("El objeto está nulo");
        } else {
            if (p5.getNombre() == null) {
                System.out.println("El nombre está nulo");
            } else {
                System.out.println(p5.getNombre());
            }
        }
        //creates a really big number
        BigDecimal numero = BigDecimal.ZERO;
        //will try to convert to long
        try {
            numero = BigDecimal.valueOf(Long.parseLong("140"));
        } catch (Exception e){
            //convert the number to one
            numero = BigDecimal.ONE;
            System.out.println("No se pudo convertir " + e);
        }
        System.out.println(numero);
    }
    
}
