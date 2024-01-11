import java.util.Scanner;

public class cobaFor {
    public static void main(String[] args) {
        
        int nilaiAtas, nilaiBawah;
        int total=0;
        Scanner s =  new Scanner (System.in);
        System.out.println("Masukkan nilai bawah:");
        nilaiBawah = s.nextInt();
        System.out.println("Masukkan nilaiAtas:");
        nilaiAtas = s.nextInt();

        for(int i=nilaiBawah; i<=nilaiAtas;i++){
            total+=i;

           
         
        }

         System.out.println("hasil penjumlahan:" + total);   

    }
}