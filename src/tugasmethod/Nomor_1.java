/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, mengulang
menuliskan teks “Saya senang belajar bahasa Java” sebanyak N kali, dengan nilai N yang
akan dibaca dengan perintah inputan menggunakan perulangan for.*/

package tugasmethod;

import java.util.Scanner;

public class Nomor_1 {
    static void print(int a){
        for(int i=0;i<a;i++){
           System.out.println("Saya senang belajar bahasa Java");
        }
    }
    
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        
        a=in.nextInt();
        
        print(a);
        
    }
    
}
