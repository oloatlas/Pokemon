/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 20416529
 */
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        Pokemon p0 = new Pokemon(TipoCarta.POKEMON, Elemento.FOGO, "Charmander", 1000, 500, 2);
        Pokemon p1 = new Pokemon(TipoCarta.POKEMON, Elemento.AGUA, "Squartle", 1000, 450, 1);
        Pokemon p2 = new Pokemon(TipoCarta.POKEMON, Elemento.TERRA, "Bulbasaur", 1000, 280, 3);
        
        Energia en0 = new Energia(TipoCarta.ENERGIA, Elemento.TERRA);
        Energia en1 = new Energia(TipoCarta.ENERGIA, Elemento.FOGO);
        Energia en2 = new Energia(TipoCarta.ENERGIA, Elemento.AGUA);
        Energia en3 = new Energia(TipoCarta.ENERGIA, Elemento.TERRA);
        Energia en4 = new Energia(TipoCarta.ENERGIA, Elemento.AGUA);
        
        Equipamento eq0 = new Equipamento(TipoCarta.EQUIPAMENTO);
        Equipamento eq1 = new Equipamento(TipoCarta.EQUIPAMENTO);
        Equipamento eq2 = new Equipamento(TipoCarta.EQUIPAMENTO);
        Equipamento eq3 = new Equipamento(TipoCarta.EQUIPAMENTO);
        
        deck.addCarta(p0);
        deck.addCarta(p1);
        deck.addCarta(p2);
        deck.addCarta(en1);
        deck.addCarta(en2);
        deck.addCarta(en3);
        deck.addCarta(en4);
        deck.addCarta(eq0);
        deck.addCarta(eq1);
        deck.addCarta(eq2);
        deck.addCarta(eq3);
        
        System.out.println("Tamanho do Baralho: " + deck.getSize());
        System.out.println("Inicio:");
        System.out.println(deck);
        
        eq0.aumentarForca(p2, 180);
        eq1.aumentarHP(p0, 1540);
        
        System.out.println("Depois:");
        System.out.println(deck);
    }
}
