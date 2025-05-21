package tiendaonline;

public class Producto implements Vendible {

    String nombre;
    double precioBase;
    String marca;

    public Producto(String nombre, double precioBase, String marca) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.marca = marca;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase; // sin inpuesto o descuento
    }
}
