import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double masaKerja, bonus, totalGaji;

        System.out.println("Masukkan masa kerja:");
        masaKerja = input.nextDouble();
        
        if (masaKerja > 3){
            bonus = 300000;
        }else {
            bonus = 150000;
        }
           System.out.println("Bonus: Rp"+ bonus);

           totalGaji = 300000 + bonus;
           
           System.out.println("gaji yang diterima: Rp" + totalGaji);
    }   
    }