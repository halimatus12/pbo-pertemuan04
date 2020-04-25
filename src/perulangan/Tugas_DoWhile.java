package perulangan;

import java.util.Scanner;

public class Tugas_DoWhile {
    public static void main(String[] args) {
        int n = 5;
        int hasil = 0;
        int i = 1;
        do {
            System.out.println(i);
            if (i != n) {
                System.out.println(" + ");
            } else {
                System.out.println(" = ");
            }
            hasil += i;
            i++;
        } while (i <= n);
        System.out.println(hasil);
    }
}

