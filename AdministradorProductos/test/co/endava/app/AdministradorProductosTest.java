package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    public void main() {
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now());
        double descuento = p3.getPrecio()*(10.0/100.0);
        assertEquals(descuento, p3.getDescuento());

    }
}