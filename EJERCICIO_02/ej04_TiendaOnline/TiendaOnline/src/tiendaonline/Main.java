
package tiendaonline;


public class Main {

   
    public static void main(String[] args) {
        Producto electrodomestico1 = new Electrodomestico("Nevera", 500, "Samsung");
        Producto ropa1 = new Ropa("Camiseta", 30, "Nike");

        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(electrodomestico1);
        carrito.agregarProducto(ropa1);

        //muestro total compra
        System.out.println("Total de la compra: $" + carrito.calcularTotal());
    }
    
}
