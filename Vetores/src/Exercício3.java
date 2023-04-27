import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.println("Digite 10 números inteiros: ");
        for(int i = 0; i < valores.length; i++){
            valores[i] = entrada.nextInt();
        }

        System.out.println("Entre os números inseridos, os pares são: ");
        for(int i = 0; i < valores.length; i++){
            if(valores[i] % 2 == 0){
                System.out.println(valores[i]);
            }
        }
    }
}
