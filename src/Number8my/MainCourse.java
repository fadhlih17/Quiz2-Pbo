package Number8my;

public class MainCourse extends Menu{
    String name;
    int price, item, priceTotal;

    public void listMenu() {
        System.out.println("""
                 ====== Daftar Menu MainCourse ======
                 1. Nasi Goreng   Rp.15000
                 2. Ayam Bakar    Rp.16000
                 3. Ayam Geprek   Rp.14000""");
    }

    public void listMenu(int menuNumber) {
        switch (menuNumber) {
            case 1 -> {
                this.name = "Nasi Goreng";
                price = 15000;
            }
            case 2 -> {
                this.name = "Ayam Bakar";
                price = 16000;
            }
            case 3 -> {
                this.name = "Ayam Geprek";
                price = 14000;
            }
            default -> System.out.println("Pilihan tidak tersedia");
        }
    }

    public void getItem(int item) {
        this.item = item;
    }

    @Override
    public int priceTotal() {
        this.priceTotal = item * price;
        return priceTotal;
    }

    public String confirm(){
        return "Konfirmasi pesanan: " + name + " sebanyak " + item + " porsi (y/t): ";
    }

}
