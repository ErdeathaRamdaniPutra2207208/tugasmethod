/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
jumlah deret bilangan genap dari batasAwal dan batasAkhir yang diinput dari alat
masukan.*/

package tugasmethod;

import java.util.Scanner;

public class Nomor_2 {
    static int deret(int a, int b){
        int total=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                total+=1;
            }
        }
        return total;
    }
    
    public static void main(String[] args) {
        int awal, akhir;
        Scanner in = new Scanner(System.in);
        
        awal = in.nextInt();
        akhir = in.nextInt();
        
        System.out.println("Jumlah deret bilangan genap dari " + awal +" - "+akhir+" adalah "+ deret(awal, akhir));
    }
    
}
