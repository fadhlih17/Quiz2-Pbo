package Number8;

public class Clothes extends Menu{
    String name;
    int price, item, priceTotal;

    public void menu() {
         System.out.println("""
                       Daftar List Clothes 
                 1. Uniqlo     -  Rp.150000
                 2. Balenciaga -  Rp.160000
                 3. Nevada     -  Rp.120000""");
     }

     public void menu(int number) {
         switch (number) {
             case 1 :
                 this.name = "Uniqlo";
                 price = 150000;
                 break;
             case 2:
                 this.name = "Balenciaga";
                 price = 160000;
                 break;
             case 3:
                 this.name = "Nevada";
                 price = 120000;
                 break;
             default:
                 System.out.println("Pilihan tidak tersedia");
                 break;
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

    public String message(){
        return "Anda Memesan " + name + " sebanyak " + item + " item ";
    }

}
