import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[5];
        int soma=0;

        System.out.println("Digite 5 números inteiros:");
        for(int i = 0; i< valores.length; i++){
            valores[i] = entrada.nextInt();
        }


        for(int i = 0; i< valores.length; i++){
            soma = soma + valores[i];
        }

        System.out.println("A soma dos números lidos é " + soma);
    }
}
