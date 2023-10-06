
package pokemon_herencia;


public class BatallaPokemon {
    
    
    

public static void main(String[] args) {
    Pokemon Mimikyu= new Pokemon ("Mimikyu", "Fantasma", 10);
    Pokemon Jigglypuff= new Pokemon ("Jigglypuff", "Hada", 10);
    Mimikyu.atacar("Bola sombra", Jigglypuff);
    Jigglypuff.atacar("Carantoña", Mimikyu);

    }
}