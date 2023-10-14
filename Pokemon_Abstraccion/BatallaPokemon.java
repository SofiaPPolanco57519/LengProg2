
package Pokemon_Abstraccion;

import pokemon.PokemonFantasma;
import pokemon.PokemonHada;


public class BatallaPokemon {

    public static void main(String[] args) {
        PokemonFantasma Mimikyu= new PokemonFantasma ("Mimikyu", 10);
        PokemonHada Jigglypuff= new PokemonHada ("Jigglypuff", 10);
        Mimikyu.atacar(1, Jigglypuff);
        Jigglypuff.atacar(0, Mimikyu);

    }
    
}