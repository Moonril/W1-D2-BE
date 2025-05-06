package esercizio1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una parola");
        String str = scanner.nextLine();
        System.out.println(stringaPariDispari(str));

        /*System.out.println("inserisci un anno");
        int num = scanner.nextInt();
        System.out.println(annoBisestile(num));*/



    }



    public static boolean annoBisestile(int a){

        if (a % 4 == 0 || (a % 100 == 0 && a % 400 == 0)){
            System.out.println("l'anno: " + a + " è un anno bisestile");
            return true;
        } else {
            System.out.println("l'anno: " + a + " non è un anno bisestile");

            return false;
        }
    }

    public static boolean stringaPariDispari(String a){
        if (a.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
