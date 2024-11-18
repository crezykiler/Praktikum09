import java.util.Scanner;
public class ArrayNilaiMHS17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double total = 0, rata2 = 0;
        
        System.out.print("Masukkan Jumlah mahasiswa: ");
        int MHS[] = new int[sc.nextInt()];
        int nilai[] = new int[5];
     
        for (int i = 0; i < MHS.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1) );
            int nilaiTertinggi = Integer.MIN_VALUE;
            int nilaiTerendah = Integer.MAX_VALUE;
            for (int j = 0; j < nilai.length; j++) {
                System.out.print("Masukkan nilai ke-"+(j+1)+" : ");
                nilai[j] = sc.nextInt();
                total += nilai[j];
                if (nilai[j] > nilaiTertinggi ) {
                    nilaiTertinggi = nilai[j];
                }
                if (nilai[j] < nilaiTerendah) {
                    nilaiTerendah = nilai[j];
                }
            }
            rata2 = total/nilai.length;
            System.out.println("Nilai Mahasiswa : ");    
            for (int k : nilai) {
                System.out.println("Nilai "+k);
            }  
            System.out.println("Rata rata nilai : "+rata2);
            System.out.println("Nilai tertinggi : "+nilaiTertinggi);
            System.out.println("Nilai terendah : "+nilaiTerendah);
            }
            System.out.println();
        }
    }

