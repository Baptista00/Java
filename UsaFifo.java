package listas
 
import java.utill.Scanner;

public class UsaFifo {

    public static void main (String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Informe o valor do tamanho");
        int tamanho = sc.nextInt();
        Fifo minha = new Fifo(tamanho);
        int opcao, valor;

        do {

            System.out.println("\nSISTEMA DE PILHA (LIFO)");
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
                        System.out.println("Valor inserido com sucesso");
                    else
                        System.out.println("FIla cheia");
                    break;

                case 2:
                    valor = minha.removerTopo();
                    if (valor == -404)
                        System.out.println("Lista está vazia");
                    else
                        System.out.println("Valor Removido: " + valor);
                    break;

                case 3:
                    minha.mostrar();
                    break;

                case 4:
                    System.out.println("Vagas: " + minha.vagas());
                    break;

                case 5:
                    valor = minha.cabeca();

                    if (valor == -404)
                        System.out.println("Pilha vazia");
                    else
                        System.out.println("Topo: " + valor);
                    break;

                case 9:
                    System.out.println("ESaiu");
                    
            }

        } while (opcao != 9);

        sc.close();
        System.out.println("Sistema finalizado");
    }
}


    
