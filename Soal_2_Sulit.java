import java.util.Scanner;

public class Soal_2_Sulit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berapa baris yang diinginkan: ");
        int baris = input.nextInt();
        System.out.print("Masukkan berapa kolom yang diinginkan: ");
        int kolom = input.nextInt();

        int [][] matriks_a = new int [baris][kolom];
        int [][] matriks_b = new int [baris][kolom];
        int [][] hasil = new int [baris][kolom];
        
        System.out.println("Masukkan isi matriks_a");
        for (int i = 0; i<baris;i++) {
            for (int j = 0; j<kolom; j++){
                System.out.print("A[" + i + "] [" + j + "] = " );
                matriks_a[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i<baris;i++) {
            for (int j = 0; j<kolom; j++){
                System.out.print("B[" + i + "] [" + j + "] = " );
                matriks_b[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i<baris;i++) {
            for (int j = 0; j<kolom; j++){
                hasil[i][j] = matriks_a[i][j] + matriks_b[i][j];
            }
        }

        for (int i = 0; i<baris;i++) {
            for (int j = 0; j<kolom; j++){
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
