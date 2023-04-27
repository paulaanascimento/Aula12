import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] bandaMusica = new String[4];

        System.out.println("Digite o nome da banda: ");
        bandaMusica[0] = entrada.nextLine();

        System.out.println("Agora insira 3 músicas dessa banda: ");
        for(int i = 1; i < bandaMusica.length; i++){
            bandaMusica[i] = entrada.nextLine();
        }

        System.out.println("-----------------------------");

        System.out.println(bandaMusica[0] + "\n");
        for(int i = 1; i < bandaMusica.length; i++){
            System.out.println(bandaMusica[i]);
        }
    }
}
