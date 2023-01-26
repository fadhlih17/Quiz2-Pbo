package Number8my;

public class Dissert extends MainCourse {
    public void listMenu() {
        System.out.println("""
                 ====== Daftar Menu Dissert ======
                 1. Choco White     Rp.12000
                 2. Avocado Cake    Rp.15000
                 3. Brownis         Rp.17000
                 """);
    }

    public void listMenu(int menuNumber) {
        switch (menuNumber) {
            case 1 -> {
                this.name = "Choco White";
                price = 12000;
            }
            case 2 -> {
                this.name = "Avocado Cake";
                price = 15000;
            }
            case 3 -> {
                this.name = "Brownis";
                price = 17000;
            }
            default -> System.out.println("Pilihan tidak tersedia");
        }
    }
}
