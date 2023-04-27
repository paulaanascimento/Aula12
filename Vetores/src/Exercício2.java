import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] chamada = new String[10];

        System.out.println("Digite o nome de 10 alunos");
        for(int i = 0; i < chamada.length; i++){
            chamada[i] = entrada.next();
        }

        System.out.println("-----------------LISTA DE ALUNOS------------------");
        for(int i = 0; i < chamada.length; i++){
            System.out.println(chamada[i]);
        }
    }
}
