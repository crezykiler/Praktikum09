import java.util.Scanner;
public class CafeSearch17 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik","Cappuccino", "Chocolate Ice"
        };

        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String namaMakanan = scanner.nextLine();

        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(namaMakanan)) { 
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan \"" + namaMakanan + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + namaMakanan + "\" tidak ditemukan di menu.");
        }

        scanner.close();
    }
}
