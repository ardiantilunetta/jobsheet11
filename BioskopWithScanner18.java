import java.util.Scanner;

public class BioskopWithScanner18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, isi;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("---- MENU BIOSKOP ----");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4) {
                        System.out.println("Error: Baris tidak tersedia! (Hanya 1-4)");
                        break;
                    }
                    if (kolom < 1 || kolom > 2) {
                        System.out.println("Error: Kolom tidak tersedia! (Hanya 1-2)");
                        break;
                    }

                    penonton[baris-1][kolom-1] = nama;
                    
                    break;
            
                case 2:
                    System.out.println("---- DAFTAR PENONTON ----");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.println("Program selesai.");
                    break;


                default:
                    System.out.println("Menu tidak valid");;
            }

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