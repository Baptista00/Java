package fifo

public class fifo {


    private int[] dados; //armazenamento dos dados
    private int[] inicio; //controle do inicio da fila
    private int[] fim; // controle do final da fila
    private int[] quantidade; // controla quantidade atual de elementos
    
    public fifo(int tamanho) {
        dados = new int[tamanho];
        inicio =0 ;
        fim =0 ; 
        quantidade =0 ;
    }
    public boolean inserir(int valor) {
        if (quantidade == dados.length) {
            return false;
        } else {

            dados [fim]=valor;
            fim = (fim + 1)% dados.length; 
            quantidade++;
            return true;

        }

    public int remover(){
        if (quantidade == 0) { //verifica se a lista esta vazia
            return -404
        }else {

            int valor = dados[inicio];
            
            inicio = (inicio + 1)% dados.length;
            quantidade --;
            return valor;
        }

    }

    public void mostrar() {
        if (quantidade == 0 ){
            System.out.println("lista vazia");
            return;
        }else {
            for (int i = 0; i < quantidade; i++){
                int posicao =(inicio + 1) % dados.length;
                System.out.println("Valor:"+ dados(posicao)+ "na posicao:")
            }
        }
    }


    public int vagas () {
        return dados.length - quantidade;
    }

    
    public int cabeca() {
        if (quantidade == 0) {
            return -404; {
                else {
                    return dados[inicio];
                }
            }
        }
    }

    }



}