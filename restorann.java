import java.util.Scanner;

public class restorann {
    public static void main(String[] args) {
        // daftar menu beserta harga
        String[] menu = {"Ayam goreng", "Ayam bakar", "Es matcha", "Es coklat"};
        double[] harga = {12000.0, 12000.0, 6000.0, 6000.0};

        // Menampilkan menu kepada pengguna
        System.out.println("Menu Restoran:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        Scanner input = new Scanner(System.in);
        double totalBiaya = 0.0;

        while (true) {
            System.out.print("Pilih menu (nomor) atau 0 untuk selesai: ");
            int pilihan = input.nextInt();

            // Cek jika pengguna ingin keluar
            if (pilihan == 0) {
                break;
            }

            // Memeriksa apakah pilihan valid
            if (pilihan >= 1 && pilihan <= menu.length) {
                int indexMenu = pilihan - 1;
                System.out.println("Anda memesan: " + menu[indexMenu]);
                totalBiaya += harga[indexMenu];
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        // Menampilkan tagihan
        System.out.println("Total biaya: Rp" + totalBiaya);

        // Meminta pembayaran dari pengguna
        System.out.print("Masukkan jumlah uang: Rp");
        double uangDibayarkan = input.nextDouble();

        // Menghitung kembalian atau memberi tahu jika uang kurang atau pas
        if (uangDibayarkan == totalBiaya) {
            System.out.println("Uang anda pas.");
        } else if (uangDibayarkan < totalBiaya) {
            System.out.println("Maaf, uang anda kurang.");
        } else {
            double kembalian = uangDibayarkan - totalBiaya;
            System.out.println("Kembalian: Rp" + kembalian);
        }

        input.close();
    }
}