package estruturadedados.dominio;

import java.util.InputMismatchException;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int estrutura[];

    public Fila(int tamanhoFila) {
        int primeiro = 0;
        int ultimo = 0;
        estrutura = new int[tamanhoFila];
    }

    public boolean filaCheia() {
        if (ultimo == estrutura.length) {
            return true;
        }
        return false;
    }

    public boolean filaVazia() {
        if (primeiro == ultimo) {
            return true;
        }
        return false;
    }

    public void inserir(int item)throws Exception {
        if (filaCheia()) {
            System.err.println("A fila está cheia, não é possível inserir mais valores");
        } else {
            estrutura[ultimo] = item;
            ultimo++;
        }

    }

    public int remover() throws Exception{
        if (filaVazia()) {
            System.err.println("A fila está vazia, não é possível remover mais valores");
        } else {
            primeiro++;
        }
        return 0;
    }

    public void imprime() {
        System.out.print("[");
        for (int i = primeiro; i < ultimo; i++) {
            System.out.print(estrutura[i] + " ");
        }
        System.out.println("]");
    }
}
