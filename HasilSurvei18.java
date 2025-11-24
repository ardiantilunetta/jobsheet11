import java.util.Scanner;

public class HasilSurvei18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasilsurvey[][] = new int[10][6];

        for (int r = 0 ; r < 10 ; r++) {
            System.out.println("Responden "+(r+1));
            for (int n = 0 ; n < 6 ; n++) {
                System.out.print("Nilai pertanyaan "+(n+1)+" : ");
                hasilsurvey[r][n] = sc.nextInt();
            }
        }
    }
}