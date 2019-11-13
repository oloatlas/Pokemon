
package model;


public class Energia  extends Carta{
    private Elemento elemento;
    
    public Energia(TipoCarta tipo, Elemento elemento) {
        super(tipo);
        this.elemento = elemento;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
    
    @Override
    public String toString(){
        StringBuilder msg = new StringBuilder();
        msg.append(super.toString()).append(elemento);
        return msg.toString();
    }
}
