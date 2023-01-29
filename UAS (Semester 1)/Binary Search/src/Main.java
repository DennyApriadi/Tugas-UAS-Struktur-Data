import java.util.Scanner;

public class Main {

    static void swap (int [] arr) {
        int newData,tukar;

        for (int i=0; i<arr.length; i++) {
            newData = i;
            for(int j=i; j<arr.length; j++) {
                if (arr[j] < arr[newData]) {
                    newData = j;
                }
            }
            tukar = arr[i];
            arr[i] = arr[newData];
            arr[newData] = tukar;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] data = {2,4,1,23,-1,40,22,-23,24,0,86,32,45,40,27};
        boolean ketemu = false;
        swap(data);

        System.out.print("\nData Yang Ingin Dicari\t: ");
        int cari = input.nextInt();
        System.out.print("\n");




        for (int i=0; i<data.length; i++) {
            if (cari == data[i]){
                ketemu = true;
                if (ketemu) {
                    System.out.println("Data Ditemukan");
                    break;
                }
            }
        }

        if (!ketemu) {
            System.out.println("Data Tidak Ditemukan");
        }
    }

}