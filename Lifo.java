package Listas;

public class Lifo {

 
private int[] dados;// Vetor que armazenará os elementos da pilha 
private int topo;// Variável que controla o topo da pilha Quando vale -1 significa que está vazia


    public Lifo(int tamanho) { // Recebe como parâmetro o tamanho da pilha
        dados = new int[tamanho];// Cria o vetor com o tamanho informado pelo usuário  
        topo = -1; // Inicializa o topo como -1 (pilha vazia)
    }

    public boolean inserir(int valor) {
    if (topo == dados.length - 1) // Verifica se a pilha está cheia Se topo for igual ao último índice do vetor
            return false;

        topo++; // Incrementa o topo (sobe uma posição)

        dados[topo] = valor;// Armazena o valor na posição do topo
        
        return true;
    }

    public int removerTopo() { // Método para remover elemento do topo
        if (topo == -1)     // Verifica se a pilha está vazia
            return -999; // Código de erro 
        
        int valor = dados[topo]; // Guarda o valor que será removido
        topo--;// Decrementa o topo (remove logicamente o elemento)
        return valor;
    }
    
    public void mostrar() {
        for (int i = topo; i >= 0; i--)     // Percorre do topo até o início
            System.out.println(dados[i]); // Mostra cada elemento
    }

    public int vagas() { // Método que retorna quantidade de vagas disponíveis
        return dados.length - (topo + 1);// Total de posições menos quantidade ocupada
    }

    public int cabeca() { // Método que retorna o elemento do topo sem remover
        
        if (topo == -1)// Verifica se está vazia
            return -999;
        return dados[topo];
    }
}
