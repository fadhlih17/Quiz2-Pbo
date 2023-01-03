package Number2;

import java.util.Scanner;

public class Main {
    static Scanner ipt = new Scanner(System.in);
    static String name, numberPhone, address;
    static int total;

    public static void main(String[] args) {

        System.out.println("""
               ==========================================================
               |                   Cikunir YOY Hotel                     |
               |            Sewa Kamar Hotel Murah Terjangkau            |
               ===========================================================""");
        System.out.println();
        System.out.println("""
                Pilih Tipe Kamar :
                1. VIP
                2. Standard""");

        System.out.print("Tipe Kamar yang dipilih :  ");
        int choiceRoom = Integer.parseInt(ipt.nextLine());

        System.out.println("------------------------------------");

        System.out.print("Masukkan Nama : "); name = ipt.nextLine();
        System.out.print("No Hp : "); numberPhone = ipt.nextLine();
        System.out.print("Alamat : "); address = ipt.nextLine();
        System.out.print("Lama Sewa : "); total = Integer.parseInt(ipt.nextLine());

        switch (choiceRoom) {
            case 1 -> vipDisplay();
            case 2 -> standardDisplay();
        }
    }

    public static void vipDisplay() {
        Vip vip = new Vip();

        vip.menu();
        vip.setData(name, numberPhone, address, total);

        System.out.print("Pilih Kamar -> "); int carChoice = Integer.parseInt(ipt.nextLine());

        vip.choose(carChoice);
        vip.cost();
        vip.print();

        System.out.print("Masukkan uang : ");
        int price = Integer.parseInt(ipt.nextLine());

        vip.cost(price);
    }

    public static void standardDisplay() {
        Standard standard = new Standard();

        standard.menu();
        standard.setData(name, numberPhone, address, total);

        System.out.print("Pilih Kamar -> "); int carChoice = Integer.parseInt(ipt.nextLine());

        standard.choose(carChoice);
        standard.cost();
        standard.print();

        System.out.print("Masukkan uang : ");
        int price = Integer.parseInt(ipt.nextLine());

        standard.cost(price);
    }
}
