package Number6;

import java.util.Scanner;

public class Pizza extends Resto{
    Scanner input = new Scanner(System.in);

    @Override
    public void toping() {
        System.out.println("""
                Daftar Toping/Rasa pizza
                1. Meat lovers (Rp.84000)
                2. super supreme (Rp.84000)
                3. American Favourite (Rp.74000)""");

        boolean loop = true;
        while (loop) {
            System.out.print("Toping pilihan anda : ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    toping = "Meat Lovers";
                    biaya += 84000;
                    loop = false;
                }
                case 2 -> {
                    toping = "Super Supreme";
                    biaya += 84000;
                    loop = false;
                }
                case 3 -> {
                    toping = "American Favourite";
                    biaya += 74000;
                    loop = false;
                }
                default -> System.out.println("Pilihan tidak tersedia");
            }
        }
        System.out.println();
    }

    @Override
    public void pinggirian() {
        System.out.println("""
                Daftar pinggiran pizza
                1. Original Crust (+Rp.0)
                2. Stuffed Crust (+Rp.22000)
                3. Sausage Crust (+Rp.22000)
                4. Cheesy Bites (+Rp.32000)""");

        boolean loop = true;
        while (loop) {
            System.out.print("Pinggiran pilihan anda : ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    pinggiran = "Original Crust";
                    loop = false;
                }
                case 2 -> {
                    pinggiran = "Stuffed Crust";
                    biaya += 22000;
                    loop = false;
                }
                case 3 -> {
                    pinggiran = "Sausage crust";
                    biaya += 22000;
                    loop = false;
                }
                case 4 -> {
                    pinggiran = "Cheesy Bites";
                    biaya += 32000;
                    loop = false;
                }
                default -> System.out.println("Pilihan tidak tersedia");
            }
        }
        System.out.println();

    }

    @Override
    public void ukuran() {
        System.out.println("""
                Daftar ukuran pizza
                1. Regular 8 slices (+Rp.0)
                2. Jumbo 10 slices(+Rp.40000)""");

        boolean loop = true;
        while (loop) {
            System.out.print("Ukuran pilihan anda = ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1 -> {
                    ukuran = "Regular 8 slices";
                    loop = false;
                }
                case 2 -> {
                    ukuran = "Jumbo 10 slices";
                    biaya += 40000;
                    loop = false;
                }
                default -> System.out.println("Pilihan tidak tersedia");
            }
        }
        System.out.println();
    }

    @Override
    public void cetakData(String nama) {
        this.nama = nama;
        System.out.println("=============== DATA PESANAN ===============");
        System.out.println("Nama Pemesan = " + nama);
        System.out.printf("Pizza yang dipesan = %s/%s/%s \n", toping, pinggiran, ukuran);
    }

    @Override
    public void cetakTotal() {
        System.out.println("Total biaya = Rp." + biaya);
    }
}
