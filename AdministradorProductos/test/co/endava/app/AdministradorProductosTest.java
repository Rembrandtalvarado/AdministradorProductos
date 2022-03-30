package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    public void descuentoComida() {
        //Verifies the discount for food
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        double descuento = p3.getPrecio()*(10.0/100.0);
        assertEquals(descuento, p3.getDescuento());
    }
    @Test
    public void toStringProducto() {
        //verifies the string output of Producto
        String output = "101, Café, 1500.0";
        Producto p1 = new Producto(101, "Café", 1500);
        assertEquals(output, p1.toString());
    }

    @Test
    public void setNombreTest() {
        //verifies the setNombre from Producto (inherited by Bebida)
        Bebida b1 = new Bebida(121, "Monster", 3000);
        String newNombre = "Coca-cola";
        b1.setNombre(newNombre);
        assertEquals(newNombre, b1.getNombre());
    }
    @Test
    public void setPrecioTest() {
        //verifies the setPrecio from Producto (inherited by Comida)
        Comida c1 = new Comida(131, "Empanadita", 2000, LocalDate.now().plusDays(2));
        double newPrecio = 2500;
        c1.setPrecio(newPrecio);
        assertEquals(newPrecio, c1.getPrecio());
    }
}