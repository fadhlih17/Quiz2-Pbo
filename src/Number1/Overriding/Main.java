package Number1.Overriding;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jari-Jari Tabung : ");
        int jariJari = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Tinggi Tabung : ");
        int tinggi = Integer.parseInt(input.nextLine());

        Tabung tabung = new Tabung();

        tabung.setTinggi(tinggi);
        tabung.setJariJari(jariJari);
        tabung.luasTabung();

        tabung.display();
    }
}
//    Overriding adalah suatu cara untuk mendefinisikan ulang method
//    yang ada pada class induk apabila class anak menginginkan
//        adanya informasi yang lain
