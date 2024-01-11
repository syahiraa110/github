import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double pemakaian, tarif, biayaPemakaian, biayaTambahan, totalTagihan;

        System.out.print("Input besar pemakaian: ");
        pemakaian = input.nextDouble();

        
        if (pemakaian >= 0 && pemakaian <=50.0 ){
            tarif= 100;
        } else if (pemakaian >= 51 && pemakaian <=150) {
            tarif= 150;
        } if (pemakaian >= 151 && pemakaian <=250) {
            tarif = 250;
        } else {
            tarif = 300;
        }
     
        biayaPemakaian = pemakaian * tarif;
        biayaTambahan = 0.2 * biayaPemakaian;

        totalTagihan = biayaPemakaian + biayaTambahan;

        System.out.println("pemakaian:" + biayaTambahan);
        System.out.println("biayaTambahan 20%:" + biayaTambahan);
        System.out.println("total tagihan: Rp" + totalTagihan);

        input.close();

    }
}