package estruturadedados.dominio;

public class Pilha {
    private int tamanho;
    private int estrutura[];

    public Pilha(int tamanhoPilha) {
        tamanho = 0;
        estrutura = new int[tamanhoPilha];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(int estrutura[]) {
        this.estrutura = estrutura;
    }

    public boolean estaCheia() {
        if (tamanho == estrutura.length) {
            return true;
        }
        return false;
    }

    public boolean estaVazia() {
        return (tamanho == 0);
    }

    public void inserir(int item)throws Exception {
        if (estaCheia()) {
            System.err.println("A pilha está cheia, não é possivel inserir mais valores.\n");
        } else {
            estrutura[tamanho] = item;
            tamanho++;
        }
    }

    public int remover()throws Exception {
        if (estaVazia()) {
            System.err.println("A pilha está vazia, não tem como remover mais valores.\n");
        } else {
            tamanho--;
        }
        return 0;
    }

    public void imprime() {
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(estrutura[i] + " ");
        }
        System.out.println("]");
    }
}
