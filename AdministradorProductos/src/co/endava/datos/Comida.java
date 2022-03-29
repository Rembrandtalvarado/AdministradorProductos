/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

import java.time.LocalDate;

/**
 *
 * @author cafajardo
 */
public class Comida extends Producto {
    //creates the class comida and inherits from super class producto
    //creates a variable for the expiration date
    private LocalDate fechaVencimiento;

    public Comida(int id, String nombre, double precio, LocalDate fechaVencimiento) {
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    //method for getting the expiration date of the product
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    //method to override the expiration date
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //overrides the method getDescuento from the parent class
    @Override
    public double getDescuento() {
        if (fechaVencimiento.equals(LocalDate.now())) {
            return super.getDescuento();
        } 
        else {
            return 0;
        }
    }
    //overrides the method toString from the parent class
    @Override
    public String toString(){
        return super.toString() + ", " + fechaVencimiento;
    }
}
