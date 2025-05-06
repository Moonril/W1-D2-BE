package esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");

        int numeroInt = scanner.nextInt();

        switch(numeroInt) {
            case 0:
                System.out.println("zero");
            break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("errore");

        }

        /* if(numeroInt >= 0 && numeroInt <= 3){
            System.out.println(numeroInt);

        } else {
            System.out.println("errore");

        } */
    }
}
