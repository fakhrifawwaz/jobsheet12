import java.util.Scanner;

public class Kafe15{
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }


        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem,String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            int diskon = hargaTotal * 50 / 100;
            System.out.println("Diskon 50%: Rp " + diskon);
            hargaTotal -= diskon;

        } else if (kodePromo.equals("DISKON30")) {
            int diskon = hargaTotal * 30 / 100;
            System.out.println("Diskon 30%: Rp " + diskon);
            hargaTotal -= diskon;

        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid.");
        }
        
        hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Menu("Andi", true);
    
    int totalKeseluruhan = 0;
    String lanjut = "y";
    
    while (lanjut.equalsIgnoreCase("y")) {
        System.out.print("\nNomor menu: ");
        int pilihanMenu = sc.nextInt();
        
        System.out.print("Jumlah item: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Kode promo: ");
        String kodePromo = sc.nextLine();
        
        int subtotal = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        totalKeseluruhan += subtotal;
        System.out.println("Subtotal: Rp " + subtotal);
        
        System.out.print("Tambah pesanan? (y/n): ");
        lanjut = sc.nextLine();
    }
    
    System.out.println("\nTOTAL KESELURUHAN: Rp " + totalKeseluruhan);
    sc.close();
    }
}