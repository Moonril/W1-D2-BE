package esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int num = scanner.nextInt();

        /*while(num >= 0){
            System.out.println(num -1);
            num--;
        }
        System.out.println("Conto alla rovescia terminato!");*/

        for (int i = num; i>0; i--){
            System.out.println(i-1);
        }

    }
}
