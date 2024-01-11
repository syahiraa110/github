import java.util.Scanner;
public class ratarata {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, mataPelajaran;
        double nilai1, nilai2, nilai3, nilai4, nilai5, ratarata;
        String predikat = null;

        System.out.println("Masukkan nama:");
        nama = input.nextLine();
    

        System.out.println("Masukkan nilai agama:");
        nilai1 = input.nextDouble();
        System.out.println("Masukkan nilai pkn:");
        nilai2 = input.nextDouble();
        System.out.println("Masukkan nilai bahasaIndonesia:");
        nilai3 = input.nextDouble();
        System.out.println("Masukkan nilai bahasaInggris:" );
        nilai4= input.nextDouble();
        System.out.println("Masukkan nilai matematika:");
        nilai5= input.nextDouble();

        ratarata = (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5;

        if (ratarata >=0.0 && ratarata <25.0){
            predikat= "F";
        } else if (ratarata  >=25.0 && ratarata <= 45.0){
            predikat= "E";
        } else if(ratarata >=46.0 && ratarata <=50.0){
            predikat= "D";
        } else if(ratarata >=51.0 && ratarata <=60.0){
             predikat= "C";
        } else if(ratarata >=61.0 && ratarata <=80.0){
             predikat= "B";
        } else if(ratarata >=81.0 && ratarata <=100.0){
             predikat= "A";
        }
        
         System.out.print("Rata-rata nilai:" + ratarata);
         System.out.print("Predikat:" + predikat);




        
    }
}