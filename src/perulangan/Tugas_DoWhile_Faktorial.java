package perulangan;

import java.util.Scanner;

public class Tugas_DoWhile_Faktorial {
    public static void main(String[] args) {
        Scanner rexsy = new Scanner(System.in);
        System.out.println("Inputkan Bilangan : ");

        int faktorial = rexsy.nextInt();
        int a=1;
        int b=faktorial;
        System.out.println(b+" ! = ");

        do {
            if (b==1) {
                System.out.println(b + " = ");
            }else {
                System.out.println(b + " = ");
            }
            a*=b;
            b--;
        }while (b>0);
        System.out.println(a);
    }
}

