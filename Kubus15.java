import java.util.Scanner;

public class Kubus15 {
    
    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    
    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, vol, luas;
        
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc.nextInt();
        
        vol = hitungVolume(sisi);
        System.out.println("Volume kubus adalah: " + vol);

        luas = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah: " + luas);
        
        sc.close();
    }
}
