package Number8;

import java.util.Scanner;

public class Main {
    private static Clothes clothes = new Clothes();
    private static Pants pants = new Pants();
    private static Jacket jacket = new Jacket();
    public static Scanner ipt = new Scanner(System.in);

    public static void main(String[] args) {

        boolean loop = true;
        while (loop) {

            menu();
            System.out.print("Pilih Katagori Menu : ");
            int category = Integer.parseInt(ipt.nextLine());

            switch (category){
                case 1 :
                    printClothes();
                    break;
                case 2 :
                    printPants();
                    break;
                case 3 :
                    printJacket();
                    break;
                case 4 :
                    payment();
                    System.exit(0);
                    break;
                case 0 :
                    System.exit(0);
            }
        }
    }
    public static void menu() {

        System.out.println("""
                ===== Fadhlih Store =====
                Pilihan Menu
                1. Clothes
                2. Pants
                3. Jacket
                ===============================
                4. Pembayaran
                ===============================
                0. Keluar
                ===============================""");
    }

    public static void payment(){

        int priceTotal = clothes.priceTotal + pants.priceTotal + jacket.priceTotal;
        System.out.println("Jumlah yang harus dibayar : Rp." + priceTotal);
        System.out.print("Uang yang dimasukkan : Rp.");
        int payment = Integer.parseInt(ipt.nextLine());
        int change = payment - priceTotal;
        System.out.println("Kembalian : Rp." + change);
    }

    public static void printClothes() {
        clothes.menu();
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(ipt.nextLine());

        System.out.print("Masukkan Jumlah : ");
        int item = Integer.parseInt(ipt.nextLine());

        clothes.menu(pilihan);
        clothes.getItem(item);

        System.out.println(clothes.message());
        clothes.priceTotal();
        System.out.println("Klik enter untuk melanjutkan");
        ipt.nextLine();

    }

    public static void printPants() {
        pants.menu();
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(ipt.nextLine());

        System.out.print("Masukkan Jumlah : ");
        int item = Integer.parseInt(ipt.nextLine());

        pants.menu(pilihan);
        pants.getItem(item);

        System.out.println(pants.message());
        pants.priceTotal();
        System.out.println("Klik enter untuk melanjutkan");
        ipt.nextLine();
    }

    public static void printJacket() {
        jacket.menu();
        System.out.print("Masukkan Pilihan : ");
        int pilihan = Integer.parseInt(ipt.nextLine());

        System.out.print("Masukkan Jumlah : ");
        int item = Integer.parseInt(ipt.nextLine());

        jacket.menu(pilihan);
        jacket.getItem(item);

        System.out.println(jacket.message());
        jacket.priceTotal();
        System.out.println("Klik enter untuk melanjutkan");
        ipt.nextLine();
    }
}
