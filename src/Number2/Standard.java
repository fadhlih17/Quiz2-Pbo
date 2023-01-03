package Number2;

public class Standard extends Room {
    String standardName;
    int price, totalPrice;

    @Override
    public void menu() {
        System.out.println("""
                Pilihan Kamar Standard
                1. Single Bed    (Rp 75,000)
                2. Double Bed    (Rp 125,000)
                3. Triple Bed    (Rp 175,000)""");
    }

    public void choose (int choice) {

        switch (choice) {
            case 1 -> {
                standardName = "Single Bed";
                price = 75000;
            }
            case 2 -> {
                standardName = "Double Bed";
                price = 125000;
            }
            case 3 -> {
                standardName = "Triple Bed";
                price = 175000;
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
        System.out.println("Tipe Kamar Standard : " + standardName);
        System.out.println("Total pembayaran : Rp " + totalPrice);
        System.out.println("===============");
    }

    void cost(int payment) {
        System.out.println("===============");
        System.out.println("Kembalian : Rp " + (payment - totalPrice));
    }
}
