package Number8my;

public class Drink extends MainCourse {

    public void listMenu() {
        System.out.println("""
                 ====== Daftar Menu Minuman ======
                 1. Jus Alpukat          Rp.9000
                 2. Es Jeruk             Rp.7000
                 3. Es Teh Manis         Rp.5000
                 4. Air Mineral          Rp.3000""");
    }

    public void listMenu(int menuNumber) {
        switch (menuNumber) {
            case 1 -> {
                this.name = "Jus Alpukat";
                price = 9000;
            }
            case 2 -> {
                this.name = "Es Jeruk";
                price = 7000;
            }
            case 3 -> {
                this.name = "Es Teh Manis";
                price = 5000;
            }
            case 4 -> {
                this.name = "Air Mineral";
                price = 3000;
            }
            default -> System.out.println("Pilihan tidak tersedia");
        }
    }

    public String confirm(){
        return "konfirmasi pesanan: " + name + " sebanyak " + item + " gelas (y/t) : ";
    }
}
