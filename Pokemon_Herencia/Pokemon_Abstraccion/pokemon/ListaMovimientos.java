
package pokemon;

import java.util.ArrayList;

public class ListaMovimientos {
   //carantoña pa 90 pp 16 choque animico 75 24 multiataque 120 16 feerichoque 100 16
   //golpe fantasma 90 pp 16 garra umbría 70 24 homenaje póstumo 50 16 puntada sombría 80 16
    private ArrayList<Movimiento> movimientos = new ArrayList <>();
    public ListaMovimientos(){
        // Movimientos de tipo fantansma
        movimientos.add(new Movimiento("Garra Umbría", 70, 24, Tipo.FANTASMA));
        movimientos.add(new Movimiento("Golpe fantasma", 90, 16, Tipo.FANTASMA));
        movimientos.add(new Movimiento("Homenaje póstumo", 50, 16, Tipo.FANTASMA));
        movimientos.add(new Movimiento("Puntada sombría", 80, 16, Tipo.FANTASMA));
        
        // Movimientos de tipo hada
        movimientos.add(new Movimiento("Carantoña", 90, 16, Tipo.HADA));
        movimientos.add(new Movimiento("Choque anímico", 75, 24, Tipo.HADA));
        movimientos.add(new Movimiento("Multiataque", 120, 16, Tipo.HADA));
        movimientos.add(new Movimiento("Feerichoque", 100, 16, Tipo.HADA));

    }
}
