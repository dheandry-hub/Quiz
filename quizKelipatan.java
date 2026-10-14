package LiveCoding;
import java.util.Scanner;

public class quizKelipatan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i = 1;
        int n;
        int total = 0;
            System.out.print("Masukkan n : ");
            n = input.nextInt();

        for(i = 1; i<=n ; i++)
            if (i % 3 == 0 || i % 5 == 0) {
                total = total + i;
            }
            System.out.println("Hasil : " + total);
        input.close();
        }
    }
