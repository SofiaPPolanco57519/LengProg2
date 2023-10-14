
package pokemon;

import java.util.ArrayList;

public class ListaMovimientos {
   //carantoña pa 90 pp 16 choque animico 75 24 multiataque 120 16 feerichoque 100 16
   //Golpe fantasma 90 pp 16 garra umbría 70 24 Homenaje póstumo 50 16 Puntada sombría 80 16
    
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    
    public ListaMovimientos(){
        // Tipo fantansma
        movimientos.add(new Movimiento("Garra umbría", 70, 24, Tipo.FANTASMA));
        movimientos.add(new Movimiento("Golpe fantasma", 90, 16, Tipo.FANTASMA));
        movimientos.add(new Movimiento("Homenaje póstumo", 50, 16, Tipo.FANTASMA));
        movimientos.add(new Movimiento("Puntada sombría", 80, 16, Tipo.FANTASMA));
        
        // Tipo hada
        movimientos.add(new Movimiento("Carantoña", 90, 16, Tipo.HADA));
        movimientos.add(new Movimiento("Choque anímico", 75, 24, Tipo.HADA));
        movimientos.add(new Movimiento("Multiataque", 120, 16, Tipo.HADA));
        movimientos.add(new Movimiento("Feerichoque", 100, 16, Tipo.HADA));

    }
    
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for (Movimiento movimiento: movimientos) {
            if (movimiento.getNombre().equals(nombre)) {
                return movimiento;
            }
        }
        return null;
    }
}
