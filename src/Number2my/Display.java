package Number2my;
import java.util.Scanner;

public class Display {
    Scanner input = new Scanner(System.in);
    String name, numberPhone, address;
    int rent;

    public void display() {

        System.out.println("""
               ==========================================================
               |               Selamat Datang di Ind rent                |
               |           Silahkan sewa kendaraan sampai puas           |
               ===========================================================""");
        System.out.println();
        System.out.println("""
                Pilih Kendaraan :
                1. Mobil
                2. Motor""");

        System.out.print("Masukkan pilihan (dengan angka) -> ");
        int choiceVehicle = Integer.parseInt(input.nextLine());

        System.out.println("------------------------------------");

        switch (choiceVehicle) {
            case 1 -> carDisplay();
            case 2 -> motorbikeDisplay();
        }
    }

    public void carDisplay() {
        Car car = new Car();
        car.menu();
        System.out.print("Pilih Mobil -> "); int carChoice = Integer.parseInt(input.nextLine());

        car.choose(carChoice);

        System.out.print("Masukkan Nama : "); name = input.nextLine();
        System.out.print("No Hp : "); numberPhone = input.nextLine();
        System.out.print("Alamat : "); address = input.nextLine();
        System.out.print("Sewa Hari : "); rent = Integer.parseInt(input.nextLine());

        car.setData(name, numberPhone, address, rent);
        car.cost();
        car.print();

        System.out.print("Masukkan uang : Rp.");
        int price = Integer.parseInt(input.nextLine());

        car.cost(price);
    }

    public void motorbikeDisplay() {
        Motorbike motorbike = new Motorbike();

        motorbike.menu();
        System.out.print("Pilih Motor -> "); int carChoice = Integer.parseInt(input.nextLine());
        motorbike.choose(carChoice);

        System.out.print("Masukkan Nama : "); name = input.nextLine();
        System.out.print("No Hp : "); numberPhone = input.nextLine();
        System.out.print("Alamat : "); address = input.nextLine();
        System.out.print("Sewa Hari : "); rent = Integer.parseInt(input.nextLine());

        motorbike.setData(name, numberPhone, address, rent);
        motorbike.cost();
        motorbike.print();

        System.out.print("Masukkan uang : Rp.");
        int price = Integer.parseInt(input.nextLine());

        motorbike.cost(price);
    }
}
