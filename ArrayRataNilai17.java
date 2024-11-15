import java.util.Scanner;
public class ArrayRataNilai17 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double total = 0, totalTidakLulus = 0;
    int MHS = 0, jumlahTidakLulus = 0;
    double rata2, rata3;

        System.out.print("Masukkan jumlah mahasiswa : ");
        MHS = sc.nextInt();
    
    int[] nilaiMHS = new int[MHS];

    for (int i = 0; i < nilaiMHS.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMHS[i] = sc.nextInt();
    }

        for (int i = 0; i< nilaiMHS.length; i++) {
            total += nilaiMHS[i]; 
            if (nilaiMHS[i] < 70) {
                totalTidakLulus += nilaiMHS[i];
                jumlahTidakLulus++;
            }

        }
    rata2 = total/nilaiMHS.length;
    System.out.println("Rata-rata nilai = " + rata2);
        if (jumlahTidakLulus > 0) {
            rata3 = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rata3);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
    
    }
}
