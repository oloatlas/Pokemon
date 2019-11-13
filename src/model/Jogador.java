
package model;


public class Jogador {
    private String nome;
    private String pontos;

    public Jogador(String nome, String pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", pontos=" + pontos + '}';
    }
    
   
}
