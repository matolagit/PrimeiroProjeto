package estruturadedados.test;

import estruturadedados.dominio.Fila;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FilaTest01 {
    public static void main(String[] args) throws Exception {
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
                try {
                    System.out.println("Digite o valor: ");
                    item = scanner.nextInt();
                    fila.inserir(item);
                }catch (Exception e){
                    throw new Exception(e.getMessage());
                }
            } else if (opcao == 2) {
                try {
                    item = fila.remover();
                }catch (Exception e){
                    throw new Exception(e.getMessage());
                }
            }else if (opcao == 3){
                fila.imprime();
            }
            else{
                if (opcao >= 4){
                    throw new InputMismatchException("Selecione as opções apresentadas no menu.");
                }
            }
        }while (opcao != 0);
    }
}
