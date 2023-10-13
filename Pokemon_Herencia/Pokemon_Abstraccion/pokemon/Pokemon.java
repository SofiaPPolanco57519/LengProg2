



public class Pokemon {
    private String nombre, tipo;
    private int hp =100;
    private int nivel;
    

  
    public Pokemon(String nombre, String tipo, int nivel) {
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
        System.out.printf("%s recibe %d puntos de danio\n", this.getNombre(), danio);
    }
    
    public void recibirAtaque(String movimiento){
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        double numero = Math.random();
        calculaDanio((int) (numero * 10 + 1));
        System.out.printf("%s tiene ahora %s puntos de vida\n", this.getNombre(),this.hp);
    }
    
    public void atacar(String movimiento, Pokemon pokemon){
        System.out.printf("\n%s ataca a %s con %s\n", this.getNombre(),
                pokemon.getNombre(), movimiento);
                pokemon.recibirAtaque(movimiento);
    }
}
