import java.util.Scanner;

public class nilaiMahasiswa15 {
    static void isianArray(int[] arrayNilai, int N){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = sc.nextInt();
        }
        sc.close();
    }
    


    static void tampilArray(int[] arrayNilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }
    
    static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int i = 0; i < arrayNilai.length; i++){
            total += arrayNilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa, N);
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        sc.close();
    }
}
