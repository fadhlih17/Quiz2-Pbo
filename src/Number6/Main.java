package Number6;
import java.util.Scanner;

public class Main extends Pizza{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pizza pizza = new Pizza();

        title();
        System.out.print("Nama Pemesan : ");
        String nama = input.nextLine();
        System.out.println();

        pizza.toping();
        pizza.pinggirian();
        pizza.ukuran();
        pizza.cetakData(nama);
        pizza.cetakTotal();

    }

    public static void title() {
        System.out.println("""
                ---------------------------------------------------
                                   PIZZA MOTARU
                             Terkenal sejak Tahun 1988
                ---------------------------------------------------\040""");
        System.out.println("Input Data Pesanan ");
    }
}
