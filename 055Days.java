
import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {

        Scanner hi = new Scanner(System.in);

        System.out.print("Masukkan angka awal (1-10): ");
        int i = hi.nextInt();

        if (i < 1 || i > 10) {
            System.out.println("Angka tidak valid!");
            hi.close();
            return;
        }

        while (i <= 10) {

            if (i == 3) {
                i++;
                continue;
            }

            if (i == 9) {
                break;
            }

            System.out.println(i);
            i++;
        }

        System.out.println("Program selesai.");

        
    }
}
