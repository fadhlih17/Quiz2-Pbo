package Number8my;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Display {

    private MainCourse mainCourse = new MainCourse();
    private Drink drink = new Drink();
    private Dissert dissert = new Dissert();
    public Scanner input = new Scanner(System.in);
    public List<Order> orderList = new ArrayList<>();
    public void mainDisplay() {

        while (true) {
            try {
                System.out.flush();
                menu();
                System.out.print("Pilih Katagori Menu : ");
                int category = Integer.parseInt(input.nextLine());

                switch (category) {
                    case 1 -> setMainCourse();
                    case 2 -> setDrink();
                    case 3 -> setDissert();
                    case 4 -> {
                        payment();
                        System.exit(4);
                    }
                    case 0 -> System.exit(0);
                    default -> System.out.println("Angka tidak sesuai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan Angka! ");
            }
        }

    }

    public void menu() {
        System.out.println("""
                ========================================
                            FADHLIH RESTAURANT          |
                 Jl.Galaxy, Bekasi Selatan, Kota Bekasi |
                ========================================|
                Pilihan Menu Transaksi                  |
                ========================================|
                1. MainCourse                           |
                2. Drink                                |
                3. Dissert                              |
                4. Pembayaran                           |
                =========================================
                0. Keluar                               |
                =========================================""");
    }

    public void payment(){
        System.out.println("Jumlah\t\tNama Item\t\tHarga Satuan\tJumlah");
        System.out.println("-------------------------------------------------");
        for (Order order: orderList) {
            System.out.println(order.getItem() + "\t\t\t"+order.getName() + "\t\t" + order.getPrice() + "\t\t\t" +
                    order.getTotal());
        }
        int priceTotal = mainCourse.priceTotal + drink.priceTotal + dissert.priceTotal;

        System.out.println("--------------------------------------------------");
        System.out.println("Jumlah yang harus dibayar : Rp." + priceTotal);
        System.out.print("Uang yang dimasukkan : Rp.");
        int payment = Integer.parseInt(input.nextLine());
        int change = payment - priceTotal;
        System.out.println("Kembalian : Rp." + change);
        System.out.println("Terimakasih atas kunjungannya");
    }

    public void setMainCourse() {
        mainCourse.listMenu();

        int item, choice;
        while (true) {
            System.out.print("Masukkan Pilihan : ");
            choice = Integer.parseInt(input.nextLine());

            if (choice > 0 && choice < 4){
                System.out.print("Masukkan Jumlah : ");
                item = Integer.parseInt(input.nextLine());
                break;
            }
            else {
                System.out.println("Pilihan tidak tersedia");
            }
        }

        mainCourse.listMenu(choice);
        mainCourse.getItem(item);

        boolean loop = true;
        while (loop){
            System.out.print(mainCourse.confirm());
            String confirm = input.nextLine();

            if (confirm.equalsIgnoreCase("y")){
                mainCourse.priceTotal();
                orderList.add(new Order(mainCourse.name, mainCourse.price, mainCourse.item, mainCourse.priceTotal));

                System.out.println("Berhasil ditambah, klik enter di keyboard");
                input.nextLine();
                return;
            }
            if (confirm.equalsIgnoreCase("t")){
                loop = false;
            }
            else {
                System.out.println("Masukkan konfirmasi dengan y/t");
            }
        }
    }

    public void setDrink() {
        drink.listMenu();

        int item, choice;
        while (true) {
            System.out.print("Masukkan Pilihan : ");
            choice = Integer.parseInt(input.nextLine());

            if (choice > 0 && choice <= 4){
                System.out.print("Masukkan Jumlah : ");
                item = Integer.parseInt(input.nextLine());
                break;
            }
            else {
                System.out.println("Pilihan tidak tersedia");
            }
        }

        drink.listMenu(choice);
        drink.getItem(item);

        boolean loop = true;
        while (loop){
            System.out.print(drink.confirm());
            String confirm = input.nextLine();

            if (confirm.equalsIgnoreCase("y")){
                drink.priceTotal();
                orderList.add(new Order(drink.name, drink.price, drink.item, drink.priceTotal));

                System.out.println("Berhasil ditambah, klik enter di keyboard");
                input.nextLine();
                return;
            }
            if (confirm.equalsIgnoreCase("t")){
                loop = false;
            }
            else {
                System.out.println("Masukkan konfirmasi dengan y/t");
            }
        }
    }

    public void setDissert() {
        dissert.listMenu();

        int item, choice;
        while (true) {
            System.out.print("Masukkan Pilihan : ");
            choice = Integer.parseInt(input.nextLine());

            if (choice > 0 && choice < 5){
                System.out.print("Masukkan Jumlah : ");
                item = Integer.parseInt(input.nextLine());
                break;
            }
            else {
                System.out.println("Pilihan tidak tersedia");
            }
        }

        dissert.listMenu(choice);
        dissert.getItem(item);

        boolean loop = true;
        while (loop) {

            System.out.print(dissert.confirm());
            String confirm = input.nextLine();

            if (confirm.equalsIgnoreCase("y")){
                dissert.priceTotal();
                orderList.add(new Order(dissert.name, dissert.price, dissert.item, dissert.priceTotal));

                System.out.println("Berhasil ditambah, klik enter di keyboard");
                input.nextLine();
                loop = false;
            }
            if (confirm.equalsIgnoreCase("t")){
                loop = false;
            }
            else  {
                System.out.println("Masukkan konfirmasi dengan y/t");
            }
        }
    }
}
