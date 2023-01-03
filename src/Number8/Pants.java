package Number8;

public class Pants extends Clothes {

    public void menu() {
        System.out.println("""
                         Daftar List Celana 
                 1. Levi's  -  Rp.150000
                 2. Zara    -  Rp.175000
                 3. Chinos  -  Rp.85000
                 4. Genluis -  Rp.140000""");
    }

    public void menu(int number) {
        switch (number) {
            case 1 :
                this.name = "Levi's";
                price = 150000;
                break;
            case 2:
                this.name = "Zara";
                price = 175000;
                break;
            case 3:
                this.name = "Chinos";
                price = 85000;
                break;
            case 4:
                this.name = "Genluis";
                price = 140000;
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }

    public String message(){
        return "Anda memesan " + name + " sebanyak " + item + " item ";
    }
}
