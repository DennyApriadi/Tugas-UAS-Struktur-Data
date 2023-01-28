import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        antrian.add("Muron");
        antrian.add("Dinda");
        antrian.add("Gita");
        antrian.add("Sarip");
        antrian.add("Cindy");

        System.out.print("********************************************************************************");
        System.out.print("\nDaftar Nama Antrian \t\t\t\t: " + antrian);
        System.out.print("\n********************************************************************************");


        while (true) {
            System.out.print("\n\nMemanggil Antrian Pertama (y/n)\t\t: ");
            char hasil = input.next().charAt(0);

            if ((hasil == 'y') || (hasil == 'Y')) {
                int size = antrian.size();
                for (int i=0; i < size; i++) {
                    String panggil = antrian.remove();
                    System.out.print("Memanggil Antrian\t\t\t\t\t: " + "[" + panggil + "]");
                    System.out.print("\nDaftar Antrian Selanjutnya \t\t\t: " + antrian + "\n");
                    System.out.print("\nMemanggil Antrian Selanjutnya (y/n)\t: ");
                    hasil = input.next().charAt(0);
                    if (antrian.size() == 0) {
                        System.out.print("\n\t||| Antrian Kosong |||\n\n");
                    }
                    else if ( hasil != 'y' ) {
                        System.out.print("\n\nAntrian Yang Tersisa Adalah \t\t: " + antrian);
                        System.out.println("\n\t   Program Berakhir\n\t+++Sistem Dimatikan+++\n\n");
                        break;
                    }
                } break;
            } else if ((hasil == 'n') || (hasil == 'N')) {
                System.out.println("\n   Baik Terimakasi\n+++Sistem Dimatikan+++\n\n");
                break;
            } else {
                System.out.println("\n||| Input Anda Salah |||\n\t+++Sistem Dimatikan+++\n\n");
                break;
            }

        }
    }
}