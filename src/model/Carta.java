
package model;


public abstract class Carta {

    private TipoCarta tipo;

    public Carta(TipoCarta tipo) {
        this.tipo = tipo;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        msg.append(tipo).append(" : ");
        return msg.toString();
    }
}
