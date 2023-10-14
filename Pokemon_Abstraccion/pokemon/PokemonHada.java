
package pokemon;


public class PokemonHada extends Pokemon{
    public PokemonHada(String nombre, int nivel){
        super(nombre, Tipo.HADA, nivel);
        
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        
        setMovimiento(0, listaMovimientos.buscarMovimientoPorNombre("Carantoña"));
        setMovimiento(1, listaMovimientos.buscarMovimientoPorNombre("Choque anímico"));
        setMovimiento(2, listaMovimientos.buscarMovimientoPorNombre("Multiataque"));
        setMovimiento(3, listaMovimientos.buscarMovimientoPorNombre("Feerichoque"));
        
    }
    
    @Override
    public double obtenerEfectividad (Pokemon pokemon){
        double efectividad = 1.0;
        
        if (pokemon.getTipo() == Tipo.FANTASMA) efectividad = 1;
        if (pokemon.getTipo() == Tipo.HADA) efectividad = 1;
        
        return efectividad;
    }    
}
