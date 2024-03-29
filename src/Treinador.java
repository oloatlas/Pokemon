
package pokemoncard;

import java.util.Random;


    public class Treinador extends Carta{
    private int forca;
    public Treinador(Tipo tipo) {
        super(tipo);
        
        this.forca = new Random().nextInt(10) + 1;
    }
    
    public void aumentarForca(Pokemon pokemon){
        pokemon.setForca(forca + pokemon.getForca());
    }

    public void diminuirForca(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() - forca);
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public String toString() {
        return "Treinador{\n\t" + "forca=" 
                + forca + "\n}";
    }
   
    
 }
