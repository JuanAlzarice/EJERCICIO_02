package tiendaonline;

public class Ropa extends Producto {

    public Ropa(String nombre, double precioBase, String marca) {
        super(nombre, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * 1.1; // aplico 10%
    }
}
