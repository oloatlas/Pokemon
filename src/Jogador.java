
package pokemoncard;


public class Jogador {
    
    private String nome;
    private int pontos;
    private Deck deck;
    private Carta[] mao = new Carta[6];

    public Jogador(String nome, int pontos) {
        this.nome = nome;
        this.pontos = 3;
        this.deck =  new Deck();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {    
        this.pontos = pontos;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", pontos=" + pontos + '}';
    }

    public void retirarCartaDeck(int qtn) {
        int x = 0;
        for (int c=0; c<this.mao.length && x <= qtn; c++) {
            if (this.mao[c] == null) {
                this.mao[c] = this.deck.retirar();
                x++;
            }
        }
        if (!isPokemon()) {
            removeMao();
            retirarCartaDeck(qtn);
        }
    }

    public Carta[] getMao() {
        return mao;
    }

    public Carta jogarCartaMesa(int posicao) {
        Carta retorno = this.mao[posicao];
        this.mao[posicao] = null;
        return retorno;
    }

    public int getNumeroCartasMao() {
        int x = 0;
        for (Carta carta : mao) {
            if (carta != null)
                x++;
        }
        return x;
    }

    // Limpar as cartas da mao
    public void removeMao() {
        for (int c=0; c<this.mao.length; c++) {
            this.mao[c] = null;
        }
    }
    
    public String mostrarMao() {
        String mostrar = "";
        for (int m=0; m<this.mao.length; m++) {
            if (this.mao[m] != null)
                mostrar = mostrar + (m+1) + " - " + this.mao[m].toString() + "\n";
        }
        return mostrar;
    }

    public boolean isPokemon() {
        for (Carta carta : mao) {
            if (carta.getTipo() == Tipo.POKEMON)
                return true;
        }
        return false;
    }
}

