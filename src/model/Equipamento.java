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
public class Equipamento extends Carta{
    
    public Equipamento(TipoCarta tipo) {
        super(tipo);
    }
    
    public void aumentarForca(Pokemon pokemon, int forca){
        pokemon.setForca(forca + pokemon.getForca());
    }
    
    public void aumentarHP(Pokemon pokemon, int hp){
        pokemon.setHP(hp + pokemon.getHP());
    }
    
    @Override
    public String toString(){
        StringBuilder msg = new StringBuilder();
        msg.append(super.toString());
        return msg.toString();
    }
}
