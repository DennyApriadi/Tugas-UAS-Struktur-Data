import java.util.Scanner;

public class Main {
    private static int [] data = {2,46,23,87,12,5,-4,66,87,9};
    private static int search;
    private static boolean ketemu = false;

    private static void squential() {
        Scanner input = new Scanner(System.in);

        System.out.print("Data Yang Ingin Dicari\t: ");
        search = input.nextInt();

        for (int i=0; i<data.length; i++) {  // Perulangan Iteratif
            if (search == data[i]) {
                ketemu = true;
                break;
            }
        }
    }

    public static void main(String[] args) {

        squential();

        for (int i=0; i<data.length; i++) {
            if (ketemu) {
                System.out.println("\nData Ditemukan");
                break;
            } else {
                System.out.println("\nData Tidak Ada !");
                break;
            }
        }


    }
}