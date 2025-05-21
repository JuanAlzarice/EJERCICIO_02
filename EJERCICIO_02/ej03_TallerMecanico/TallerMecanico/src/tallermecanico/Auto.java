
package tallermecanico;


public class Auto extends Vehiculo implements Reparable{//implemento reparable para poder reparar
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void reparar() {
        System.out.println("Reparando auto: " + marca + " " + modelo);
    }
}
