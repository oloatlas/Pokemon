package pokemoncard;


    public class Pokemon extends Carta{
    
    private TipoElemento elemento;
    private String nome;
    private int HP;
    private int forca;
    private int qtdEnergia;
    private boolean ataque;

    public Pokemon(Tipo tipo, TipoElemento elemento, String nome, int HP, int forca, int qtdEnergia) {
        super(tipo);
        this.nome = nome;
        this.elemento = elemento;
        this.HP = HP;
        this.forca = forca;
        this.qtdEnergia = qtdEnergia;
    }

    public TipoElemento getElemento() {
        return elemento;
    }

    public void setElemento(TipoElemento elemento) {
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

    public void incQtdEnergia() {
        this.qtdEnergia++;
    }

    public void decQtdEnergia() {
        this.qtdEnergia--;
    }

    public boolean isAtaque() {
        return ataque;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Pokemon{\n\t" + "elemento=" + 
                elemento + ",\n\tnome=" + 
                nome + ",\n\tHP=" + 
                HP + ",\n\tforca=" + 
                forca + ",\n\tqtdEnergia=" + 
                qtdEnergia + "\n}";
    }

    
}
