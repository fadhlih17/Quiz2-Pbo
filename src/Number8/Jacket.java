package Number8;

public class Jacket extends Clothes {
    public void menu() {
        System.out.println("""
                       Daftar List Jaket
                 1. Jaket Sport  -  Rp.175000
                 2. Jaket Bomber -  Rp.150000
                 3. Jaket Kulit  -  Rp.200000
                 """);
    }

    public void menu(int number) {
        switch (number) {
            case 1 :
                this.name = "Jaket Sport";
                price = 175000;
                break;
            case 2:
                this.name = "Jaket Bomber";
                price = 150000;
                break;
            case 3:
                this.name = "Jaket Kulit";
                price = 200000;
                break;
            default:
                System.out.println("Tidak ada pilihan");
                break;
        }
    }
    public String message(){
        return "Anda memesan " + name + " sebanyak " + item + " item ";
    }
}
