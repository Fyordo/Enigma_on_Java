// "MGKA DBBDWDZEYG, AOBAM UHY!" 14/8/8/ENQIAFLMDJKGHBRSCOPUTYWZVX

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args){

        int p1, p2, p3;
        String alphabet;
        Scanner in = new Scanner(System.in);

        String mess = in.nextLine().toUpperCase();
        System.out.println();


        System.out.print("Задайте позицию ротора 1: ");
        p1 = in.nextInt();
        System.out.print("Задайте позицию ротора 2: ");
        p2 = in.nextInt();
        System.out.print("Задайте позицию ротора 3: ");
        p3 = in.nextInt();
        System.out.print("Задайте настройку плагборда: ");
        alphabet = in.next();
        System.out.println();


        ENIGMA e1 = new ENIGMA(p1, p2, p3, alphabet);

        System.out.printf("Закодированное сообщение: %s", e1.MessCode(mess));
        System.out.println();
        System.out.printf("Декодированное сообщение: %s", e1.MessDecode(mess));
        System.out.println();
    }
}

// ABCDEFGHIJKLMNOPQRSTUVWXYZ
// ENQIAFLMDJKGHBRSCOPUTYWZVX