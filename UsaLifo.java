package Listas;

import java.util.Scanner;

public class UsaLifo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da PILHA: ");
        int tamanho = sc.nextInt(); // Solicita ao usuário o tamanho da pilha

        Lifo minha = new Lifo(tamanho); // Cria objeto da classe Lifo com o tamanho informado

        int opcao, valor; // Variáveis de controle

        do {

            System.out.println("\nSISTEMA PILHA (LIFO)");
            System.out.println("1 - Inserir");
            System.out.println("2 - Retirar");
            System.out.println("3 - Mostrar");
            System.out.println("4 - Vagas");
            System.out.println("5 - Cabeça");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt(); // Captura opção digitada

            switch (opcao) {

                case 1:
                    System.out.print("Informe o valor: ");
                    valor = sc.nextInt();

                    if (minha.inserir(valor))
                        System.out.println("Inserido com sucesso");
                    else
                        System.out.println("Pilha cheia");
                    break;

                case 2:
                    valor = minha.removerTopo();

                    if (valor == -999)
                        System.out.println("Pilha vazia");
                    else
                        System.out.println("Removido: " + valor);
                    break;

                case 3:
                    minha.mostrar();
                    break;

                case 4:
                    System.out.println("Vagas: " + minha.vagas());
                    break;

                case 5:
                    valor = minha.cabeca();

                    if (valor == -999)
                        System.out.println("Pilha vazia");
                    else
                        System.out.println("Topo: " + valor);
                    break;

                case 9:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 9);

        sc.close();
        System.out.println("Fim do programa");
    }
}
