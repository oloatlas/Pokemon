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
public class Pokemon extends Carta{
    
    private Elemento elemento;
    private String nome;
    private int HP;
    private int forca;
    private int qtdEnergia;

    public Pokemon(TipoCarta tipo, Elemento elemento, String nome, int HP, int forca, int qtdEnergia) {
        super(tipo);
        this.elemento = elemento;
        this.nome = nome;
        this.HP = HP;
        this.forca = forca;
        this.qtdEnergia = qtdEnergia;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getQtdEnergia() {
        return qtdEnergia;
    }

    public void setQtdEnergia(int qtdEnergia) {
        this.qtdEnergia = qtdEnergia;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append(super.toString()).append(elemento).append(" - ").append(nome).append(" - ").append(HP).append(" - ").append(forca).append(" - ").append(qtdEnergia);
        return msg.toString();
    }
}
