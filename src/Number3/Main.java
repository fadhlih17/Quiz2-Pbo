package Number3;

public class Main {
    public static void bangunDatar(String name){
        System.out.println("Menghitung luas " + name);
    }

    public static int bangunDatar(int panjang, int lebar){
        return panjang * lebar;
    }

    public static int bangunDatar(int sisi) {
        return (int) Math.pow(sisi,2);
    }

    public static double bangunDatar(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }
    public static void main(String[] args) {

        String name = "Persegi Panjang";
        int panjang = 25;
        int lebar = 8;

        bangunDatar(name);
        int luas = bangunDatar(panjang,lebar);
        System.out.printf("Luas dengan panjang %d dan lebar %d = %d cm", panjang, lebar, luas);
    }
}
