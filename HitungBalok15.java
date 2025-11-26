import java.util.Scanner;

public class HitungBalok15 {
    static int hitungLuas (int pjg,int lb ){
        int Luas = pjg * lb;
        return Luas;
    }
    
    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;
        
        System.out.println("Masukkan panjang");
        p = sc.nextInt();
        System.out.println("Masukkan lebar");
        l = sc.nextInt();
        System.out.println("Masukkan tinggi");
        t = sc.nextInt();

        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);
        vol = L * t;
        System.out.println("Volume balok adalah " + vol);

        sc.close();
    }
}
