
package pokemoncard;

import java.util.ArrayList;
import java.util.Random;


public class Deck {
    
     ArrayList<Carta> deck;

    public Deck(){
        deck = carregar();
    }

    public void addCarta(Carta carta) {
        deck.add(carta);
    }

    public int getSize(){
        return deck.size();
    }
    
    public Carta retirar(){
        
      int remove = new Random().nextInt(deck.size());
      Carta ret = deck.get(remove);
      deck.remove(remove);
      return ret;
    }

    private ArrayList<Carta>carregar(){
      ArrayList<Carta> deckp1 = new ArrayList<>();
      
        Pokemon p0 = new Pokemon(Tipo.POKEMON, TipoElemento.RAIO, "PICACHU", 50, 30, 0);
        Pokemon p1 = new Pokemon(Tipo.POKEMON, TipoElemento.AGUA, "SQUARTLE", 30, 20, 0);
        Pokemon p2 = new Pokemon(Tipo.POKEMON, TipoElemento.TERRA, "ONYX", 70, 50, 0);
        Pokemon p3 = new Pokemon(Tipo.POKEMON, TipoElemento.FOGO, "CHARMANDER", 50, 30, 0);
        Pokemon p4 = new Pokemon(Tipo.POKEMON, TipoElemento.NORMAL, "SPEROW", 60, 40, 0);
        Pokemon p5 = new Pokemon(Tipo.POKEMON, TipoElemento.TERRA, "DIGLET", 40, 30, 0);
        Pokemon p6 = new Pokemon(Tipo.POKEMON, TipoElemento.AGUA, "DRATINI", 50, 60, 0);
        Pokemon p7 = new Pokemon(Tipo.POKEMON, TipoElemento.RAIO, "ZAPTOS", 80, 50, 0);
        Pokemon p8 = new Pokemon(Tipo.POKEMON, TipoElemento.NORMAL, "PINCHER", 60, 70, 0);
        Pokemon p9 = new Pokemon(Tipo.POKEMON, TipoElemento.FOGO, "PONYTA", 50, 45, 0);
        Pokemon p10 = new Pokemon(Tipo.POKEMON, TipoElemento.RAIO, "ELETROMINE", 50, 30, 0);
        Pokemon p11 = new Pokemon(Tipo.POKEMON, TipoElemento.AGUA, "PSYDUCK", 30, 20, 0);
        Pokemon p12 = new Pokemon(Tipo.POKEMON, TipoElemento.TERRA, "GEODUTE", 70, 50, 0);
        Pokemon p13 = new Pokemon(Tipo.POKEMON, TipoElemento.FOGO, "VULPIX", 50, 30, 0);
        Pokemon p14 = new Pokemon(Tipo.POKEMON, TipoElemento.NORMAL, "PIGET", 60, 40, 0);
        Pokemon p15 = new Pokemon(Tipo.POKEMON, TipoElemento.TERRA, "CUBONE", 40, 30, 0);
        Pokemon p16 = new Pokemon(Tipo.POKEMON, TipoElemento.AGUA, "KRABBY", 50, 60, 0);
        Pokemon p17 = new Pokemon(Tipo.POKEMON, TipoElemento.RAIO, "VOLTORB", 80, 50, 0);
        Pokemon p18 = new Pokemon(Tipo.POKEMON, TipoElemento.NORMAL, "MANKEY", 60, 70, 0);
        Pokemon p19 = new Pokemon(Tipo.POKEMON, TipoElemento.FOGO, "MAGMAR", 50, 45, 0);
       
      
        
        Energia en0 = new Energia(Tipo.ENERGIA, TipoElemento.TERRA);
        Energia en1 = new Energia(Tipo.ENERGIA, TipoElemento.FOGO);
        Energia en2 = new Energia(Tipo.ENERGIA, TipoElemento.AGUA);
        Energia en3 = new Energia(Tipo.ENERGIA, TipoElemento.RAIO);
        Energia en4 = new Energia(Tipo.ENERGIA, TipoElemento.TERRA);
        Energia en5 = new Energia(Tipo.ENERGIA, TipoElemento.FOGO);
        Energia en6 = new Energia(Tipo.ENERGIA, TipoElemento.AGUA);
        Energia en7 = new Energia(Tipo.ENERGIA, TipoElemento.RAIO);
        Energia en8 = new Energia(Tipo.ENERGIA, TipoElemento.TERRA);
        Energia en9 = new Energia(Tipo.ENERGIA, TipoElemento.FOGO);
        Energia en10 = new Energia(Tipo.ENERGIA, TipoElemento.AGUA);
        Energia en11 = new Energia(Tipo.ENERGIA, TipoElemento.RAIO);
        Energia en12 = new Energia(Tipo.ENERGIA, TipoElemento.TERRA);
        Energia en13 = new Energia(Tipo.ENERGIA, TipoElemento.FOGO);
        Energia en14 = new Energia(Tipo.ENERGIA, TipoElemento.AGUA);
        Energia en15 = new Energia(Tipo.ENERGIA, TipoElemento.RAIO);
        
        
        
        Treinador eq0 = new Treinador(Tipo.TREINADOR);
        Treinador eq1 = new Treinador(Tipo.TREINADOR);
        Treinador eq2 = new Treinador(Tipo.TREINADOR);
        Treinador eq3 = new Treinador(Tipo.TREINADOR);
        
        deckp1.add(p0);
        deckp1.add(p1);
        deckp1.add(p2);
        deckp1.add(p3);
        deckp1.add(p4);
        deckp1.add(p5);
        deckp1.add(p6);
        deckp1.add(p7);
        deckp1.add(p8);
        deckp1.add(p9);
        deckp1.add(p10);
        deckp1.add(p11);
        deckp1.add(p12);
        deckp1.add(p13);
        deckp1.add(p14);
        deckp1.add(p15);
        deckp1.add(p16);
        deckp1.add(p17);
        deckp1.add(p18);
        deckp1.add(p19);
        deckp1.add(en0);
        deckp1.add(en1);
        deckp1.add(en2);
        deckp1.add(en3);
        deckp1.add(en4);
        deckp1.add(en5);
        deckp1.add(en6);
        deckp1.add(en7);
        deckp1.add(en8);
        deckp1.add(en9);
        deckp1.add(en10);
        deckp1.add(en11);
        deckp1.add(en12);
        deckp1.add(en13);
        deckp1.add(en14);
        deckp1.add(en15);
        deckp1.add(eq0);
        deckp1.add(eq1);
        deckp1.add(eq2);
        deckp1.add(eq3);
        return deckp1;   
        
    }
    

    @Override
    public String toString() {
        return "Deck{" + "deck=" + deck + '}';
    }
}
