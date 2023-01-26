package Number2my;
public class Car extends Vehicle{
    String carName;
    int price, totalPrice;
    @Override
    public void menu() {
        System.out.println("""
                Pilihan Mobil
                1. Innova (Rp 400,000)
                2. Xenia  (Rp 300,000)
                3. Avanza (Rp 325,000)
                4. Luxio  (Rp 450,000)""");
    }

    public void choose (int choice) {

        switch (choice) {
            case 1 -> {
                carName = "Innova";
                price = 400000;
            }
            case 2 -> {
                carName = "Xenia";
                price = 300000;
            }
            case 3 -> {
                carName = "Avanza";
                price = 325000;
            }
            case 4 -> {
                carName = "Luxio";
                price = 450000;
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
        System.out.println("Kendaraan : Mobil " + carName);
        System.out.println("Total biaya sewa : Rp " + totalPrice);
        System.out.println("===============");
    }

    void cost(int payment) {
        System.out.println("===============");
        System.out.println("Kembalian : Rp " + (payment - totalPrice));
    }

}
