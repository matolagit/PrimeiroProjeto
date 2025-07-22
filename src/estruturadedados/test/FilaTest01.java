package estruturadedados.test;

import estruturadedados.dominio.Fila;

import java.util.Scanner;

public class FilaTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(3);

        int opcao = 0;
        int item;
        do {
            System.out.println("Aperte 0 para sair");
            System.out.println("Aperte 1 para inserir valor na fila");
            System.out.println("Aperte 2 para remover valor da fila");
            System.out.println("Aperte 3 para imprimir a fila");
            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("Digite o valor: ");
                item = scanner.nextInt();
                fila.inserir(item);
            } else if (opcao == 2) {
                item = fila.remover();
            }else {
                fila.imprime();
            }
        }while (opcao != 0);
    }
}
