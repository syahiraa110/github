import java.util.Scanner;
public class BayarSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jalurMasuk, namaMhs;
        int pendapatan, DSP, SPP, bulan, totalBayar;
   
         
        
         System.out.println("Masukkan nama mahasiswa:");
         namaMhs = input.nextLine();

         System.out.println("Masukkan besar pendapatan orang tua:");
         pendapatan = input.nextInt();

         System.out.println("Masukkan jumlah bulan yang dibayar:");
         bulan = input.nextInt();

         input.nextLine();

         System.out.println("Pilihan jalur masuk:");
         System.out.println("1. SBMPTN\n2. SNMPTN\n3. Mandiri");
         System.out.println("Masukkan pilihan ada (1/2/3):");
         jalurMasuk = input.nextLine();

         switch (jalurMasuk){
            case "1":
            if (pendapatan < 2000000){
                DSP = 5000000;
                SPP = 500000;
            }else if (pendapatan >= 2000000 && pendapatan <= 10000000){
                DSP= 15000000;
                SPP= 1000000;    
            }else{
                DSP= 3000000;
                SPP= 2000000;
        }
        SPP = bulan * SPP;
        System.out.println("Besar SPP: Rp" + SPP);
        System.out.println("Besar DSP: Rp" + DSP);
        totalBayar = DSP + SPP;
        System.out.println("Total bayar: RP" + totalBayar);
        break;

           case "2":
            if (pendapatan < 2000000){
                DSP = 7000000;
                SPP = 500000;
            }else if (pendapatan >= 2000000 && pendapatan <= 10000000){
                DSP= 17000000;
                SPP= 1000000;    
            }else {
                DSP= 3200000;
                SPP= 2000000;
            }
            SPP = bulan * SPP;
            System.out.println("Besar SPP: Rp" + SPP);
            System.out.println("Besar DSP: Rp" + DSP);
            totalBayar = DSP + SPP;
            System.out.println("Total bayar: RP" + totalBayar);
            break;    

        

            case "3":
            if (pendapatan < 2000000){
                DSP = 10000000;
                SPP = 100000;
            }else if (pendapatan >= 2000000 && pendapatan <= 10000000){
                DSP= 25000000;
                SPP= 2000000;    
            }else{
                DSP= 5000000;
                SPP= 3000000;
            }
            SPP = bulan * SPP;
            System.out.println("Besar SPP: Rp" + SPP);
            System.out.println("Besar DSP: Rp" + DSP);
            totalBayar = DSP + SPP;
            System.out.println("Total bayar: RP" + totalBayar);
            break;   

            }

        }
        
    }    