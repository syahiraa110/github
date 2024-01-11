import java.util.Scanner;

public class IkutPemilu {
    

public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

        int umur;
        System.out.println("Masukkan umur anda: ");
        umur = input.nextInt();

if (umur > 17 ){
    System.out.println(umur + "adalah anda boleh mengikuti pemilu");

} else {
    System.out.println(umur + "adalah tidak boleh mengikuti pemilu");
}

}
}

