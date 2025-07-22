package estruturadedados.test;

import estruturadedados.dominio.Pilha;

import java.util.Scanner;

public class PilhaTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(4);

        int opcao = 0;
        int item = 0;
        do {
            System.out.println("Aperte 0 para sair");
            System.out.println("Aperte 1 para inserir um valor na pilha");
            System.out.println("Aperte 2 para remover um valor da pilha");
            System.out.println("Aperete 3 para imprimir a pilha");
            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("Digite um valor na pilha");
                item = scanner.nextInt();
                pilha.inserir(item);
            } else if (opcao == 2) {
                item = pilha.remover();
            }else {
                pilha.imprime();
            }
        }while (opcao != 0);
    }
}
