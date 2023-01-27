import java.util.Scanner;

public class Main {
    private static String [] data = new String[5];
    private static int urut = 0;

    private static void input() {
        Scanner input = new Scanner(System.in);
        String user;

        System.out.print("\nMasukan Data Nama Mahasiswa\t: ");
        user = input.nextLine();

        data[urut] = user;
        urut++;
    }

    private static void panggil() {
        urut--;
        System.out.print("\n||| Mahasiswa Berhasil Dipanggil |||\n");
    }

    private static void tampil() {
        System.out.print("\nData Mahasiswa Terbaru\t: ");
        for (int i=0; i<urut; i++) {
            System.out.print("[" + data[i] + "]-> ");
        }
        System.out.println();
    }

    private static int menu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("---> PROGRAM STACK <--- \n");

        System.out.println("====================================");
        System.out.println("~ Program Stack Data Mahasiswa ~\n");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mahasiswa");
        System.out.println("3. Panggil Antrian Mahasiswa");
        System.out.println("4. Seleseai/Keluar");
        System.out.println("====================================");

        System.out.print("Masukan Pilihan Anda\t: ");
        int pilihan = input.nextInt();
        return pilihan;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = menu();

        while (menu != 4) {
            switch (menu) {
                case 1 : {
                    input();
                    break;
                }
                case 2 : {
                    tampil();
                    break;
                }
                case 3 : {
                    panggil();
                    break;

                }
                default : {
                    break;
                }
            }

            System.out.print("\nLanjutkan (y/n)\t: ");
            int user = input.next().charAt(0);

            if ((user == 'y') || (user == 'Y')) {
                menu = menu();
            } else {
                break;
            }

        }
    }
}