
package tiendaonline;


public class Electrodomestico extends Producto {
    public Electrodomestico(String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * 1.21; // iva 21%
    }
}
