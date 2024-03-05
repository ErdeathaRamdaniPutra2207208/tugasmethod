/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menghitung
Pembagi Bersama Terbesar dari dua buah bilangan a dan b yang diinput dari alat
masukan.*/

package tugasmethod;

import java.util.Scanner;

public class Nomor_3 {
    static int fpb(int a, int b){
        int fpb = a;
        while (b != 0) {
            int temp = b;
            b = fpb % b;
            fpb = temp;
        }
        
        return fpb;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input angka dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = in.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = in.nextInt();
        int bantuan = bil2;

        // Tampilkan hasil
        System.out.println("FPB dari " + bil1 + " dan " + bantuan + " adalah: " + fpb(bil1, bil2));
    }
}
