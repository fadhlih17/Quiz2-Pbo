package Number2;

public class Vip extends Room {

    String vipName;
    int price, totalPrice;
    @Override
    public void menu() {
        System.out.println("""
                Pilihan Mobil
                1. Single Bed    (Rp 150,000)
                2. Double Bed    (Rp 275,000)
                3. Triple Bed    (Rp 400,000)""");
    }

    public void choose (int choice) {

        switch (choice) {
            case 1 -> {
                vipName = "Single Bed";
                price = 150000;
            }
            case 2 -> {
                vipName = "Double Bed";
                price = 275000;
            }
            case 3 -> {
                vipName = "Triple Bed";
                price = 400000;
            }
            default -> System.out.println("Pilihan tidak tersedia");
        }
    }

    @Override
    public void cost() {
        totalPrice = (price * total);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tipe Kamar VIP " + vipName);
        System.out.println("Total biaya sewa : Rp " + totalPrice);
        System.out.println("===============");
    }

    void cost(int payment) {
        System.out.println("===============");
        System.out.println("Kembalian : Rp " + (payment - totalPrice));
    }

}
