import java.util.Scanner;
public class Cafe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 
     
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1) + ":");
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        System.out.println("\nDaftar Pesanan:");
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\nTotal Biaya: Rp" + totalBiaya);
        sc.close();
    }
}
