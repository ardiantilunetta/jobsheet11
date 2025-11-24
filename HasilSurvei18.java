import java.util.Scanner;

public class HasilSurvei18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasilsurvey[][] = new int[10][6];

        for (int r = 0 ; r < hasilsurvey.length ; r++) {
            System.out.println("Responden "+(r+1));

            for (int p = 0 ; p < hasilsurvey[r].length ; p++) {

                while (true) {
                    System.out.print("Nilai pertanyaan " + (p+1) + " : ");
                    int nilai = sc.nextInt();

                    if (nilai >= 1 && nilai <= 5) {
                        hasilsurvey[r][p] = nilai;
                        break;
                    } else {
                        System.out.println("Tidak valid! Masukkan nilai 1-5");
                    }
                }
            }
        }

        System.out.println("---- RATA RATA SETIAP RESPONDEN ----");
        for (int r = 0 ; r < hasilsurvey.length ; r++) {
            double responden = 0;

            for (int p = 0 ; p < hasilsurvey[r].length ; p++) {
                responden += hasilsurvey [r][p];
            }
            System.out.println("Responden "+(r+1)+" : "+(responden/hasilsurvey[r].length));
        }

        System.out.println("---- RATA RATA SETIAP PERTANYAAN ----");
        for (int p = 0 ; p < hasilsurvey[0].length ; p++) {
            double pertanyaan = 0;

            for (int r = 0 ; r < hasilsurvey.length ; r++) {
                pertanyaan += hasilsurvey [r][p];
            }
            System.out.println("Pertanyaan "+(p+1)+" : "+(pertanyaan/hasilsurvey.length));
        }
    }
}