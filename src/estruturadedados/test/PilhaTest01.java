package estruturadedados.test;

import estruturadedados.dominio.Pilha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PilhaTest01 {
    public static void main(String[] args) throws Exception {
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

            if (opcao == 1) {
                try {
                    System.out.println("Digite um valor na pilha");
                    item = scanner.nextInt();
                    pilha.inserir(item);

                } catch (Exception e) {
                    throw new Exception(e.getMessage());
                }
            } else if (opcao == 2) {
                try {
                    item = pilha.remover();
                } catch (Exception e) {
                    throw new Exception(e.getMessage());
                }
            } else if (opcao == 3){
                pilha.imprime();
            }else {
                if (opcao >= 4){
                    throw new InputMismatchException("Selecione as opções apresentadas no menu.");
                }
            }

        } while (opcao != 0);
    }
}
