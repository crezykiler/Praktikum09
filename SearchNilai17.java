import java.util.Scanner;
public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai = 0, MHS = 0, key = 0, hasil = 0;
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        nilai = sc.nextInt();
        int nilaiMHS[] = new int[nilai];
        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMHS[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < nilaiMHS.length; i++) {
            if (key == nilaiMHS[i]){
                hasil = (i+1);
                break;
            } 
            else {
                System.out.println("Nilai yang dicari tidak ditemukan.");
                return;
            }
        }

        System.out.println();
        System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-" +hasil);
        System.out.println();
    }
}
