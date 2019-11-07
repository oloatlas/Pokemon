/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 20416529
 */
public class Deck {

    ArrayList<Carta> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void addCarta(Carta carta) {
        deck.add(carta);
    }

    public int getSize(){
        return deck.size();
    }
    
    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        if (deck.isEmpty()) {
            msg.append("Deck vazio");
        } else {
            for (Carta carta : deck) {
                msg.append(carta).append("\n");
            }
        }
        return msg.toString();
    }
}
