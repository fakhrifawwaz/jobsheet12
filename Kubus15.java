import java.util.Scanner;

public class Kubus15 {

    static int hitungLuas (int sisi){
        int luas = 6 * sisi;
        return luas;
    }

    static int hitungVolume (int s){
        int volume = s * s * s;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, L, volume;
        System.out.println("Masukkan sisi kubus");
        sisi = sc.nextInt();

        L = 6 * (sisi * sisi);
        System.out.println("Luas permukaan kubusnya adalah " + L );
        volume = sisi * sisi * sisi;
        System.out.println("Volume kubusnya adalah " +volume);

        sc.close();

    }
}
