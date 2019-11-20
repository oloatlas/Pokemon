package pokemoncard;


public class Energia  extends Carta{
    private TipoElemento elemento;
    
    public Energia(Tipo tipo, TipoElemento elemento) {
        super(tipo);
        this.elemento = elemento;
    }

    public TipoElemento getElemento() {
        return elemento;
    }

    public void setElemento(TipoElemento elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Energia{\n\t" + "elemento=" 
                + elemento + "\n}";
    }
    
    
}
