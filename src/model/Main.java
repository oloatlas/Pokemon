
package model;

/**
 *
 * @author 20416529
 */
public class Main {
    public static void main(String[] args) {
        Deck deckp1 = new Deck();
        
        Pokemon p0 = new Pokemon(TipoCarta.POKEMON, Elemento.FOGO, "Pikachu", 1000, 500, 2);
        Pokemon p1 = new Pokemon(TipoCarta.POKEMON, Elemento.AGUA, "Squartle", 1000, 450, 1);
        Pokemon p2 = new Pokemon(TipoCarta.POKEMON, Elemento.TERRA, "Bulbasaur", 1000, 280, 3);
        Pokemon p3 = new Pokemon(TipoCarta.POKEMON, Elemento.FOGO, "Charmander", 1000, 500, 2);
        Pokemon p4 = new Pokemon(TipoCarta.POKEMON, Elemento.AGUA, "Pigioto", 1000, 450, 1);
        Pokemon p5 = new Pokemon(TipoCarta.POKEMON, Elemento.TERRA, "Diglet", 1000, 280, 3);
        Pokemon p6 = new Pokemon(TipoCarta.POKEMON, Elemento.FOGO, "Dragonit", 1000, 500, 2);
        Pokemon p7 = new Pokemon(TipoCarta.POKEMON, Elemento.AGUA, "Polygon", 1000, 450, 1);
        Pokemon p8 = new Pokemon(TipoCarta.POKEMON, Elemento.TERRA, "Pincher", 1000, 280, 3);
        Pokemon p9 = new Pokemon(TipoCarta.POKEMON, Elemento.FOGO, "Hitmonlee", 1000, 500, 2);
       
      
        
        Energia en0 = new Energia(TipoCarta.ENERGIA, Elemento.TERRA);
        Energia en1 = new Energia(TipoCarta.ENERGIA, Elemento.FOGO);
        Energia en2 = new Energia(TipoCarta.ENERGIA, Elemento.AGUA);
        Energia en3 = new Energia(TipoCarta.ENERGIA, Elemento.RAIO);
        Energia en4 = new Energia(TipoCarta.ENERGIA, Elemento.TERRA);
        Energia en5 = new Energia(TipoCarta.ENERGIA, Elemento.FOGO);
        Energia en6 = new Energia(TipoCarta.ENERGIA, Elemento.AGUA);
        Energia en7 = new Energia(TipoCarta.ENERGIA, Elemento.RAIO);
        
        
        Equipamento eq0 = new Equipamento(TipoCarta.EQUIPAMENTO);
        Equipamento eq1 = new Equipamento(TipoCarta.EQUIPAMENTO);
        Equipamento eq2 = new Equipamento(TipoCarta.EQUIPAMENTO);
        
        
        deckp1.addCarta(p0);
        deckp1.addCarta(p1);
        deckp1.addCarta(p2);
        deckp1.addCarta(p3);
        deckp1.addCarta(p4);
        deckp1.addCarta(p5);
        deckp1.addCarta(p6);
        deckp1.addCarta(p7);
        deckp1.addCarta(p8);
        deckp1.addCarta(en1);
        deckp1.addCarta(en2);
        deckp1.addCarta(en3);
        deckp1.addCarta(en4);
        deckp1.addCarta(en5);
        deckp1.addCarta(en6);
        deckp1.addCarta(eq0);
        deckp1.addCarta(eq1);
        deckp1.addCarta(eq2);
        
        
        System.out.println("Tamanho do Baralho: " + deckp1.getSize());
        System.out.println("Inicio:");
        System.out.println(deckp1);
        
        eq0.aumentarForca(p2, 180);
        eq1.aumentarHP(p0, 1540);
        
        System.out.println("Depois:");
        System.out.println(deckp1);
    }
    
  
}
