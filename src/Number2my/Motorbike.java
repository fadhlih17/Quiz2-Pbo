package Number2my;

public class Motorbike extends Vehicle {
    String motorbikeName;
    int price, totalPrice;

    @Override
    public void menu() {
        System.out.println("""
                Pilihan Motor
                1. Yamaha Nmax  (Rp 125,000)
                2. Honda PCX    (Rp 125,000)
                3. Honda Scoopy (Rp 75,000)
                4. Honda Beat   (Rp 60,000)""");
    }

    public void choose (int choice) {

        switch (choice) {
            case 1 -> {
                motorbikeName = "Yamaha Nmax";
                price = 125000;
            }
            case 2 -> {
                motorbikeName = "Honda PCX";
                price = 125000;
            }
            case 3 -> {
                motorbikeName = "Honda Scoopy";
                price = 75000;
            }
            case 4 -> {
                motorbikeName = "Honda Beat";
                price = 60000;
            }
            default -> System.out.println("Pilihan tidak tersedia");
        }
    }

    @Override
    public void cost() {
        totalPrice = (price * longRent);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Kendaraan : Motor " + motorbikeName);
        System.out.println("Total biaya sewa : Rp " + totalPrice);
        System.out.println("===============");
    }

    void cost(int payment) {
        System.out.println("===============");
        System.out.println("Kembalian : Rp " + (payment - totalPrice));
    }
}
