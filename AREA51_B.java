package Fundamentos;

import java.util.Scanner;

public class AREA51_B {

    public static void main(String[] args) {
        //Teste realizado para aprender melhor a funcionalidade de entrada no console.
        Scanner entrauser = new Scanner(System.in);
        System.out.println("Digite uma frase bacana para que eu a recite depois: ");
        String saida = entrauser.nextLine();

        System.out.println("Me conte uma piada: ");
        String saidaum = entrauser.nextLine();



        System.out.println(saida + "\n" + saidaum);

    }

}
