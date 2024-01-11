    import java.util.Scanner;

    public class KategoriBmi {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println("Masukkan Nama:");
            String nama = input.nextLine();
            System.out.println("Masukkan Tinggi Badan:");
            double tinggi = input.nextDouble();
            System.out.println("Masukkan Berat:");
            double berat = input.nextDouble();

            String kategori = null;
            double BMI = berat/(tinggi*tinggi);
            
            if(BMI <17){
            kategori="Kurus Berat";
            }else if(BMI <=17 && BMI <=18.4){
            kategori="Kurus Ringan";
            }else if(BMI >18.5 && BMI <=25.0){
            kategori ="Normal";
            }else if(BMI <=25.1 && BMI <=27.0){
            kategori ="Gemuk Ringan";
            }else if(BMI >=27){
                kategori ="Gemuk Berat" ;
            }

            System.out.println("=Menghitung BMI=");
            System.out.println(nama);
            System.out.println(BMI);
            System.out.println(kategori);
        



        }
    }
