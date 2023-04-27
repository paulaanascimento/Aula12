import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidade;

        System.out.println("Digite a quantidade de itens que deseja adicionar à lista de compras: ");
        quantidade = entrada.nextInt();
        String[] listaCompras = new String[quantidade];

        System.out.println("Agora insira os produtos: ");
        for(int i = 0; i < listaCompras.length; i++){
            listaCompras[i] = entrada.next();
        }
    }
}
