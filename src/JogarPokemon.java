package pokemoncard;

import java.util.Scanner;

public class JogarPokemon {
    private static int numCartIndiv = 3;
    private static Carta[] mesa = new Carta[numCartIndiv*2];
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Carta[] mesa = new Carta[6];
        int posMesa = 0;
        int numeroCartas = 0;
        int rodadas = 0;
        int cartaSelecionada = -1;
        boolean player = true;
        
        System.out.print("Informe o nome do Player1: ");
        Jogador player1 = new Jogador(leitura.nextLine(), 3);
        System.out.println();
        
        System.out.print("Informe o nome do Player2: ");
        Jogador player2 = new Jogador(leitura.nextLine(), 3);
        System.out.println();
        
        Jogador playerAtack;
        Jogador playerDefec;

        while (player1.getPontos() > 0 && player2.getPontos() > 0) {
            rodadas++;
            if (player) {
                posMesa = 0;
                playerAtack = player1;
                playerDefec = player2;
                player = false;
            } else {
                posMesa = numCartIndiv;
                playerAtack = player2;
                playerDefec = player1;
                player = true;
            }

            numeroCartas = qtnCartasNaMesa(posMesa) + playerAtack.getNumeroCartasMao();
            if (numeroCartas < playerAtack.getMao().length)
                playerAtack.retirarCartaDeck(playerAtack.getMao().length - numeroCartas - 1);

            while (cartaSelecionada != 0) {
                cartaSelecionada = -1;
                System.out.println("Vez do player: " + playerAtack.toString());
                System.out.println("Suas cartas na mesa: ");
                for (int p = posMesa; p < posMesa+3; p++) {
                    if (getCartaMesa(p) != null) System.out.println(getCartaMesa(p).toString());
                }
                System.out.println();
                System.out.println("Suas Cartas na mão: ");
                System.out.println(playerAtack.mostrarMao());
                
                do {
                    System.out.print("Escolha uma das cartas para por na mesa ou (0) para jogar: ");
                    if (leitura.hasNextInt()) cartaSelecionada = leitura.nextInt();
                } while (cartaSelecionada < 0 || cartaSelecionada > playerAtack.getMao().length);

                if (cartaSelecionada != 0) {
                    if ((qtnCartasNaMesa(posMesa) == (numCartIndiv-1))) {
                        setCartaMesa(posMesa, playerAtack.jogarCartaMesa(cartaSelecionada-1));
                        cartaSelecionada = 0;
                    } else {
                        setCartaMesa(posMesa, playerAtack.jogarCartaMesa(cartaSelecionada-1));
                    }
                }
            }
            cartaSelecionada = -1;
            
            // Se rodada maior que 2, liberado para ataque
            if (rodadas > 2) {
                // Verificar se possui pokemon na mesa (os 2 players)
                int[] pokrod = isDoisPokemon();
                int pokAtac, pokDef;
                if (pokrod[0] >= 0 && pokrod[1] >= 0)  {
                    // Verificar se possui energia o pokemon que vai atacar
                    if (player) {
                        pokAtac = pokrod[1];
                        pokDef = pokrod[0];
                    } else {
                        pokAtac = pokrod[0];
                        pokDef = pokrod[1];
                    }
                    if (((Pokemon) getCartaMesa(pokAtac)).getQtdEnergia() > 0) {
                        // Consome uma energia
                        ((Pokemon) getCartaMesa(pokAtac)).decQtdEnergia();
                        removeEnergiaPokemonAtack(pokAtac);
                        // Verificar carta mais alta
                        if (((Pokemon) getCartaMesa(pokAtac)).getForca() > ((Pokemon) getCartaMesa(pokDef)).getForca()) {
                            derrotadoPokemon(pokDef);
                            playerDefec.setPontos(playerDefec.getPontos() - 1);
                        }
                        // Consome um treinador
                        removerTreinadorPokemonAtack(pokAtac);
                    }
                }
            }
        }
        leitura.close();
        
    }

    // public static Carta[] getMesa2() {
    //     return mesa2;
    // }

    // public static void setMesa2(Carta[] mesa2) {
    //     JogarPokemon.mesa2 = mesa2;
    // }

    public static int qtnCartasNaMesa(int pInicial) {
        int ncartas = 0;
        for (int p=pInicial; p<(pInicial+numCartIndiv); p++) {
            if (mesa[p] != null)
                ncartas++;
        }
        return ncartas;
    }

    public static Carta getCartaMesa(int posicao) {
        if (mesa[posicao] != null)
            return mesa[posicao];
        else
            return null;
    }

    public static int setCartaMesa(int posicao, Carta carta) {
        if (carta == null) {
            mesa[posicao] = null;
            return 0;
        }
        if (carta.getTipo() == Tipo.POKEMON) {
            for (int i=posicao; i<(posicao+numCartIndiv); i++) {
                if (getCartaMesa(i) != null) {
                    if (getCartaMesa(i).getTipo() == Tipo.ENERGIA) {
                        // Se pokemon elemento normal add energia
                        if (((Pokemon) carta).getElemento() == TipoElemento.NORMAL) {
                            ((Pokemon) carta).incQtdEnergia();
                            break;
                        }
                        // Se pokemon elemento = elemento
                        if (((Energia) getCartaMesa(i)).getElemento() == ((Pokemon) carta).getElemento()) {
                            ((Pokemon) carta).incQtdEnergia();
                            break;
                        }
                    }
                }
            }
            // for para o treinador
            for (int i=posicao; i<(posicao+numCartIndiv); i++) {
                if (getCartaMesa(i) != null) {
                    if (getCartaMesa(i).getTipo() == Tipo.TREINADOR) {
                        ((Treinador) getCartaMesa(i)).aumentarForca(((Pokemon) carta));
                    }
                }
            }
        }

        if (carta.getTipo() == Tipo.ENERGIA) {
            for (int i=posicao; i<(posicao+numCartIndiv); i++) {
                if (getCartaMesa(i) != null) {
                    if (getCartaMesa(i).getTipo() == Tipo.POKEMON) {
                        // Se pokemon elemento normal add energia
                        if (((Pokemon) getCartaMesa(i)).getElemento() == TipoElemento.NORMAL) {
                            ((Pokemon) getCartaMesa(i)).incQtdEnergia();
                            break;
                        }
                        // Se pokemon elemento = elemento
                        if (((Pokemon) getCartaMesa(i)).getElemento() == ((Energia) carta).getElemento()) {
                            ((Pokemon) getCartaMesa(i)).incQtdEnergia();
                            break;
                        }
                    }
                }
            }
        }

        // if para treinador
        if (carta.getTipo() == Tipo.TREINADOR) {
            for (int i=posicao; i<(posicao+numCartIndiv); i++) {
                if (getCartaMesa(i) != null) {
                    if (getCartaMesa(i).getTipo() == Tipo.POKEMON) {
                        ((Treinador) carta).aumentarForca(((Pokemon) getCartaMesa(i)));
                    }
                }
            }
        }

        for (int i=posicao; i<(posicao+numCartIndiv); i++) {
            if (getCartaMesa(i) == null) {
                mesa[i] = carta;
                break;
            }
        }

        return qtnCartasNaMesa(posicao);
    }

    public static int[] isDoisPokemon() {
        int[] pok = new int[]{-1, -1};
        for (int i=0; i<mesa.length; i++) {
            if (getCartaMesa(i) != null) {
                if (mesa[i].getTipo() == Tipo.POKEMON)
                    if (i < (mesa.length / 2))
                        pok[0] = i;
                    else
                        pok[1] = i;
            }
        }
        return pok;
    }

    public static void derrotadoPokemon(int posicao) {
        int ini;
        if (posicao < numCartIndiv)
            ini = 0;
        else
            ini = numCartIndiv;
        
        for (int i=ini; i<(ini+numCartIndiv); i++) {
            if (getCartaMesa(i) != null) {
                if (i != posicao) {
                    if ((getCartaMesa(i).getTipo() == Tipo.ENERGIA) && (((Energia) getCartaMesa(i)).getElemento() == ((Pokemon) getCartaMesa(posicao)).getElemento())) {
                        // remove energia do perdedor
                        setCartaMesa(i, null);
                    }
                    if (getCartaMesa(i).getTipo() == Tipo.TREINADOR) {
                        // remove treinador do perdedor
                        setCartaMesa(i, null);
                    }
                }
            }
        }
        // remove pokemon do perdedor
        setCartaMesa(posicao, null);
    }

    public static void removeEnergiaPokemonAtack(int posicao) {
        int ini;
        if (posicao < numCartIndiv)
            ini = 0;
        else
            ini = numCartIndiv;

        for (int i=ini; i<(ini+numCartIndiv); i++) {
            if (getCartaMesa(i) != null) {
                if (((Pokemon) getCartaMesa(posicao)).getElemento() == TipoElemento.NORMAL) {
                    if (getCartaMesa(i).getTipo() == Tipo.ENERGIA) {
                        setCartaMesa(i, null);
                        break;
                    }
                }
                if ((getCartaMesa(i).getTipo() == Tipo.ENERGIA) && (((Energia) getCartaMesa(i)).getElemento() == ((Pokemon) getCartaMesa(posicao)).getElemento())) {
                    // remove a energia do ataque
                    setCartaMesa(i, null);
                    break;
                }
            }
        }
    }

    public static void removerTreinadorPokemonAtack(int posicao) {
        int ini;
        if (posicao < numCartIndiv)
            ini = 0;
        else
            ini = numCartIndiv;

        for (int i=ini; i<(ini+numCartIndiv); i++) {
            if (getCartaMesa(i) != null) {
                if (getCartaMesa(i).getTipo() == Tipo.TREINADOR) {
                    ((Treinador) getCartaMesa(i)).diminuirForca((Pokemon) getCartaMesa(posicao));
                    setCartaMesa(i, null);
                    break;
                }
            }
        }
    }

    // private static boolean semCartasNaMesa(int pos, Carta[] checkMesa) {
    //     boolean retorno = true;
    //     for (int i=pos; i<(pos+3); i++)
    //         if (checkMesa[i] != null)
    //             retorno = false;
    //     return retorno;
    // }
}