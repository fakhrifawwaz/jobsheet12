import java.util.Scanner;

public class RekapPenjualanCafe15 {
    static void inputDataPenjualan(int[][] penjualan, String[] menu) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++){
            System.out.println("Input data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(" Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void tampilkanDataPenjualalan(int[][] penjualan, String[] menu) {
        System.out.println("\n=== REKAP PENJUALAN KAFE ===");
        System.out.print("Menu\t\t");
        for (int j = 0; j < penjualan[0].length; j++){
            System.out.print("Hari " + (j + 1) + "\t");
        }
        System.out.println();
        System.out.println("=======================================================");

        for (int i = 0; i < menu.length; i++){
            System.out.print(menu[i] + "\t\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuPenjualanTertinggi(int[][] penjualan, String[] menu) {
        int maxTotal = 0;
        int indexMax = 0;
        
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            
            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }
        
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexMax]);
        System.out.println("Total Penjualan: " + maxTotal);
    }
    static void rataRataPenjualan(int[][] penjualan, String[] menu) {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");
        
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Data menu kafe
        String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        
        // Array 2D untuk menyimpan data penjualan (5 menu x 7 hari)
        int[][] penjualan = new int[5][7];
        
        // Memanggil fungsi input data penjualan
        inputDataPenjualan(penjualan, menu);
        
        // Menampilkan seluruh data penjualan
        tampilkanDataPenjualalan(penjualan, menu);
        
        // Menampilkan menu dengan penjualan tertinggi
        menuPenjualanTertinggi(penjualan, menu);
        
        // Menampilkan rata-rata penjualan untuk setiap menu
        rataRataPenjualan(penjualan, menu);
        
        sc.close();
    
    }

}
