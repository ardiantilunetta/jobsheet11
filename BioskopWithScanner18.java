import java.util.Scanner;

public class BioskopWithScanner18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("---- MENU BIOSKOP ----");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
        } while (pilihan != 3);

        // while (true) {
        //     System.out.print("Masukkan nama: ");
        //     nama = sc.nextLine();
        //     System.out.print("Masukkan baris: ");
        //     baris = sc.nextInt();
        //     System.out.print("Masukkan kolom: ");
        //     kolom = sc.nextInt();
        //     sc.nextLine();

        //     penonton[baris-1][kolom-1] = nama;

        //     System.out.print("Input penonton lainnya? (y/n): ");
        //     next = sc.nextLine();

        //     if (next.equalsIgnoreCase("n")) {
        //         break;
        //     }
        // }
    }
}