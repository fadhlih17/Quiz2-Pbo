package Number1.Abstract;

public class Main {
    public static void main(String[] args) {

        PersegiPanjang persegiPanjang = new PersegiPanjang();

        int a = 20;
        int b = 15;
        persegiPanjang.setLuas(a,b);
        persegiPanjang.setKeliling(a, b);
        persegiPanjang.printHasil();
    }
}
