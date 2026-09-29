public class Main {
    public static void main(String[] args) {

        No no1 = new No(10);
        No no2 = new No(20);
        No no3 = new No(30);
        No no4 = new No(40);

        no1.proximo = no2;
        no2.proximo = no3;
        no3.proximo = no4;

        /*
        System.out.println("Inicial: " + no1.getValor());
        System.out.println("Proximo: " + no1.proximo.getValor());
        System.out.println("Proximo: " + no1.proximo.proximo.getValor());
        System.out.println("Proximo: " + no1.proximo.proximo.proximo.getValor());
         */

        No atual = no1;

        //While para percorrer a lista de Nó e Encadeamento

        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.proximo;


        }
    }
}