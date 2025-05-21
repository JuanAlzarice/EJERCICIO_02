
package tallermecanico;

import java.util.ArrayList;


public class Main {

   
    public static void main(String[] args) {
        ArrayList<Reparable> reparables = new ArrayList<>();
        reparables.add(new Auto("Toyota", "Corolla"));
        reparables.add(new Moto("Honda", "CBR600"));

        // ahora recorro y reparo
        for (Reparable reparable : reparables) {
            reparable.reparar();
        }
    }
    
}
