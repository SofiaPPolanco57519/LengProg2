
package pokemon_herencia;


public class Pokemon {
    private int hp, nivel;
    private String nombre, tipo;

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, int nivel) {
        int hp = 100;
        this.nivel = nivel;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }
    
    private void calculaDanio(int danio){
        this.hp -= danio;
        System.out.printf("%s recibe %d puntos de danio\n",
                this.getNombre(), danio);
    }
    
    public void recibirAtaque(String movimiento){
        System.out.printf("%s recibe ATK %s\n", this.getNombre(),
                movimiento);
        calculaDanio((int) Math.random() * 10 + 1);
    }
    
    public void atacar(String movimiento, Pokemon pokemon){
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(),
                pokemon.getNombre(), movimiento);
                pokemon.recibirAtaque(movimiento);
    }
}
