/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.endava.datos;

/**
 *
 * @author cafajardo
 */

//creates super class Producto
public class Producto {
    
    private int id;
    private String nombre;
    private double precio;

    //constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //method to get the ID
    public int getId() {
        return id;
    }
    //method to override the ID
    public void setId(int id) {
        this.id = id;
    }
    //method to get the name
    public String getNombre() {
        return nombre;
    }
    //method to override the name
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //method to get the price
    public double getPrecio() {
        return precio;
    }
    //method to override the price
    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("No se permiten precios negativos");
        } else {
            this.precio = precio;
        }
    }
    //method to get the discount
    public double getDescuento(){
        return precio * 0.1d;
    }
    
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + precio;
    }
}
