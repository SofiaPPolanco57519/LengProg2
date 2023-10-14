
package pokemon;


public class PokemonFantasma extends Pokemon{
    
    public PokemonFantasma(String nombre, int nivel){
        super(nombre, Tipo.FANTASMA, nivel);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        
        setMovimiento(0, listaMovimientos.buscarMovimientoPorNombre("Garra umbría"));
        setMovimiento(1, listaMovimientos.buscarMovimientoPorNombre("Golpe fantasma"));
        setMovimiento(2, listaMovimientos.buscarMovimientoPorNombre("Homenaje póstumo"));
        setMovimiento(3, listaMovimientos.buscarMovimientoPorNombre("Puntada sombría"));
    }

    @Override
    public double obtenerEfectividad (Pokemon pokemon){
        double efectividad = 1.0;
        
        if (pokemon.getTipo() == Tipo.FANTASMA) efectividad = 2;
        if (pokemon.getTipo() == Tipo.HADA) efectividad = 1;
        
        return efectividad;
    }
}
